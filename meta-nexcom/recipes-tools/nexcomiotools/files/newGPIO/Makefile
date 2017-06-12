.PHONY: all gpiget gposet clean

all: gpiget gposet

gpiget: GPIO_Set.o demo_GPIGet.o
	$(CC) -o demo_GPIGet demo_GPIGet.o GPIO_Set.o

gposet: GPIO_Set.o demo_GPOSet.o
	$(CC) -o demo_GPOSet demo_GPOSet.o GPIO_Set.o

clean:
	rm -f demo_GPIGet demo_GPOSet *.o
