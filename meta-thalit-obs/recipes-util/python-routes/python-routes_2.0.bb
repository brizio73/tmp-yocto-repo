DESCRIPTION = "Python Routes" 
SECTION = "devel/python" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"
HOMEPAGE = "http://routes.readthedocs.org/en/latest/index.html"
DEPENDS = "python" 

inherit setuptools

#INSANE_SKIP_${PN} = "installed-vs-shipped "

SRC_URI[md5sum] = "b97b1b8016d663d1000a0e0b50656c54"
SRC_URI[sha256sum] = "6e4eb6437a9def22e1344ee8f766d7795bedfe6f615d3ea138e4035d6fbd33f8"

S = "${WORKDIR}/Routes-${PV}"

PACKAGES =+ "${PN}-examples"
FILES_${PN}-examples =+ "/usr/share"

SRC_URI = "https://pypi.python.org/packages/source/R/Routes/Routes-2.0.tar.gz"

PR = "r1"

