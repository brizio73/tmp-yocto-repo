DESCRIPTION = "Audio/video SIP-based IP phone (console edition)"
HOMEPAGE = "http://www.linphone.org/technical-corner/linphone/overview"
LICENSE = "GPLv2"
SECTION = "network"
DEPENDS = "belle-sip ortp mediastreamer2 libxml2 cunit readline"
PROVIDES = "liblinphone linphonec"

LIC_FILES_CHKSUM = "file://COPYING;md5=d0df6696dd1de18b107a24dc34735b28"

SRC_URI = "gitsm://git.linphone.org/linphone.git"

SRCREV = "24c62f63d7bfeeb4d9331acf65e3c03f8d1e0f00"
PR = "r0"
PV = "3.9.1_${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECONF += " \
        --with-readline=${STAGING_DIR_TARGET}/usr \
        --enable-external-mediastreamer=yes \
        --enable-external-ortp=yes \
        --disable-video \
        --disable-gtk_ui \
        "

INSANE_SKIP_${PN} += "dev-deps"

FILES_${PN} += "/usr/share/"

do_configure_prepend() {
    #!/bin/sh
    echo 'Deleting mediastreamer2 and oRTP'
    rm -rf ${S}/mediastreamer2
    rm -rf ${S}/oRTP
    echo 'mediastreamer2 and oRTP have been removed'
}

inherit autotools pkgconfig gettext
