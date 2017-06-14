DEPENDS += "sed-native"

do_install_append() {
    if [ "x${THALESRUNLEVEL5}" != "x" ]; then
        sed -i "s/id:5:initdefault:/id:${THALESRUNLEVEL5}:initdefault:/" ${D}${sysconfdir}/inittab
    fi
    if [ "x${THALESRUNLEVEL3}" != "x" ]; then
        sed -i "s/id:3:initdefault:/id:${THALESRUNLEVEL3}:initdefault:/" ${D}${sysconfdir}/inittab
    fi
    if [ "x$MOVE_TO_TTY2" == "xyes" ]; then
        sed -i "s@1:2345:respawn:/sbin/getty 38400 tty1@1:2345:respawn:/sbin/getty 38400 tty2@" ${D}${sysconfdir}/inittab
    fi
}
