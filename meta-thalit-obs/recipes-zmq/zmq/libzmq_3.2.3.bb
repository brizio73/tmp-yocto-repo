DESCRIPTION = "ZeroMQ looks like an embeddable networking library but acts like a concurrency framework"
HOMEPAGE = "http://www.zeromq.org"
LICENSE = "LGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=ad8c3bd15d88ea9d4509fc89bebc915c"

PR = "r0"

#DEPENDS += "util-linux-ng"

S = "${WORKDIR}/zeromq-${PV}"

SRC_URI = "http://download.zeromq.org/zeromq-${PV}.tar.gz"

inherit autotools pkgconfig

SRC_URI[md5sum] = "1abf8246363249baf5931a065ee38203"
SRC_URI[sha256sum] = "e134c1aaf829dd77bca9dc0fa199ba31095a581bd0d3dda5fc59523b9f401238"
