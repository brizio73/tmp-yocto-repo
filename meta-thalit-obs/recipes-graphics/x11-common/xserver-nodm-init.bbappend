FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
PV = "1.0"
PR = "r32"

RDEPENDS_{PN} += "bash"
SRC_URI += "file://xserver-nodm.patch"
