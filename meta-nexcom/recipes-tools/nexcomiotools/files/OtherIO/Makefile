.PHONY: all clean

all: OtherIO.o
	$(CC) -o External_12V_Set OtherIO.o demo_External_12V_Set.c
	$(CC) -o GPS_Power_Switch OtherIO.o demo_GPS_Power_Switch.c
	$(CC) -o MCU_GPIO_PANIC_Clear OtherIO.o demo_MCU_GPIO_PANIC_Clear.c
	$(CC) -o MCU_GPIO_ReadGPI_Status1 OtherIO.o demo_MCU_GPIO_ReadGPI_Status1.c
	$(CC) -o MCU_GPIO_ReadGPI_Status2 OtherIO.o demo_MCU_GPIO_ReadGPI_Status2.c
	$(CC) -o MCU_GPIO_ReadGPO_Status1 OtherIO.o demo_MCU_GPIO_ReadGPO_Status1.c
	$(CC) -o MCU_GPIO_ReadGPO_Status2 OtherIO.o demo_MCU_GPIO_ReadGPO_Status2.c
	$(CC) -o MCU_GPIO_ReadPANIC_Status OtherIO.o demo_MCU_GPIO_ReadPANIC_Status.c
	$(CC) -o MCU_GPIO_SetGPO_Status1 OtherIO.o demo_MCU_GPIO_SetGPO_Status1.c
	$(CC) -o MCU_GPIO_SetGPO_Status2 OtherIO.o demo_MCU_GPIO_SetGPO_Status2.c
	$(CC) -o MCU_GPIO_SetLED_Status OtherIO.o demo_MCU_GPIO_SetLED_Status.c
	$(CC) -o SerialPort_Select OtherIO.o demo_SerialPort_Select.c
	$(CC) -o SIM_CARD_Switch OtherIO.o demo_SIM_CARD_Switch.c
	$(CC) -o USB2_Power_Switch OtherIO.o demo_USB2_Power_Switch.c
	$(CC) -o USB3_Power_Switch OtherIO.o demo_USB3_Power_Switch.c
	$(CC) -o Voltage_Get OtherIO.o demo_Voltage_Get.c
	$(CC) -o Voltage_Select_Setting OtherIO.o demo_Voltage_Select_Setting.c
	$(CC) -o Wake_On_RTC_Switch OtherIO.o demo_Wake_On_RTC_Switch.c
	$(CC) -o Wake_On_Wiress_WAN_Switch OtherIO.o demo_Wake_On_Wiress_WAN_Switch.c
	$(CC) -o Wireless_LAN_DIS2_L_Switch OtherIO.o demo_Wireless_LAN_DIS2_L_Switch.c
	$(CC) -o Wireless_LAN_DIS3_L_Switch OtherIO.o demo_Wireless_LAN_DIS3_L_Switch.c
	$(CC) -o Wireless_WAN_Switch OtherIO.o demo_Wireless_WAN_Switch.c

clean:
	rm -f External_12V_Set GPS_Power_Switch MCU_GPIO_PANIC_Clear MCU_GPIO_ReadGPI_Status1 MCU_GPIO_ReadGPI_Status2 MCU_GPIO_ReadGPO_Status1 MCU_GPIO_ReadGPO_Status2 MCU_GPIO_ReadPANIC_Status MCU_GPIO_SetGPO_Status1 MCU_GPIO_SetGPO_Status2 MCU_GPIO_SetLED_Status SerialPort_Select SIM_CARD_Switch USB2_Power_Switch USB3_Power_Switch Voltage_Get Voltage_Select_Setting Wake_On_RTC_Switch Wake_On_Wiress_WAN_Switch Wireless_LAN_DIS2_L_Switch Wireless_LAN_DIS3_L_Switch Wireless_WAN_Switch *.o
