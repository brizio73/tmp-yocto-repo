
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://nexcom.net.udev.rules"

FILES_${PN} += "/etc/udev/rules.d"

do_install_append() {
	install -d ${D}${sysconfdir}/udev/rules.d/
	install -m 0644 ${WORKDIR}/nexcom.net.udev.rules  ${D}${sysconfdir}/udev/rules.d/nexcom.net.dev.rules
}
