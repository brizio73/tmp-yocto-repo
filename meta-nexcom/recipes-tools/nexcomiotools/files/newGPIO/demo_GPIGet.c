#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/ioctl.h>
#include <termios.h>
#include "GPIO_IO.h"


int main(int argc , char *argv[])
{
	int value=0,type=0;
	
        value = GPI_Get();
        printf("GPI register is %x\n",value);
/*  
	The bit0~bit3 of "value" is output level of GPO1~GPO4 by your setting.         
	The bit4~bit7 of "value" is GPI1~GPI4 level, bit4 of "value" is GPI1, bit5 of "value" is GPI2 and so on.
	The level of GPI is "low" if bit of "value" is '0', and The level of GPI is "high" if bit of "value" is '1'
        For example, if "value" is 0x74 and GPO & GPI level is as below.
                GPO1 : 0 ; you set GPO1 to low level 
                GPO2 : 0 ; you set GPO2 to low level 
                GPO3 : 1 ; you set GPO3 to high level 
                GPO4 : 0 ; you set GPO4 to low level 
                GPI1 : 1 ; GPI1 input level is high
                GPI2 : 1 ; GPI2 input level is high
		GPI3 : 1 ; GPI3 input level is high
                GPI4 : 0 ; GPI4 input level is low                 
*/


	return 0;
}

