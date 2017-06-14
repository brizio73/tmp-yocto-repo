LICENSE = "AGPL-3.0"
PR = "r2"

SRC_URI = "http://www.tildeslash.com/monit/dist/monit-${PV}.tar.gz"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea116a7defaf0e93b3bb73b2a34a3f51" 

inherit autotools

EXTRA_OECONF = "--disable-largefile --without-ssl --without-pam --without-largefiles libmonit_cv_setjmp_available=yes libmonit_cv_vsnprintf_c99_conformant=yes"

SRC_URI[md5sum] = "19dfc1ce8512e832134d06eedd96ba50"
SRC_URI[sha256sum] = "38e09bd8b39abc59e6b9a9bb7a78f7eac2b02a92f4de1f3a6dc24e84dfedae0d"

