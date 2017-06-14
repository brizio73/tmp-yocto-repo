DESCRIPTION = "The Event Notify Test Runner (entr) is a general purpose Unix utility intended to make rapid feedback and automated testing natural and completely ordinary."
HOMEPAGE = "http://smarden.org/runit/"

LICENSE = "ISC"
PR = "r1"

SRC_URI = "http://entrproject.org/code/entr-${PV}.tar.gz"
LIC_FILES_CHKSUM = "file://LICENSE;md5=261f92e548f84496f9216ce8d1be78ee" 

SRC_URI[md5sum] = "072eed7153296a8fae6ebdedefed9fd4"
SRC_URI[sha256sum] = "a42746d81c548d7e557d500f93422b8ec9731d719309eb2601b8be69ae0dc8eb"

S = "${WORKDIR}/eradman-entr-c15b0be493fc"
EXTRA_OEMAKE += "CFLAGS='-D_GNU_SOURCE -D_LINUX_PORT -Imissing -DRELEASE=\"3.6\"'"

do_configure() {
        cd ${S}
        DESTDIR=${D} ./configure
}

do_compile() {
	oe_runmake 
}

do_install() {
	install -d ${D}${bindir}                                                                     
	install -m 0755 ${S}/entr ${D}${bindir}                                                     
}
