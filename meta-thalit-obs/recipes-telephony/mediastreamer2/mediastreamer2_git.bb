DESCRIPTION = "Powerful and lightweight streaming engine specialized for voice and video telephony applications"
LICENSE = "GPLv2"
HOMEPAGE = "http://www.linphone.org/technical-corner/mediastreamer2/overview"
SECTION = "libs/network"
DEPENDS = "intltool-native libortp speex alsa-lib libv4l bctoolbox pulseaudio"
PROVIDES += "libmediastreamer2"

LIC_FILES_CHKSUM = "file://COPYING;md5=c46082167a314d785d012a244748d803"

SRC_URI = "git://git.linphone.org/mediastreamer2.git"

SRCREV = "52806d2c5dde697d190ce33f2b5bad386e5bb74f"
PV = "git_${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECONF += " --disable-glx --disable-ffmpeg "

FILES_${PN} += " ${libdir}/mediastreamer/plugins ${datadir}/images/nowebcamCIF.jpg"

inherit autotools pkgconfig gettext
