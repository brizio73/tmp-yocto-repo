LICENSE = "GPLv3"
PR = "r2"

SRC_URI = "http://www.tildeslash.com/monit/dist/monit-${PV}.tar.gz"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f2057d797dcf340e16719314cfd69b2" 

inherit autotools

EXTRA_OECONF = "--disable-largefile --without-ssl --without-pam --without-largefiles libmonit_cv_setjmp_available=yes libmonit_cv_vsnprintf_c99_conformant=yes"

SRC_URI[md5sum] = "f1f391241d44059d0d3e5d26f4ec5ddf"
SRC_URI[sha256sum] = "805c6545de2dd7f3d9e6e0c68018b2aadd5fc98b243c8868178f247a60906038"
