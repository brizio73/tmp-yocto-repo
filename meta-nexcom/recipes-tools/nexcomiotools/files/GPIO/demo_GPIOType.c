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
    printf("1) Set GPIO1\n");
	printf("2) Set GPIO2\n"); 
	printf("3) Set GPIO3\n"); 
	printf("4) Set GPIO4\n"); 
	printf("5) Set GPIO5\n");
	printf("6) Set GPIO6\n"); 
	printf("7) Set GPIO7\n");
    printf("8) Set GPIO8\n");
	printf("Please select the number of GPIO(1~8):");
    scanf("%c",&key);
    switch (key) {
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
        case '8':
			break;
		default:
            printf("The number of you select is wrong, please execute this program again.\n");
			return -1;
	}
    printf("0) GPI\n");
    printf("1) GPO\n");                     
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
    printf("Setting GPIO %c to type %c...\n", key, key1);
	GPIOType_Set(key,key1);
	printf("This setting has been finished.\n");
	exit(0);
}

