SUMMARY = "SIP (RFC3261) implementation written in C, with an object oriented API"
HOMEPAGE = "http://linphone.org"
SECTION = "libs"
DEPENDS = "antlr3 bctoolbox zlib"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=9f9938e31db89d55a796e86808c96848"

SRC_URI = "git://github.com/BelledonneCommunications/belle-sip.git"

SRCREV = "c05ca9b4c459d9d320be8b3f6b3587dfb92a5f7d"
PR = "r0"
PV = "1.4.2-git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECONF += "--disable-strict \
       --with-antlr=${STAGING_DIR_HOST}${layout_exec_prefix}/usr \
       "

INSANE_SKIP_${PN} = "dev-deps"

inherit autotools pkgconfig
