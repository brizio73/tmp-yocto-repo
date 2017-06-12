LICENSE = "GPLv3"
PR = "r2"

SRC_URI = "http://www.tildeslash.com/monit/dist/monit-${PV}.tar.gz"
LIC_FILES_CHKSUM = "file://COPYING;md5=8f2057d797dcf340e16719314cfd69b2" 

inherit autotools

EXTRA_OECONF = "--disable-largefile --without-ssl --without-pam --without-largefiles libmonit_cv_setjmp_available=yes libmonit_cv_vsnprintf_c99_conformant=yes"

SRC_URI[md5sum] = "16f3809a27fb1d40156e7ad275460645"
SRC_URI[sha256sum] = "dbe4b4744a7100e2d5f4eac353dfb2df0549848e2c7661d9c19acc31cdef2c78"
