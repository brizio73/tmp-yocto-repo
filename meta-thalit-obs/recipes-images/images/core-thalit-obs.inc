#========== BEGIN IMAGE CUSTOMIZATION ============

#START TPKG dependencies

#use BASH instead of busybox sh
IMAGE_INSTALL_append = " bash"
#use full utility insted of busybox
IMAGE_INSTALL_append = " procps"
IMAGE_INSTALL_append = " mktemp"
IMAGE_INSTALL_append = " grep"
IMAGE_INSTALL_append = " findutils"
IMAGE_INSTALL_append = " less"
IMAGE_INSTALL_append = " util-linux"
IMAGE_INSTALL_append = " tar"
IMAGE_INSTALL_append = " bzip2"
IMAGE_INSTALL_append = " diffutils"
IMAGE_INSTALL_append = " patch"
IMAGE_INSTALL_append = " cpio"
IMAGE_INSTALL_append = " gzip"
IMAGE_INSTALL_append = " zip"
IMAGE_INSTALL_append = " file"
IMAGE_INSTALL_append = " sysklogd"
IMAGE_INSTALL_append = " attr"
IMAGE_INSTALL_append = " bc"
IMAGE_INSTALL_append = " ed"
IMAGE_INSTALL_append = " file"
IMAGE_INSTALL_append = " gawk"
IMAGE_INSTALL_append = " gmp"
IMAGE_INSTALL_append = " ncurses"
IMAGE_INSTALL_append = " popt"
IMAGE_INSTALL_append = " psmisc"
IMAGE_INSTALL_append = " time"
IMAGE_INSTALL_append = " zlib"
IMAGE_INSTALL_append = " ncurses"
IMAGE_INSTALL_append = " readline"



#install all python
#IMAGE_INSTALL_append = " python-codecs python-pickle python-lang python-email python-re python-zlib python-compile python-pprint python-tests python-crypt python-core python-sqlite3 python-sqlite3 python-profile python-ctypes python-unixadmin python-netserver python-xmlrpc python-misc python-mmap python-modules python-math python-unittest python-readline python-debugger python-smtpd python-datetime python-image python-textutils python-distutils python-shell python-logging python-io python-compression python-db python-bsddb python-threading python-difflib python-syslog python-robotparser python-curses python-xcbgen python-distutils python-fcntl python-netclient python-hotshot python-mailbox python-terminal python-mime python-pydoc python-compiler python-multiprocessing python-pkgutil python-json python-stringold python-tkinter python-numbers python-idle python-elementtree python-resource python-audio python-xml python-subprocess python-html"
IMAGE_INSTALL_append = " python-codecs python-pickle python-lang python-email python-re python-zlib python-compile python-pprint python-crypt python-core python-sqlite3 python-ctypes python-unixadmin python-netserver python-xmlrpc python-misc python-mmap python-modules python-math python-unittest python-readline python-debugger python-smtpd python-datetime python-image python-textutils python-distutils python-shell python-logging python-io python-compression python-db python-bsddb python-threading python-difflib python-syslog python-robotparser python-curses python-xcbgen python-distutils python-fcntl python-netclient python-hotshot python-mailbox python-terminal python-mime python-pydoc python-compiler python-multiprocessing python-pkgutil python-json python-stringold python-numbers python-elementtree python-resource python-audio python-xml python-subprocess python-html"

IMAGE_INSTALL_append = " python-twisted python-zopeinterface"

#intall pyasn1
IMAGE_INSTALL_append = " asn1c"
IMAGE_INSTALL_append = " python-pyasn1"

#install luajit :-)
IMAGE_INSTALL_append = " luajit"


IMAGE_INSTALL_append = " monit"
IMAGE_INSTALL_append = " screen"
IMAGE_INSTALL_append = " rsync"
IMAGE_INSTALL_append = " sed"
# commented because we use IMAGE_FEATURES and  packagegroup-core-basic
#IMAGE_INSTALL_append = " openssh"
IMAGE_INSTALL_append = " xz"
IMAGE_INSTALL_append = " lsof"
IMAGE_INSTALL_append = " runit"

IMAGE_INSTALL_append = " ssh-keys"



IMAGE_INSTALL_append = " basic-config"

IMAGE_INSTALL_append = " sudo"

#packages to start THALIT apps
IMAGE_INSTALL_append = " thalitapp"
IMAGE_INSTALL_append = " zlog"


# menage kernel
IMAGE_INSTALL_append = " kmod"
# IMAGE_INSTALL_append = " kernel-modules"

