#gstreamer for audio
IMAGE_INSTALL_append = " gstreamer1.0"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-good"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-base-alsa"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-base-audioconvert"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-base-audiorate"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-base-audiotestsrc"
IMAGE_INSTALL_append = " gstreamer1.0-plugins-base-audioresample"

# Asterisk
IMAGE_INSTALL_append = " asterisk"

# linphone
IMAGE_INSTALL_append = " linphone"

#-----------------
#  QT without gui
#------------------
IMAGE_INSTALL_append = " qtbase"
#IMAGE_INSTALL_append = " qtbase-fonts"
#IMAGE_INSTALL_append = " qtdeclarative"
IMAGE_INSTALL_append = " qtlocation"
IMAGE_INSTALL_append = " qtmultimedia"
IMAGE_INSTALL_append = " qtscript"
IMAGE_INSTALL_append = " qtserialport"
IMAGE_INSTALL_append = " qttools"
IMAGE_INSTALL_append = " qtxmlpatterns"

# Qt5 toolchain
inherit populate_sdk_qt5

TOOLCHAIN_HOST_TASK_append = " nativesdk-qttools-tools"

#WHO REQUESTED THIS ONE (libicu...):
IMAGE_INSTALL_append = " icu"

