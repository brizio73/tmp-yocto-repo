SUMMARY = "G-sensor tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

#FILES_${PN} += "${bindir}/Nexcom_SMBus"
#FILES_${PN}-dbg += "${bindir}/Nexcom_SMBus/.debug"

RDEPENDS_${PN} += "bash"

SRC_URI += " \
        file://G-sensor.h \
	    file://G-sensor_API.c \
        file://demo_ByRegister.c \
	    file://demo_ByXYZ.c"

COMPATIBLE_MACHINE = "(genericx86-64)"

do_compile() {
            ${CC}  ${THISDIR}/files/G-sensor_API.c ${THISDIR}/files/demo_ByXYZ.c -o ${WORKDIR}/gsensor_ByXYZ 
            ${CC}  ${THISDIR}/files/G-sensor_API.c ${THISDIR}/files/demo_ByRegister.c -o ${WORKDIR}/gsensor_ByRegister
}

do_install() {
             # clean old stuff in /sbin
             if [ -f ${D}/usr/sbin/gsensor_ByRegister ]; then
                rm -f ${D}/usr/sbin/gsensor_*
             fi

             # install script and application
             install -d ${D}/usr/sbin/
             #install -d ${D}/usr/sbin/Nexcom_SMBus/
             install -m 0755 ${WORKDIR}/gsensor_ByRegister ${D}/usr/sbin
             install -m 0755 ${WORKDIR}/gsensor_ByXYZ ${D}/usr/sbin
}
