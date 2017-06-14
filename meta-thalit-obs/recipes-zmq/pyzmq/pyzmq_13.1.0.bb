DESCRIPTION = "python binding for zeromq" 
SECTION = "devel/python" 
LICENSE = "LGPL|BSD" 
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=7dafa96802798376551b9520ae6cb027"
HOMEPAGE = "http://www.zeromq.org/bindings:python" 
DEPENDS = "python libzmq" 

SRC_URI = "https://pypi.python.org/packages/source/p/pyzmq/pyzmq-${PV}.tar.gz file://ver_3.2.3.patch"


SRC_URI[md5sum] = "b54a2209a4efed93ed00282d949db8d9"
SRC_URI[sha256sum] = "8e6fbe2999204456216a2da62429277117ed1761326bce00e48a0443ae3574a7"

#DISTUTILS_BUILD_ARGS += "--verbose --zmq=${STAGING_DIR_HOST}${prefix}"
#DISTUTILS_BUILD_ARGS += "--verbose"

RDEPENDS_${PN} = "python libzmq"

PR = "r1"

inherit distutils
