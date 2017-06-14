#use BASH instead of busybox sh
IMAGE_INSTALL_append = " bash"

IMAGE_INSTALL_append = " screen"
IMAGE_INSTALL_append = " rsync"
IMAGE_INSTALL_append = " sed"
IMAGE_INSTALL_append = " xz"
IMAGE_INSTALL_append = " lsof"

IMAGE_INSTALL_append = " ssh-keys"
IMAGE_INSTALL_append = " basic-config"
IMAGE_INSTALL_append = " sudo"

# menage kernel
IMAGE_INSTALL_append = " kmod"

# general management
IMAGE_INSTALL_append = " usbutils"
IMAGE_INSTALL_append = " pciutils"
IMAGE_INSTALL_append = " coreutils"
IMAGE_INSTALL_append = " sysfsutils"
IMAGE_INSTALL_append = " tzdata"
IMAGE_INSTALL_append = " minicom"
IMAGE_INSTALL_append = " setserial"
IMAGE_INSTALL_append = " net-tools"
IMAGE_INSTALL_append = " wget"
IMAGE_INSTALL_append = " shadow"
IMAGE_INSTALL_append = " iputils"
IMAGE_INSTALL_append = " iptables"
IMAGE_INSTALL_append = " e2fsprogs-e2fsck e2fsprogs-mke2fs e2fsprogs-tune2fs e2fsprogs-badblocks"
#IMAGE_INSTALL += "grub"
IMAGE_INSTALL_append = " socat"
IMAGE_INSTALL_append = " parted"
IMAGE_INSTALL_append = " ethtool"

IMAGE_INSTALL_append = " thalitapp"
IMAGE_INSTALL_append = " zlog"


IMAGE_FEATURES += "ssh-server-openssh"

#package for keyboard
## commented because we use MACHINE_FEATURES and  packagegroup-core-boot
IMAGE_INSTALL_append = " keymaps kbd-consolefonts kbd-keymaps kbd-unimaps kbd-consoletrans"
IMAGE_INSTALL_append = " packagegroup-core-boot"


ROOTFS_POSTPROCESS_COMMAND += "networkinterface; "

networkinterface() {
      install -m 0755 -d ${IMAGE_ROOTFS}${sysconfdir}/network
    echo  "auto lo" > ${IMAGE_ROOTFS}${sysconfdir}/network/interfaces
    echo "iface lo inet loopback" >> ${IMAGE_ROOTFS}${sysconfdir}/network/interfaces
}

inherit core-image


