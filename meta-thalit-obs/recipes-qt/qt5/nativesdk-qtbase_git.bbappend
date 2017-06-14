# Add OE_QMAKE_STRIP to the environment file

fakeroot do_generate_qt_environment_file_append() {
    mkdir -p ${D}${SDKPATHNATIVE}/environment-setup.d/
    script=${D}${SDKPATHNATIVE}/environment-setup.d/qt5.sh

    echo 'export OE_QMAKE_STRIP=$STRIP' >> $script
}
