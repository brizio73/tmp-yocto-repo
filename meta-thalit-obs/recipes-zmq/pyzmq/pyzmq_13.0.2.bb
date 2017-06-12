DESCRIPTION = "python binding for zeromq" 
SECTION = "devel/python" 
LICENSE = "LGPL|BSD" 
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=7dafa96802798376551b9520ae6cb027"
HOMEPAGE = "http://www.zeromq.org/bindings:python" 
DEPENDS = "python libzmq" 

SRC_URI = "https://pypi.python.org/packages/source/p/pyzmq/pyzmq-${PV}.tar.gz"


#0001-Fixed-just-zmq-detection.patch 


SRC_URI[md5sum] = "49b1a8b858693522730225e3dc2a0910"
SRC_URI[sha256sum] = "b6792222d953b1a9844335439b0288e09a2ba10d33828e78282359267abbe58b"

DISTUTILS_BUILD_ARGS += "--verbose --zmq=${STAGING_DIR_HOST}${prefix}"

RDEPENDS_${PN} = " \
                    python \
                   libzmq \
                 "

PR = "r1"

inherit distutils
