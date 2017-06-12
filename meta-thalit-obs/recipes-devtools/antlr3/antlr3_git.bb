SUMMARY = "ANother Tool for Language Recognition"
HOMEPAGE = "http://www.antlr3.org/"
SECTION = "devtools"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=13c502aaa9b2ca91d01a3aae44d899b4"

SRC_URI = "git://git.linphone.org/antlr3.git;branch=linphone"

SRCREV = "52075ffb35975c6901e924b4a763b6fb23abd623"
PR = "r0"
PV = "3.4-git${SRCPV}"

S = "${WORKDIR}/git/runtime/C"

FILES_${PN} += " /usr/share/* "

do_install_append() {
        install -d ${D}${prefix}/share/java
        install -m 0644 ${WORKDIR}/git/antlr-3.4-complete.jar ${D}${prefix}/share/java/antlr.jar
}

inherit autotools pkgconfig
