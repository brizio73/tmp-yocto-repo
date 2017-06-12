PWD 		:= $(shell pwd)

obj-m := GobiNet.o
GobiNet-objs := GobiUSBNet.o QMIDevice.o QMI.o usbnet_2_6_32.o usbnet_3_0_6.o \
	        usbnet_2_6_35.o usbnet_3_10_21.o usbnet_3_12_xx.o usbnet_4_4_xx.o
#GobiNet-objs := GobiUSBNet.o QMIDevice.o QMI.o usbnet_4_4_xx.o

all:
	$(MAKE) -C $(KERNEL_SRC) M=$(PWD) modules

clean:
	$(MAKE) -C $(KERNEL_SRC) M=$(PWD) clean

modules_install:
	$(MAKE) -C $(KERNEL_SRC) M=$(PWD) modules_install
