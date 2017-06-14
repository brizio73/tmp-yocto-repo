DESCRIPTION = "THALIT custom application launcher"
LICENSE = "MIT"
PR = "r3"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI =  " \
	file://thalitapp \
    file://x-window-manager \
	" 

inherit update-rc.d

FILES_${PN} += "${sysconfdir}/init.d/thalitapp"

DEPENDS_${PN} += "update-rc.d"
RDEPENDS_${PN} += "update-rc.d" 

RDEPENDS_${PN} += "bash" 
RDEPENDS_${PN} += "e2fsprogs-mke2fs" 

do_install(){
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/thalitapp ${D}${sysconfdir}/init.d	
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/x-window-manager ${D}${bindir}
}

INITSCRIPT_NAME = "thalitapp"
INITSCRIPT_PARAMS = "defaults 90 1"

