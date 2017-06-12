SUMMARY = "Utilities library used by Belledonne Communications softwares"
HOMEPAGE = "http://linphone.org"
SECTION = "libs"
DEPENDS = "polarssl cunit"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=9f9938e31db89d55a796e86808c96848"

SRC_URI = "git://github.com/BelledonneCommunications/bctoolbox.git"

SRCREV = "426ec855b5d55305531291be5a2017332972f7c3"
PR = "r0"
PV = "0.0.2-git${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
