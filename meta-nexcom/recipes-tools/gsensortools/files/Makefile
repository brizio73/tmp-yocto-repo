PWD 		:= $(shell pwd)

obj-m := all

.PHONY: all xyz register clean

all: xyz register

xyz: G-sensor_API.o demo_ByXYZ.o
	$(CC) -o demo_ByXYZ demo_ByXYZ.o G-sensor_API.o

register: G-sensor_API.o demo_ByRegister.o
	$(CC) -o demo_ByRegister demo_ByRegister.o G-sensor_API.o

clean:
	rm -f demo_ByXYZ demo_ByRegister *.o
