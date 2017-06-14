dirs1777_append = "/opt"

do_install_append() {
	case "${MACHINE}" in
		"qemuarm")
		install -m 0755 -d ${D}/opt/tpkg
		install -m 0755 -d ${D}/opt/backup
		install -m 0755 -d ${D}/opt/log
		install -m 0755 -d ${D}/opt/etcrw
		echo "/dev/sdb       /opt/tpkg          auto       defaults,ro,sync  0  0" >> ${D}${sysconfdir}/fstab
		echo "none       /opt/etcrw          tmpfs       defaults,size=2m  0  0" >> ${D}${sysconfdir}/fstab
		echo "none       /etc          aufs       defaults,br=/opt/etcrw=rw:/etc=ro  0  0" >> ${D}${sysconfdir}/fstab
		;;
		"qemux86")
		install -m 0755 -d ${D}/opt/tpkg
		install -m 0755 -d ${D}/opt/backup
		install -m 0755 -d ${D}/opt/log
		install -m 0755 -d ${D}/opt/etcrw
		echo "/dev/hdb       /opt/tpkg          auto       defaults,ro,sync  0  0" >> ${D}${sysconfdir}/fstab
		echo "none       /opt/etcrw          tmpfs       defaults,size=2m  0  0" >> ${D}${sysconfdir}/fstab
		echo "none       /etc          aufs       defaults,br=/opt/etcrw=rw:/etc=ro  0  0" >> ${D}${sysconfdir}/fstab
		;;
		*);;
	esac
}

#COMPATIBLE_MACHINE = "(qemuarm|qemux86|emenlow|eurotech-z5xx)"
