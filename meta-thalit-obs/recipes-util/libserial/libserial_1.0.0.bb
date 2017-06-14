LICENSE = "MIT"
PR = "r1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "d06b2f94dddb80d7b3566837ecf717ef6e36c7f9"
SRC_URI = "git://github.com/wjwwood/serial.git"

SRC_URI += "file://serial.patch"

inherit pkgconfig cmake

S = "${WORKDIR}/git"

do_compile() {
        cd ${S}
        oe_runmake
}

do_install(){
	install -d ${D}${libdir}
	cp -a ${S}/*.a ${D}${libdir}

	install -d ${D}${includedir}
        cp -a ${S}/include/* ${D}${includedir}

}


