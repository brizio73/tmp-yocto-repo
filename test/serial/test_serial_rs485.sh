#!/bin/bash
echo 'To test serial port rs485 proceed as follows.'
echo '* Connect a test PC to the Moxa 5250A'
echo '* Build the driver npreal2. Load it.'
echo '* Set a mapping between the IP address of the Moxa converter '
echo '  and the virtual serial port on the test PC'
echo 'Then verify the following:'
echo '  (on test pc) cat /dev/ttyr00'
echo '  (on nexcom) echo "hello world!" > /dev/ttyS2'
