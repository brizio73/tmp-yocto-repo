#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <sys/ioctl.h>
#include <termios.h>
#define BASEADDR 0x0EE4         // GPO & GPI Base address


int GPO_Set(char number, char level)
{
	int bfr=0,bfr1=0,fh,cnt;	
  	fh = open("/dev/NEXCOM_IO", O_RDWR);
	if (fh==0)
	{
		printf("NEXCOM_IO driver cannot be opened.\n");
		return -1;
	}
	
        read(fh,&bfr1,BASEADDR);
	if (level =='0'){
                switch (number) {
                        case '1':
                                bfr=bfr1 & 0xfe;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        case '2':
                                bfr=bfr1 & 0xfd;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        case '3':
                                bfr=bfr1 & 0xfb;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        case '4':
                                bfr=bfr1 & 0xf7;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        default:
                                printf("The GPO number of you select is wrong, please execute this program again.\n");
                        close(fh);
                        return -1;
                }

        }
	else if ( level == '1'){
                   switch (number) {
                        case '1':
                                bfr=bfr1 | 0x01;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        case '2':
                                bfr=bfr1 | 0x02;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        case '3':
                                bfr=bfr1 | 0x04;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        case '4':
                                bfr=bfr1 | 0x08;
                                cnt = write(fh,&bfr,BASEADDR);
                        break;
                        
                        default:
                                printf("The GPO number of you select is wrong, please execute this program again.\n");
                        close(fh);
                        return -1;
                }

        }
  	else {
                 printf("The GPIO level of you select is wrong, please execute this program again.\n");
                        close(fh);
                        return -1;

        }
        close(fh);
        return 0;
}

int GPI_Get()
{
        int bfr=0,bfr1=0,fh,cnt;
        fh = open("/dev/NEXCOM_IO", O_RDWR);
        if (fh==0)
        {
                printf("NEXCOM_IO driver cannot be opened.\n");
                return -1;
        }

        read(fh,&bfr1,BASEADDR);
        close (fh);
	return bfr1;

}


