do_install_append() {
        sed -i 's|#PermitRootLogin|PermitRootLogin|g' ${D}${sysconfdir}/ssh/sshd_config
}
