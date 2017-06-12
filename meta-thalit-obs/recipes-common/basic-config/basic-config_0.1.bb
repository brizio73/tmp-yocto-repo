DESCRIPTION = ".profile for root"
HOMEPAGE = "http://www.thalegroup.com"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r2"

SRC_URI = "file://.profile file://sudoers_add_sudogroup"

DEPENDS = "sudo"

S = "${WORKDIR}"

inherit useradd

# You must set USERADD_PACKAGES when you inherit useradd. This
# lists which output packages will include the user/group
# creation code.
USERADD_PACKAGES = "${PN}"

# USERADD_PARAM specifies command line options to pass to the
# useradd command. Multiple users can be created by separating
# the commands with a semicolon. Here we'll create two users,
# user1 and user2:
# thales encrypted password Xttt3wkXS0yLI

# | Options:
# |   -b, --base-dir BASE_DIR       base directory for the home directory of the
# |                                 new account
# |   -c, --comment COMMENT         GECOS field of the new account
# |   -d, --home-dir HOME_DIR       home directory of the new account
# |   -D, --defaults                print or change default useradd configuration
# |   -e, --expiredate EXPIRE_DATE  expiration date of the new account
# |   -f, --inactive INACTIVE       password inactivity period of the new account
# |   -g, --gid GROUP               name or ID of the primary group of the new
# |                                 account
# |   -G, --groups GROUPS           list of supplementary groups of the new
# |                                 account
# |   -h, --help                    display this help message and exit
# |   -k, --skel SKEL_DIR           use this alternative skeleton directory
# |   -K, --key KEY=VALUE           override /etc/login.defs defaults
# |   -l, --no-log-init             do not add the user to the lastlog and
# |                                 faillog databases
# |   -m, --create-home             create the user's home directory
# |   -M, --no-create-home          do not create the user's home directory
# |   -N, --no-user-group           do not create a group with the same name as
# |                                 the user
# |   -o, --non-unique              allow to create users with duplicate
# |                                 (non-unique) UID
# |   -p, --password PASSWORD       encrypted password of the new account
# |   -R, --root CHROOT_DIR         directory to chroot into
# |   -r, --system                  create a system account
# |   -s, --shell SHELL             login shell of the new account
# |   -u, --uid UID                 user ID of the new account
# |   -U, --user-group              create a group with the same name as the user


#GROUPADD_PARAM_${PN} = "thalesadmin"
USERADD_PARAM_${PN} = "-u 1200 -d /home/thalesadmin -p Xttt3wkXS0yLI -s /bin/bash -N -g root -G sudo,audio,dialout thalesadmin"


do_install() {
        install -d ${D}/home/root
        install -m 0755 ${S}/.profile ${D}/home/root/
        
        install -d -m 755 ${D}/home/thalesadmin
        install -p -m 0755 ${S}/.profile ${D}/home/thalesadmin/
        
        chown -R thalesadmin ${D}/home/thalesadmin
        chgrp -R root ${D}/home/thalesadmin
        
        install -d ${D}${sysconfdir}/sudoers.d
        install -m 0440 ${S}/sudoers_add_sudogroup ${D}${sysconfdir}/sudoers.d/
}


FILES_${PN}="/home/root /home/root/.profile /home/thalesadmin /home/thalesadmin/.profile ${sysconfdir}/sudoers.d/sudoers_add_sudogroup"

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
