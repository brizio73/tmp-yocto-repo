#!/bin/bash

echo "Wireless LAN device test"


if [ -z $1 ]; then
	echo "Error: no destination"
	echo "Usage: test_wlan_device.sh <interface>"
	exit 1
fi

echo "Bringing down all eth interfaces..."
ethinterfaces=`ifconfig | grep -oE "eth[0-9]"`
for i in $ethinterfaces; do
	ifconfig $i down
done

echo "Scanning wireless networks..."

ifconfig $1 | grep "UP"
if [ 0 -ne $? ]; then
	ifconfig $1 up
fi

netlist=`iwlist $1 scan | grep "SSID"`
if [ 0 -ne $? ]; then
	echo "Error: cannot scan"
	exit 1
fi
echo $netlist
echo -ne "Pick one: "
read network
echo -ne "Passphrase: "
read password

echo "Connecting..."
sed "s/<network>/$network/g" wpa_supplicant.vanilla.conf > wpa_supplicant.conf.temp
sed "s/<passphrase>/$password/g" wpa_supplicant.conf.temp > wpa_supplicant.conf
wpa_supplicant -B -D wext -i $1 -c wpa_supplicant.conf 
if [ 0 -ne $? ]; then
	echo "Error: unable to connect"
	echo "network: $network"
	echo "passphrase:  $password"
	echo "interface: $1"
	exit 1
fi

sleep 5
iwconfig $1 | grep "$network"
if [ 0 -ne $? ]; then
	echo "Error: unable to connect to $network"
	exit 1
fi


echo "Getting IP address"
udhcpc -i $1 > /dev/null

ping -c 4 8.8.8.8
if [ 0 -ne $? ]; then
	echo "Error: no Internet access (unable to ping 8.8.8.8)"
	exit 1
fi

echo "*** ETH test on $host OK"

kill -9 `pidof wpa_supplicant`
ifconfig $1 0.0.0.0
ifconfig $1 down
ifconfig $1 up
rm wpa_supplicant.conf
rm wpa_supplicant.conf.temp

for i in $ethinterfaces; do
	ifconfig $i up
done
