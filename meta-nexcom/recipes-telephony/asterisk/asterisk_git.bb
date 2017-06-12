DESCRIPTION = "Open source telephony switching and private branch exchange service for Linux"
HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3aa955c628d43053f8ba9569d173105a"
DEPENDS = "ncurses-native libxml2-native libxml2 openssl speex curl util-linux \
           libvorbis libogg libcap alsa-lib neon sqlite3 zlib libxslt jansson"

RDEPENDS_${PN} = "bash"

SRC_URI = "git://github.com/asterisk/asterisk.git;protocol=https;branch=13.7;tag=13.7.2 \
           file://menuselect.makeopts \
           file://menuselect.makedeps \
          "

PV = "13.7.2-git${SRCPV}"

S = "${WORKDIR}/git"

FILES_${PN} += " /run/asterisk "

FILES_${PN}-dbg += " ${sbindir}/.debug/* ${srcdir}/debug/* \
                     ${libdir}/.debug/* ${libdir}/${PN}/modules/.debug/* "

EXTRA_OECONF = " \
        --without-curses \
        --without-gtk2 \
        --without-isdnnet \
        --without-misdn \
        --without-nbs \
        --with-ncurses \
        --without-netsnmp \
        --without-newt \
        --without-ogg \
        --without-osptk \
        --without-popt \
        --without-pri \
        --without-radius \
        --without-sdl \
        --without-spandsp \
        --without-suppserv \
        --without-tds \
        --without-termcap \
        --without-tinfo \
        --without-vorbis \
        --without-vpb \
        --without-postgres \
        --without-lua \
        --disable-xmldoc \
        "

do_patch() {
        # Make sure menuselect is built natively
        sed -i "s|&& ./configure|\&\& CC=gcc ./configure|g" ${S}/configure

        # Prevent GTK2 build for menuselect (ugly workaround)
        sed -i -e '4848,4855d' ${S}/menuselect/configure

        # Use pkg-config instead of deprecated xml2-config
        sed -i 's|${CONFIG_LIBXML2} $A|pkg-config libxml-2.0 $A|g' \
            ${S}/configure ${S}/menuselect/configure
}

do_configure() {
        cp ${WORKDIR}/menuselect.makedeps ${WORKDIR}/menuselect.makeopts ${S}

        ./configure --host=${TARGET_SYS} ${EXTRA_OECONF}
}

python do_menuselect() {
        oe_terminal("${SHELL} -c \"make menuselect\"", '${PN} configuration', d)

        bb.note("Configuration changed, recompile will be forced")
        bb.build.write_taint('do_compile', d)
}
do_menuselect[depends] += "ncurses-native:do_populate_sysroot libxml2-native:do_populate_sysroot"
do_menuselect[nostamp] = "1"
addtask menuselect after do_configure

do_install() {
        install -d ${D}${sbindir}

        oe_runmake install DESTDIR=${D} SBINDIR=${sbindir} INCLUDEDIR=${includedir} MANDIR=${mandir}
}

inherit terminal

