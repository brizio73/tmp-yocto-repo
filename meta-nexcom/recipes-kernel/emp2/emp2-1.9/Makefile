PWD 		:= $(shell pwd)

obj-m 		:= xr17v35x.o
xrpci-objs 	:= xr17v35x.o

all:
	$(MAKE) -C $(KERNEL_SRC) SUBDIRS=$(PWD) modules

clean:
	$(MAKE) -C $(KERNEL_SRC) SUBDIRS=$(PWD) clean

modules_install:
	$(MAKE) -C $(KERNEL_SRC) SUBDIRS=$(PWD) modules_install
