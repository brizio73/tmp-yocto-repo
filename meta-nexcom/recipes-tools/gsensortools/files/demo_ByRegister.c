#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/ioctl.h>
#include <termios.h>
#include "G-sensor.h"


int main(int argc , char *argv[])
{
	int fh=0, value=0,rData=0,wData=0,x=0;
	char key;
	fh = open("/dev/NEXCOM_SMBus", O_RDWR);
        if (fh<=0)
        {
                printf("NEXCOM_SMBus driver cannot be opened.\n");
                return -1;
        }
        
	InitAccelerometer(fh);

	printf("Please select which command you wnat to set (read or write) :\n");
       	printf("1) Read G-sensor register.\n"); 
	printf("2) Write G-sensor register.\n"); 
	printf("Please select the number (1~2):");
        scanf("%c",&key);
        switch (key) {
		case '1':
			break;	
		case '2':
			break;
		default:
                        printf("The number of you select is wrong, please execute this program again.\n");
			return -1;
	}
        
	printf("Please key in which register you want to set (please key in Hexadecimal value): 0x");
        scanf(" %x",&value);
	if (key=='1')
	{
		x = G_Sensor_Read(value , &rData,fh);
		if (x==-1)
		{
			printf("This register is out of range, please execute this program again.\n");
			exit(0);	
		}        
		else
			printf("The value of register is %x\n",rData);
	}
	if (key=='2')
        {
                printf("Please key in which data you want to set (please key in Hexadecimal value): 0x");
		scanf(" %x",&wData);
		x = G_Sensor_Write(value ,wData,fh);
                if (x==-1)
                {
                        printf("This register is out of range, please execute this program again.\n");  
                        exit(0);  
                }
                else
                        printf("The data of register is already set to G-sensor\n");
        }

	exit(0);
}

