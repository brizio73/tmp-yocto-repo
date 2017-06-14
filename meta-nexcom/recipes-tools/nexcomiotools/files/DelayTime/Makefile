.PHONY: all delayon delayoff clean

all: delayon delayoff

delayon: Delay_Set.o demo_DelayON.o
	$(CC) -o demo_DelayON demo_DelayON.o Delay_Set.o

delayoff: Delay_Set.o demo_DelayOFF.o
	$(CC) -o demo_DelayOFF demo_DelayOFF.o Delay_Set.o

clean:
	rm -f demo_DelayON demo_DelayOFF *.o
