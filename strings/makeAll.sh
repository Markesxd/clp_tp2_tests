#!/bin/bash
for test in ./*/
do
    if [ $test = ./results/ ]
    then
        continue
    fi
    cd $test
    make all
    cd ..
done