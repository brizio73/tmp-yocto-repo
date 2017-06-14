#!/bin/bash

#copy kernel module to specified directory
mkdir -p /lib/modules/`uname -r`/kernel/drivers/net/usb/
cp GobiNet.ko /lib/modules/`uname -r`/kernel/drivers/net/usb/
depmod 

#install kernel module
insmod GobiNet.ko

#configure loading statement
cp /etc/init.d/customized.sh /etc/init.d/customized.sh.ori
sed 's:exit 0:insmod \/lib\/modules\/4.1.8-yocto-standard\/kernel\/drivers\/net\/usb\/GobiNet.ko\n\nexit 0:' /etc/init.d/customized.sh.ori > /etc/init.d/customized.sh
rm -f /etc/init.d/customized.sh.ori

echo "Install GobiNet.ko successfully."
