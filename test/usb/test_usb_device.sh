#!/bin/bash

echo "USB device test"

par=1
dev=

if [ -z $1 ]; then
	echo "Error: no device"
	exit 1
else
	dev=${1}${par}
	echo "Testing device $dev"
fi

echo "mounting $dev to a local mountpoint..."

mkdir mountpoint &> /dev/null

mount $dev mountpoint
if [ 0 -ne $? ]; then
	echo "Error: unable to mount $dev"
	exit 1
fi

mkdir ./mountpoint/tmpusbtest
if [ 0 -ne $? ]; then
	echo "Warning: unable to create ./mountpoint/tmpusbtest (directory exists?)"
fi

teststring="Tanto va la gatta al lardo che ci lascia lo zampino"

echo $teststring > ./mountpoint/tmpusbtest/test.txt
if [ 0 -ne $? ]; then
	echo "Error: unable write to ./mountpoint/tmpusbtest/test.txt"
	exit 1
fi

readtext=`cat ./mountpoint/tmpusbtest/test.txt`
if [ "$readtext" != "$teststring" ]; then
	echo "Error: written data do not match read data"
	exit 1
fi

umount mountpoint
if [ 0 -ne $? ]; then
	echo "Error: unable to unmount $dev"
	exit 1
else
	echo "$dev unmounted"
fi

rm -rf ./mountpoint
echo "*** USB test on $dev OK"
