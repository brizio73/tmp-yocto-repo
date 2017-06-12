SUMMARY = "A Modbus library"
DESCRIPTION = "libmodbus is a C library designed to provide a fast and robust \
implementation of the Modbus protocol. It runs on Linux, Mac OS X, FreeBSD, \
QNX and Windows."
HOMEPAGE = "http://www.libmodbus.org/"
SECTION = "libs"

LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"

SRC_URI = "http://github.com/stephane/${BPN}/archive/v${PV}.tar.gz"

inherit autotools pkgconfig

SRC_URI[md5sum] = "5f717ab229a35cae60d2cfc3267405f0"
SRC_URI[sha256sum] = "1ec02141952a8291fec4c7c6cfeabfdab1237ffa69a803a415b1d9486957cdf1"
