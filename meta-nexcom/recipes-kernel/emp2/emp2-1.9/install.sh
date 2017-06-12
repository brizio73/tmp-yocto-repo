#!/bin/bash

#copy kernel module to specified directory
cp xr17v35x.ko /lib/modules/`uname -r`/kernel/drivers/char/
depmod -a

#install kernel module
#insmod xr17v35x.ko

#configure loading statement
cp /etc/init.d/customized.sh /etc/init.d/customized.sh.ori
#sed 's:exit 0:insmod \/lib\/modules\/4.1.8-yocto-standard\/kernel\/drivers\/char\/xr17v35x.ko\n\nexit 0:' /etc/init.d/customized.sh.ori > /etc/init.d/customized.sh
sed 's:exit 0:\/usr\/sbin\/emp2init\n\nexit 0:' /etc/init.d/customized.sh.ori > /etc/init.d/customized.sh
rm -f /etc/init.d/customized.sh.ori

echo "Install xr17v35x.ko successfully and restart the system."
