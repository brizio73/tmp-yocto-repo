SUMMARY = "emp2 tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

FILES_${PN} += "/usr/lib/emp2"
RDEPENDS_${PN} += "bash"

SRC_URI += "file://regctl.c \
	    file://emp2cfg \
	    file://emp2init \
	    file://emp2lib"

COMPATIBLE_MACHINE = "(genericx86-64)"

do_compile() {
             ${CC} ${THISDIR}/files/regctl.c -o ${WORKDIR}/emp2reg
}

do_install() {
             # clean old stuff in /sbin
             if [ -f ${D}/sbin/emp2reg ]; then
                rm -f ${D}/sbin/emp2*
             fi

             # install script and application
             install -d ${D}/usr/sbin/
             install -m 0755 ${THISDIR}/files/emp2cfg ${D}/usr/sbin/
             install -m 0755 ${THISDIR}/files/emp2init ${D}/usr/sbin/
             install -m 0755 ${WORKDIR}/emp2reg ${D}/usr/sbin/

             # install common definition items in /usr/lib/emp2
             install -d ${D}/usr/lib/emp2/
             install -m 0644 ${THISDIR}/files/emp2lib ${D}/usr/lib/emp2/
}
