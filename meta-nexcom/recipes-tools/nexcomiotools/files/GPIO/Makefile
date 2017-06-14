.PHONY: all gpiget gposet gpiotype clean

all: gpiget gposet gpiotype

gpiget: GPIO_Set.o demo_GPIGet.o
	$(CC) -o demo_GPIGet demo_GPIGet.o GPIO_Set.o

gposet: GPIO_Set.o demo_GPOSet.o
	$(CC) -o demo_GPOSet demo_GPOSet.o GPIO_Set.o

gpiotype: GPIO_Set.o demo_GPIOType.o
	$(CC) -o demo_GPIOType demo_GPIOType.o GPIO_Set.o

clean:
	rm -f demo_GPIGet demo_GPOSet demo_GPIOType *.o
