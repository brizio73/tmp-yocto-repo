#!/bin/bash

echo "AUDIO test"

echo "Plug a mic and a headphone or speaker in..."
read cmd

echo "Recording... ctrl+c to stop"
arecord -vv -fdat testsound.wav

echo "Reproducing... "
aplay -vv testsound.wav

rm testsound.wav
echo -ne "Did you hear something (Y/n)? "
read resp

if [ "${resp:-"y"}" != "y" ]; then
	echo "AUDIO test FAILED"
	exit 1
fi	

echo "*** AUDIO test OK"
