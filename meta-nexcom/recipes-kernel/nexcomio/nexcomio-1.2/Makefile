#KERNEL_SRC	:= $(SDKTARGETSYSROOT)/usr/src/kernel
#KERNEL_SRC	:= /home/hideojr/WORK_AREA/VTC6210-RA/bsp/Yocto/genericx86-64-jethro-14.0.0/build/tmp/work/genericx86_64-poky-linux/linux-yocto/4.1.8+gitAUTOINC+aed9021602_dbe692d91c-r0/linux-genericx86_64-standard-build
PWD 		:= $(shell pwd)

obj-m := NEXCOM_IO.o

all:
	$(MAKE) -C $(KERNEL_SRC) M=$(PWD) modules

clean:
	$(MAKE) -C $(KERNEL_SRC) M=$(PWD) clean

modules_install:
	$(MAKE) -C $(KERNEL_SRC) M=$(PWD) modules_install
