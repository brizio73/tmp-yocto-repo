DESCRIPTION = "ZeroMQ looks like an embeddable networking library but acts like a concurrency framework"
HOMEPAGE = "http://www.zeromq.org"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=ad8c3bd15d88ea9d4509fc89bebc915c"

PR = "r0"

#DEPENDS += "util-linux-ng"

S = "${WORKDIR}/zeromq-${PV}"

SRC_URI = "http://download.zeromq.org/zeromq-${PV}.tar.gz"

inherit autotools pkgconfig

SRC_URI[md5sum] = "39af2d41e3fb744b98d7999e291e05dc"
SRC_URI[sha256sum] = "df96a141c85b65c2cb6c0db22223126623a09eecbfccb7f74400f3f938742f59"

