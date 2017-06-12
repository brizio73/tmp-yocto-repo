DESCRIPTION = "CherryPy" 
SECTION = "devel/python" 
LICENSE = "BSD" 
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=d7dd4b0d1f7153322a546e89b5a0a632"
HOMEPAGE = "http://cherrypy.readthedocs.org/en/latest/index.html"
DEPENDS = "python" 

inherit setuptools

#INSANE_SKIP_${PN} = "installed-vs-shipped "

SRC_URI[md5sum] = "9099b32cdd91271480ee6544ba9e5043"
SRC_URI[sha256sum] = "235558a39e5a48933382dfa3eb1411a1e47b2150764c13a4999fd728acce774f"

PACKAGES =+ "${PN}-examples"
FILES_${PN}-examples =+ "/usr/share"

S = "${WORKDIR}/CherryPy-${PV}"

SRC_URI = "https://pypi.python.org/packages/source/C/CherryPy/CherryPy-3.5.0.tar.gz"

PR = "r1"

