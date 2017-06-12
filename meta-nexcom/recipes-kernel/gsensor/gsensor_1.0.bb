SUMMARY = "G-sensor module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

inherit module

SRC_URI= " \
         file://Makefile \
         file://NEXCOM_SMBus.c"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "(genericx86-64)"

KERNEL_MODULE_AUTOLOAD += "NEXCOM_SMBus"
