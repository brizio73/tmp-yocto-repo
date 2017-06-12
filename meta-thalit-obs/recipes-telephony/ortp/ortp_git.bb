DESCRIPTION = "Real-time transport protocol (RFC 3550) library"
LICENSE = "GPLv2"
HOMEPAGE = "http://www.linphone.org/technical-corner/ortp/overview"
SECTION = "libs/network"
DEPENDS = "bctoolbox"
PROVIDES += "libortp"

LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"

SRC_URI = "git://git.linphone.org/ortp.git"

SRCREV = "146a8b2bf5f8768aa7596f48084f783bf31d1bf0"
PV = "git_${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
