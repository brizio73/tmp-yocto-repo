DESCRIPTION = "The ASN.1 to C compiler"
HOMEPAGE = "http://lionet.info/asn1c"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=3b43f8cb9db3fd42e0429d59c1950701"

SRC_URI = "http://lionet.info/soft/${BP}.tar.gz \
           file://0001-fix-autoconf.patch \
          "

SRC_URI[md5sum] = "e59fb7c79ed69a3a04e02e26b4006355"
SRC_URI[sha256sum] = "025f64e1c27211b36e181350b52fde34ad23f4330fff96b2563ed3fda7b0db9e"

S = "${WORKDIR}/${BP}"

do_install() {
    oe_runmake install DESTDIR=${D} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}
}

inherit autotools pkgconfig

BBCLASSEXTEND += "nativesdk"
