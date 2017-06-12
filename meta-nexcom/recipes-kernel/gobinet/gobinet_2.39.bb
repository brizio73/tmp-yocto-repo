SUMMARY = "Gobinet module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module

SRC_URI= " \
         file://GobiUSBNet.c \
         file://gobi_usbnet.h \
         file://Makefile \
         file://QMI.c \
         file://QMIDevice.c \
         file://QMIDevice.h \
         file://QMI.h \
         file://Structs.h \
         file://usbnet_2_6_32.c \
         file://usbnet_2_6_35.c \
         file://usbnet_3_0_6.c \
         file://usbnet_3_10_21.c \
         file://usbnet_3_12_xx.c \
         file://usbnet_4_4_xx.c"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "(genericx86-64)"
