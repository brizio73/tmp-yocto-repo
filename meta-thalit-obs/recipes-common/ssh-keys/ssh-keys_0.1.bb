DESCRIPTION = "ssh private & public key packages"
HOMEPAGE = "http://www.thalegroup.com"

PR = "r0"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ssh_host_dsa_key;md5=42efa6dc94290bb66d2b289f24064b6c \
          file://ssh_host_rsa_key;md5=4d1ea4c71fd6d9b8ebcb77bd07024e41 \
          file://ssh_host_ecdsa_key;md5=cff6303dac4c6dd3bdfb826a01db61e6 \
          file://ssh_host_dsa_key.pub;md5=7e46aaeef3d0825e64712a32f1de1718 \
          file://ssh_host_rsa_key.pub;md5=4cf00b682cf4a2004ff94519bd4e7596 \
          file://ssh_host_ecdsa_key.pub;md5=90596bf66e556d2eb8fbf39c9b8026e1 \
          "

DEPENDS += "openssh"


SRC_URI = "file://ssh_host_dsa_key \
          file://ssh_host_ecdsa_key \
          file://ssh_host_rsa_key \
          file://ssh_host_dsa_key.pub  \
          file://ssh_host_ecdsa_key.pub  \
          file://ssh_host_rsa_key.pub \
          "
S = "${WORKDIR}"

do_install() {
        install -d ${D}/etc/ssh
        install -m 0700 ${S}/ssh_host_dsa_key ${D}/etc/ssh/
        install -m 0700 ${S}/ssh_host_ecdsa_key ${D}/etc/ssh/
        install -m 0700 ${S}/ssh_host_rsa_key ${D}/etc/ssh/
        
        install -m 0755 ${S}/ssh_host_dsa_key.pub ${D}/etc/ssh/
        install -m 0755 ${S}/ssh_host_ecdsa_key.pub ${D}/etc/ssh/
        install -m 0755 ${S}/ssh_host_rsa_key.pub ${D}/etc/ssh/
        
}

