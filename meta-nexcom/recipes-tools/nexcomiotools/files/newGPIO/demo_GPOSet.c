#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/ioctl.h>
#include <termios.h>
#include "GPIO_IO.h"


int main(int argc , char *argv[])
{
	char key,key1;
	printf("Please select which GPIO pin you wnat to set :\n");
       	printf("1) Set GPO1\n");
	printf("2) Set GPO2\n"); 
	printf("3) Set GPO3\n"); 
	printf("4) Set GPO4\n"); 
	printf("Please select the number of GPO(1~4):");
        scanf("%c",&key);
        switch (key) {
		case '1':
		case '2':
		case '3':
		case '4':
			break;
		default:
                        printf("The number of you select is wrong, please execute this program again.\n");
			return -1;
	}
        printf("0) Low level\n");
        printf("1) High Level\n");                     
        printf("Please select which type of GPIO you wnat to set :");
	scanf(" %c",&key1);
        switch (key1) {
                case '0':
	        case '1':
                       break;  
                default:
                        printf("The GPIO type of you select is wrong, please execute this program again.\n");
			return -1;
        }
	GPO_Set(key,key1);
	printf("This setting has been finished.\n");
	return 0;
}

