SUMMARY = "Nexcom IO tools"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

RDEPENDS_${PN} += "bash"

SRC_URI += " \
        file://DelayTime/Delay_IO.h \
        file://DelayTime/Delay_Set.c \
        file://DelayTime/demo_DelayON.c \
        file://DelayTime/demo_DelayOFF.c \
        file://newGPIO/GPIO_IO.h \
        file://newGPIO/GPIO_Set.c \
        file://newGPIO/demo_GPOSet.c \
        file://newGPIO/demo_GPIGet.c \
        file://Ignition/Igni.c \
        file://OtherIO/OtherIO.h \
        file://OtherIO/OtherIO.c \
        file://OtherIO/demo_External_12V_Set.c \
        file://OtherIO/demo_GPS_Power_Switch.c \
        file://OtherIO/demo_MCU_GPIO_PANIC_Clear.c \
        file://OtherIO/demo_MCU_GPIO_ReadGPI_Status1.c \
        file://OtherIO/demo_MCU_GPIO_ReadGPI_Status2.c \
        file://OtherIO/demo_MCU_GPIO_ReadGPO_Status1.c \
        file://OtherIO/demo_MCU_GPIO_ReadGPO_Status2.c \
        file://OtherIO/demo_MCU_GPIO_ReadPANIC_Status.c \
        file://OtherIO/demo_MCU_GPIO_SetGPO_Status1.c \
        file://OtherIO/demo_MCU_GPIO_SetGPO_Status2.c \
        file://OtherIO/demo_MCU_GPIO_SetLED_Status.c \
        file://OtherIO/demo_SerialPort_Select.c \
        file://OtherIO/demo_SIM_CARD_Switch.c \
        file://OtherIO/demo_USB2_Power_Switch.c \
        file://OtherIO/demo_USB3_Power_Switch.c \
        file://OtherIO/demo_Voltage_Get.c \
        file://OtherIO/demo_Voltage_Select_Setting.c \
        file://OtherIO/demo_Wake_On_RTC_Switch.c \
        file://OtherIO/demo_Wake_On_Wiress_WAN_Switch.c \
        file://OtherIO/demo_Wireless_LAN_DIS2_L_Switch.c \
        file://OtherIO/demo_Wireless_LAN_DIS3_L_Switch.c \
        file://OtherIO/demo_Wireless_WAN_Switch.c \
        file://WDT/WDT_IO.h \
        file://WDT/WDT_Set.c \
        file://WDT/demo_alive.c \
	    file://WDT/demo_WDT.c"

COMPATIBLE_MACHINE = "(genericx86-64)"

