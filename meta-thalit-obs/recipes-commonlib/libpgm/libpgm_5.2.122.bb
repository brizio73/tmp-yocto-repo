DESCRIPTION = "An implementation of the PGM reliable multicast protocol"
HOMEPAGE = "https://code.google.com/archive/p/openpgm/"
LICENSE = "LGPL-2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/openpgm/${BP}.tar.bz2;name=tarbz"
SRC_URI += "file://openpgm-cross-compile.patch;subdir=${BP}/openpgm/pgm;striplevel=3"
#SRC_URI += "https://git.busybox.net/buildroot/plain/package/openpgm/openpgm-cross-compile.patch?id=ab001acd4c543a41d586d918a1ecf3206678d80b;name=patch;downloadfilename=openpgm-cross-compile.patch;"

SRC_URI[tarbz.md5sum] = "06d6e16bc9064379caf0f8fe979dc785"
SRC_URI[tarbz.sha256sum] = "2f6fcdad7fcf08368bce100db2598abdd57cb1e55869df68c0032a12ffe86d93"
SRC_URI[patch.md5sum] = "de52b68c5748cc2dda4b806db2e35a72"
SRC_URI[patch.sha256sum] = "7588c0e31aea158680a48e343c89daa6877d8e0e2f571645a30dc9797f69bf2a"

inherit autotools

S = "${WORKDIR}/${BP}/openpgm/pgm"

CFLAGS_append = " -std=gnu99 "

EXTRA_OECONF += "\
	ac_cv_file__proc_cpuinfo=yes \
	ac_cv_file__dev_rtc=no \
	ac_cv_file__dev_hpet=no \
	ac_fn_c_try_run=no \
	pgm_unaligned_pointers=no"


do_install() {
	oe_runmake install DESTDIR=${D} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}
}

