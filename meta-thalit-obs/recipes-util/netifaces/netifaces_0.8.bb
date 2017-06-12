DESCRIPTION = "netifaces" 
SECTION = "devel/python" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=a53cbc7cb75660694e138ba973c148df"
HOMEPAGE = "http://alastairs-place.net/projects/netifaces/" 
DEPENDS = "python" 

SRC_URI = "http://alastairs-place.net/projects/netifaces/netifaces-0.8.tar.gz"
SRC_URI[md5sum] = "e57e5983f4c286fac5f8068fbfc5c873"
SRC_URI[sha256sum] = "53a711038db3d6e5cf7129d6f751185fd052f830f12f271fbfe17bd2671ab1ec"

inherit setuptools
