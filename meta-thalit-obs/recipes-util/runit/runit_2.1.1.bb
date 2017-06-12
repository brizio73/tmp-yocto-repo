DESCRIPTION = "runit is a cross-platform Unix init scheme with service supervision; a replacement for sysvinit and other init schemes. It runs on GNU/Linux, *BSD, Mac OS X, and Solaris, and can easily be adapted to other Unix operating systems. runit implements a simple three-stage concept."
HOMEPAGE = "http://smarden.org/runit/"
LICENSE = "BSD"
S = "${WORKDIR}/admin/runit-${PV}"
LIC_FILES_CHKSUM = "file://package/COPYING;md5=c9e8a560732fc8b860b6a91341cc603b"

PR = "r1"

INSANE_SKIP_${PN} += "already-stripped"

SRC_URI = "\
	   http://smarden.org/runit/runit-${PV}.tar.gz\
	   file://Makefile.patch"

#inherit autotools

do_configure() {
	#goto
	cd ${S}/src 
	echo "$CC -O -Wall" > conf-cc
	echo "$CC -s" > conf-ld
	#make compile load choose
	cat iopause.h1 > iopause.h
	cat uint64.h1 > uint64.h
	cat hasshsgr.h1 > hasshsgr.h
}

do_compile() {
	cd ${S}
	./package/compile
}                                                                                                         

do_install() {                                                                                            
	install -d ${D}${bindir}                                                                     
	install -m 0755 ${S}/command/* ${D}${bindir}                                                     
}


SRC_URI[md5sum] = "8fa53ea8f71d88da9503f62793336bc3"
SRC_URI[sha256sum] = "ffcf2d27b32f59ac14f2d4b0772a3eb80d9342685a2042b7fbbc472c07cf2a2c"