# general management
IMAGE_INSTALL_append = " usbutils"
IMAGE_INSTALL_append = " pciutils"
IMAGE_INSTALL_append = " coreutils"
IMAGE_INSTALL_append = " sysfsutils"
#IMAGE_INSTALL_append = " tcp-wrappers"
IMAGE_INSTALL_append = " tcpdump"
IMAGE_INSTALL_append = " vlan"
IMAGE_INSTALL_append = " tzdata"
IMAGE_INSTALL_append = " minicom"
IMAGE_INSTALL_append = " setserial"
IMAGE_INSTALL_append = " net-tools"
IMAGE_INSTALL_append = " wget"
IMAGE_INSTALL_append = " shadow"
#IMAGE_INSTALL_append = " iproute2"
IMAGE_INSTALL_append = " iputils"
IMAGE_INSTALL_append = " iptables"
IMAGE_INSTALL_append = " e2fsprogs-e2fsck e2fsprogs-mke2fs e2fsprogs-tune2fs e2fsprogs-badblocks"
#IMAGE_INSTALL_append = " udev"
#IMAGE_INSTALL_append = " at"
IMAGE_INSTALL_append = " cronie"
IMAGE_FEATURES += "package-management"
IMAGE_INSTALL_append = " parted"
IMAGE_INSTALL_append = " socat"
IMAGE_INSTALL_append = " ethtool"

# it is nice to see if there is some option that can be disabled
IMAGE_INSTALL_append = " powertop"

IMAGE_INSTALL_append = " watchdog"

#depends on meta-openembedded/meta-networking
IMAGE_INSTALL_append = " netcat"

IMAGE_INSTALL_append = " ntp ntp-utils"

#add net-snmp
IMAGE_INSTALL_append = " net-snmp-libs"

#depends on meta-openembedded/meta-oe
#provided by BUSYBOX? to be checked
#IMAGE_INSTALL_append = " rsyslog"
IMAGE_INSTALL_append = " logrotate"

IMAGE_INSTALL_append = " iotop"
IMAGE_INSTALL_append = " iftop"
IMAGE_INSTALL_append = " libconfig"

#END TPKG dependencies

#BEGIN COMM_FW dependencies

IMAGE_INSTALL_append = " libmodbus"
IMAGE_INSTALL_append = " libsodium"
IMAGE_INSTALL_append = " libpgm"
IMAGE_INSTALL_append = " zeromq"
# IMAGE_INSTALL_append = " pyzmq"

IMAGE_INSTALL_append = " netifaces"

IMAGE_INSTALL_append = " linphone"

#END COMM_FW dependencies


IMAGE_INSTALL_append = " ${@base_contains('DISTRO_FEATURES', 'alsa', 'alsa-utils alsa-state', '', d)}"

IMAGE_FEATURES += "ssh-server-openssh hwcodecs"

#package for keyboard
## commented because we use MACHINE_FEATURES and  packagegroup-core-boot
IMAGE_INSTALL_append = " keymaps kbd-consolefonts kbd-keymaps kbd-unimaps kbd-consoletrans"
IMAGE_INSTALL_append = " packagegroup-core-boot"

#packagegroup-core-basic is too big
#IMAGE_INSTALL_append = " packagegroup-core-basic"

#GSTREAMER BASIC FOR AUDIO
#scegliere i plugin attentamente pe rnon portarsi dietro dipendenze inutili
IMAGE_INSTALL_append = " ${@base_contains('DISTRO_FEATURES', 'gstreamer', 'gstreamer gst-plugins-base-alsa gst-plugins-good-interleave gst-plugins-base-audioconvert gst-plugins-base-audioresample gst-plugins-base-audiotestsrc gst-plugins-base-audiorate', '', d)}"

ROOTFS_POSTPROCESS_COMMAND += "networkinterface; saverootfsversion; "

networkinterface() {
      install -m 0755 -d ${IMAGE_ROOTFS}${sysconfdir}/network
    echo  "auto lo" > ${IMAGE_ROOTFS}${sysconfdir}/network/interfaces
    echo "iface lo inet loopback" >> ${IMAGE_ROOTFS}${sysconfdir}/network/interfaces
}

saverootfsversion() {
    git describe --always > ${IMAGE_ROOTFS}/VERSION
}


###################### TEST

# memory test
IMAGE_INSTALL_append = " memtester"
# read and write to any memory address
IMAGE_INSTALL_append = " devmem2"
# use cpu to increase the temperature
#IMAGE_INSTALL_append = " cpuburn-neon"
# disk stress test
# IMAGE_INSTALL_append = " fio"
# IMAGE_INSTALL_append = " bonnie++"


######################

#use inotify to execute actions
IMAGE_INSTALL_append = " entr"

#========== END IMAGE CUSTOMIZATION ============


