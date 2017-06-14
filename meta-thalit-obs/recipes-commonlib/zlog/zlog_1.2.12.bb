DESCRIPTION = "zlog"
HOMEPAGE = "https://github.com/HardySimpson/zlog"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

PR = "r1"

S = "${WORKDIR}/${PN}-${PV}"

SRC_URI = "https://github.com/HardySimpson/zlog/archive/${PV}.tar.gz \
                  file://add_rotate.patch \
                  "

CFLAGS_prepend = " -D_DEFAULT_SOURCE"

#1.2.12
SRC_URI[md5sum] = "ae9b7ede5cf3a62c3092bacf37f70de4"
SRC_URI[sha256sum] = "9c6014a3f74d136c70255539beba11f30e1d3617d07ce7ea917b35f3e52bac20"


do_install () {
   oe_runmake install PREFIX="${D}${prefix}"
}
