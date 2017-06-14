LICENSE = "AGPL-3.0"
PR = "r3"

SRC_URI = "http://www.tildeslash.com/monit/dist/monit-${PV}.tar.gz"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea116a7defaf0e93b3bb73b2a34a3f51" 

inherit autotools-brokensep

EXTRA_OECONF = "--disable-largefile --without-ssl --without-pam --without-largefiles libmonit_cv_setjmp_available=yes libmonit_cv_vsnprintf_c99_conformant=yes"

SRC_URI[md5sum] = "6918ed7411a244c9e158f5e54c86be78"
SRC_URI[sha256sum] = "f71a22cfb6bd91ff46496e72e1d1b1021ecd651e7748131ce0f995cc37ff0b42"

do_configure_prepend() {
	autoreconf -Wcross --verbose --install --force --exclude=autopoint || bbnote "failed autoreconf"
}

