
require core-thalit-obs.inc

inherit core-image
#
IMAGE_FEATURES += "splash"
IMAGE_INSTALL_append = " packagegroup-core-x11"

IMAGE_INSTALL_append = " packagegroup-core-x11-xserver"
IMAGE_INSTALL_append = " packagegroup-core-x11-utils"
IMAGE_INSTALL_append = " liberation-fonts"

IMAGE_INSTALL_append = " xserver-nodm-init"
#la riga seguente deve essere inserita nel conf
#PREFERRED_VERSION_xserver-nodm-init = "1.0%"

##IMAGE_INSTALL_append = " mini-x-session"
#from openembedded
#IMAGE_INSTALL_append = " twm"
#IMAGE_INSTALL_append = " xterm"
#IMAGE_INSTALL_append = " xclock"
#IMAGE_INSTALL_append = " xrdb"
###############

IMAGE_INSTALL_append = " matchbox-wm"
IMAGE_INSTALL_append = " libxcursor"
IMAGE_INSTALL_append = " matchbox-terminal"

#virtual keyboard
IMAGE_INSTALL_append = " matchbox-keyboard"

#IMAGE_INSTALL_append = " matchbox-config-gtk"
#IMAGE_INSTALL_append = " matchbox-keyboard"
IMAGE_INSTALL_append = " xf86-input-keyboard"
# it is important to have openembedded
IMAGE_INSTALL_append = " setxkbmap"

#IMAGE_INSTALL_append = " xeyes"
IMAGE_INSTALL_append = " xev"
IMAGE_INSTALL_append = " xrandr"
IMAGE_INSTALL_append = " xset"
IMAGE_INSTALL_append = " xauth"
IMAGE_INSTALL_append = " xhost"
IMAGE_INSTALL_append = " xvinfo"
IMAGE_INSTALL_append = " xinput"
IMAGE_INSTALL_append = " xdpyinfo"
#IMAGE_INSTALL_append = " xorg-cf-files"

IMAGE_INSTALL_append = " freetype"
# it is important to have openembedded
IMAGE_INSTALL_append = " fontconfig-utils"
IMAGE_INSTALL_append = " ttf-dejavu-common"
IMAGE_INSTALL_append = " ttf-dejavu-sans"
IMAGE_INSTALL_append = " ttf-dejavu-sans-mono"

IMAGE_INSTALL_append = " xorg-minimal-fonts"

#IMAGE_INSTALL_append = " x11vnc"

#it is too big
#IMAGE_INSTALL_append = " packagegroup-core-x11-base"

IMAGE_INSTALL_append = " xinput-calibrator"

#neet for asck touchscreencalib
#IMAGE_INSTALL_append = " zenity"
IMAGE_INSTALL_append = " dialog"
IMAGE_INSTALL_append = " xterm"
#IMAGE_INSTALL_append = " fbida"

IMAGE_INSTALL_append = " python-pygtk"

IMAGE_INSTALL_append = " \
    qtbase \
    qtbase-fonts \
    qtdeclarative \
    qtlocation \
    qtmultimedia \
    qtquickcontrols \
    qtscript \
    qtserialport \
    qttools \
    qtxmlpatterns \
"

inherit populate_sdk_qt5

TOOLCHAIN_HOST_TASK_append = " nativesdk-qttools-tools"

IMAGE_INSTALL_append = " libicui18n"

remove_calibrate() {
      rm -f ${IMAGE_ROOTFS}${sysconfdir}/xdg/autostart/xinput_calibrator.desktop
}


ROOTFS_POSTPROCESS_COMMAND += "remove_calibrate; "

SDKIMAGE_FEATURES ?= "dev-pkgs"

