#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/ioctl.h>
#include <termios.h>
#include "G-sensor.h"


int main(int argc , char *argv[])
{
	int fh=0, value=0,value1=0,value2=0,x=0;
	char key,key1;
	fh = open("/dev/NEXCOM_SMBus", O_RDWR);

        if (fh<=0)
        {
                printf("NEXCOM_SMBus driver cannot be opened.\n");
                return -1;
        }
        
	InitAccelerometer(fh);
	printf("Please select which value you wnat to get :\n");
       	printf("1) Get X-Axis value\n"); 
	printf("2) Get Y-Axis value\n"); 
	printf("3) Get Z-Axis value\n"); 
	printf("4) Get XYZ-Axis value\n");
	printf("Please select the number (1~4):");
        scanf("%c",&key);
        switch (key) {
		case '1':
			x=1;
			break;	
		case '2':
			x=2;
			break;
		case '3':
			x=3;
			break;
		case '4':
			x=4;
			break;
		default:
                        printf("The number of you select is wrong, please execute this program again.\n");
			return -1;
	}
        
	if ( x==1)
	{
		G_Sensor_X_Axis(&value,fh);
		printf("This value of X-Axis is 0x%x.\n",value);
	}
	else if ( x==2)
	{
		G_Sensor_Y_Axis(&value,fh);
		printf("This value of Y-Axis is 0x%x.\n",value);
	}
	else if ( x==3)
	{
		G_Sensor_Z_Axis(&value,fh);
		printf("This value of Z-Axis is 0x%x.\n",value);
	}
	else
	{
		G_Sensor_3_Axis(&value,&value1,&value2,fh);
		printf("This value of X-Axis is 0x%x.\n",value);
 		printf("This value of Y-Axis is 0x%x.\n",value1);
 		printf("This value of Z-Axis is 0x%x.\n",value2);
	}
	exit(0);
}