do_compile() {
            ${CC} ${THISDIR}/files/DelayTime/demo_DelayON.c ${THISDIR}/files/DelayTime/Delay_Set.c -o ${WORKDIR}/nexcomio_DelayON 
            ${CC} ${THISDIR}/files/DelayTime/demo_DelayOFF.c ${THISDIR}/files/DelayTime/Delay_Set.c -o ${WORKDIR}/nexcomio_DelayOFF
            ${CC} ${THISDIR}/files/newGPIO/demo_GPIGet.c ${THISDIR}/files/newGPIO/GPIO_Set.c -o ${WORKDIR}/nexcomio_GPIGet 
            ${CC} ${THISDIR}/files/newGPIO/demo_GPOSet.c ${THISDIR}/files/newGPIO/GPIO_Set.c -o ${WORKDIR}/nexcomio_GPOSet 
            ${CC} ${THISDIR}/files/Ignition/Igni.c -o ${WORKDIR}/nexcomio_Ignition
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_External_12V_Set.c -o ${WORKDIR}/nexcomio_External_12V_Set
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_GPS_Power_Switch.c -o ${WORKDIR}/nexcomio_GPS_Power_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_PANIC_Clear.c -o ${WORKDIR}/nexcomio_MCU_GPIO_PANIC_Clear
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_ReadGPI_Status1.c -o ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPI_Status1
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_ReadGPI_Status2.c -o ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPI_Status2
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_ReadGPO_Status1.c -o ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPO_Status1
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_ReadGPO_Status2.c -o ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPO_Status2
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_ReadPANIC_Status.c -o ${WORKDIR}/nexcomio_MCU_GPIO_ReadPANIC_Status
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_SetGPO_Status1.c -o ${WORKDIR}/nexcomio_MCU_GPIO_SetGPO_Status1
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_SetGPO_Status2.c -o ${WORKDIR}/nexcomio_MCU_GPIO_SetGPO_Status2
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_MCU_GPIO_SetLED_Status.c -o ${WORKDIR}/nexcomio_MCU_GPIO_SetLED_Status
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_SerialPort_Select.c -o ${WORKDIR}/nexcomio_SerialPort_Select
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_SIM_CARD_Switch.c -o ${WORKDIR}/nexcomio_SIM_CARD_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_USB2_Power_Switch.c -o ${WORKDIR}/nexcomio_USB2_Power_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_USB3_Power_Switch.c -o ${WORKDIR}/nexcomio_USB3_Power_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_Voltage_Get.c -o ${WORKDIR}/nexcomio_Voltage_Get
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_Voltage_Select_Setting.c -o ${WORKDIR}/nexcomio_Voltage_Select_Setting
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_Wake_On_RTC_Switch.c -o ${WORKDIR}/nexcomio_Wake_On_RTC_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_Wake_On_Wiress_WAN_Switch.c -o ${WORKDIR}/nexcomio_Wake_On_Wiress_WAN_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_Wireless_LAN_DIS2_L_Switch.c -o ${WORKDIR}/nexcomio_Wireless_LAN_DIS2_L_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_Wireless_LAN_DIS3_L_Switch.c -o ${WORKDIR}/nexcomio_Wireless_LAN_DIS3_L_Switch
            ${CC} ${THISDIR}/files/OtherIO/OtherIO.c ${THISDIR}/files/OtherIO/demo_Wireless_WAN_Switch.c -o ${WORKDIR}/nexcomio_Wireless_WAN_Switch
            ${CC} ${THISDIR}/files/WDT/demo_alive.c ${THISDIR}/files/WDT/WDT_Set.c -o ${WORKDIR}/nexcomio_WDT_alive 
            ${CC} ${THISDIR}/files/WDT/demo_WDT.c ${THISDIR}/files/WDT/WDT_Set.c -o ${WORKDIR}/nexcomio_WDT 
}

do_install() {
            # clean old stuff in /sbin
            if [ -f ${D}/usr/sbin/nexcomio_DelayON ]; then
               rm -rf ${D}/usr/sbin/nexcomio_*
            fi

            # install script and application
            install -d ${D}/usr/sbin/
            #install -d ${D}/usr/sbin/nexcom_IO/

            install -m 0755 ${WORKDIR}/nexcomio_DelayON  ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_DelayOFF ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_GPIGet  ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_GPOSet  ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Ignition ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_External_12V_Set ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_GPS_Power_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_PANIC_Clear ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPI_Status1 ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPI_Status2 ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPO_Status1 ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_ReadGPO_Status2 ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_ReadPANIC_Status ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_SetGPO_Status1 ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_SetGPO_Status2 ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_MCU_GPIO_SetLED_Status ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_SerialPort_Select ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_SIM_CARD_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_USB2_Power_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_USB3_Power_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Voltage_Get ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Voltage_Select_Setting ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Wake_On_RTC_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Wake_On_Wiress_WAN_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Wireless_LAN_DIS2_L_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Wireless_LAN_DIS3_L_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_Wireless_WAN_Switch ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_WDT_alive  ${D}/usr/sbin
            install -m 0755 ${WORKDIR}/nexcomio_WDT  ${D}/usr/sbin
}
