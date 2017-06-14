#!/bin/bash

#copy kernel module to specified directory
mkdir -p /lib/modules/`uname -r`/kernel/drivers/usb/serial/
cp GobiSerial.ko /lib/modules/`uname -r`/kernel/drivers/usb/serial/
depmod

#nstall kernel module
insmod GobiSerial.ko

#configure loading statement
cp /etc/init.d/customized.sh /etc/init.d/customized.sh.ori
sed 's:exit 0:insmod \/lib\/modules\/4.1.8-yocto-standard\/kernel\/drivers\/usb\/serial\/GobiSerial.ko\n\nexit 0:' /etc/init.d/customized.sh.ori > /etc/init.d/customized.sh
rm -f /etc/init.d/customized.sh.ori

echo "Install GobiSerial.ko successfully."
