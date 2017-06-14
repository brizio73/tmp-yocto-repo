DESCRIPTION = "Ragel compiles executable finite state machines from regular languages." 
HOMEPAGE = "http://www.colm.net/open-source/ragel/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=7608a988a3d5cbe1f211ac57ed09d30a"

SRC_URI = "http://www.colm.net/files/ragel/ragel-${PV}.tar.gz \
           "

SRC_URI[md5sum] = "0c3110d7f17f7af4d9cb774443898dc1"
SRC_URI[sha256sum] = "6e07be0fab5ca1d9c2d9e177718a018fc666141f594a5d6e7025658620cf660a"

inherit autotools

BBCLASSEXTEND += "nativesdk"
