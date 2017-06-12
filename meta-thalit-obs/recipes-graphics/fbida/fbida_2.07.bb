# - Currently this app needs ttf-dejavu-sans-mono[.ipk] installed!
# - think about using fbi -a option for autozoom on tiny screens
# - fbi displays in portrait-mode if your fb is in portrait (normal) mode too
#   (fbcon:rotate stands only for the fb console)

HOMEPAGE = "http://linux.bytesex.org/fbida/"
DESCRIPTION = "frame buffer image and doc viewer tools"
AUTHOR = "Gerd Knorr"
LICENSE = "GPL2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
SECTION = "utils"
PR = "r4"

DEPENDS = "virtual/libiconv jpeg fontconfig freetype libexif"
RDEPENDS_${PN} = "ttf-dejavu-sans-mono"

SRC_URI = "http://dl.bytesex.org/releases/fbida/fbida-${PV}.tar.gz \
	   file://exiftran.c.patch \
	   file://fbi.c.patch \
	   file://GNUmakefile.patch \
	   file://sys_siglist.patch \
	  "

EXTRA_OEMAKE = ""

do_compile() {
	oe_runmake
}

do_install() {
	oe_runmake 'DESTDIR=${D}' install
}

SRC_URI[md5sum] = "3e05910fb7c1d9b2bd3e272d96db069c"
SRC_URI[sha256sum] = "6510dee7c4f45cb63094d540e66aa39d53215c59f46944b8bb050c26b71bdb44"
