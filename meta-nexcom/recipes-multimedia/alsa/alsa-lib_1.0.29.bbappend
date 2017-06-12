FILESEXTRAPATHS_prepend:= "${THISDIR}/${PN}:"

SRC_URI += "file://50-splitinput.conf" 

do_install_append() {
    install -d ${D}${datadir}/alsa/alsa.conf.d/
    install -m 644 ${WORKDIR}/50-splitinput.conf ${D}${datadir}/alsa/alsa.conf.d/
}
