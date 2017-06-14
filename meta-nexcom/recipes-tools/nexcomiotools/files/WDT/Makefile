.PHONY: all alive wdt clean

all: alive wdt

alive: WDT_Set.o demo_alive.o
	$(CC) -o demo_alive demo_alive.o WDT_Set.o

wdt: WDT_Set.o demo_WDT.o
	$(CC) -o demo_WDT demo_WDT.o WDT_Set.o

clean:
	rm -f demo_alive demo_WDT *.o
