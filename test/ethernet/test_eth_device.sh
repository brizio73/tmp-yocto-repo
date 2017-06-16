#!/bin/bash

echo "Ethernet device test"


if [ -z $1 ]; then
	echo "Error: no destination"
	echo "Usage: test_eth_device.sh user@host:path"
	exit 1
else
	dev=${1}${par}
	echo "Testing device $dev"
fi

user=`echo "$1" | grep -oE "^[[:alnum:]]*"`
host=`echo "$1" | grep -oE "([0-9]{1,3}\.){3}([0-9]{1,3})"`
path=`echo "$1" | grep -oE "(/[[:alnum:]]*)*$"`

echo "user $user"
echo "host $host"
echo "path $path"


echo "Pinging $host..."

ping -c 1 $host
if [ 0 -ne $? ]; then
	echo "Error: $host unreachable"
	exit 1
fi


teststring="Tanto va la gatta al lardo che ci lascia lo zampino"
echo "$teststring" > tmp.txt
scp tmp.txt $1

if [ 0 -ne $? ]; then
	echo "Error: unable send data to $1"
	exit 1
fi

scp $1/tmp.txt ./tmp_read.txt
if [ 0 -ne $? ]; then
	echo "Error: unable to get data from $1"
	exit 1
fi

readtext=`cat tmp_read.txt`
if [ "$readtext" != "$teststring" ]; then
	echo "Error: written data do not match read data"
	exit 1
fi


rm -rf ./tmp_read.txt
echo "*** ETH test on $host OK"
