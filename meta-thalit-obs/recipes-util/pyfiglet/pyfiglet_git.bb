DESCRIPTION = "pyfiglet" 
SECTION = "devel/python" 
LICENSE = "GPL" 
LIC_FILES_CHKSUM = "file://LICENSE;md5=a17cb0a873d252440acfdf9b3d0e7fbf"
HOMEPAGE = "https://github.com/pwaller/pyfiglet" 
DEPENDS = "python" 

SRCREV = "e3f1e954a8b8d9988e67931cd1a722b63ad7bd31"
SRC_URI = "git://github.com/pwaller/pyfiglet.git"

S = "${WORKDIR}/git"

inherit setuptools
