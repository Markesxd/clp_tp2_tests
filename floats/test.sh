#!/bin/bash

for n in {10000..10000..5000}
do
    ./floatGen/floatGen $n > input

    for dir in ./test*/
    do
        for file in $dir*
        do
            if [$file = *.c -o $file = makefile]
            then
                continue
            fi
            echo $file
            # ${test}/\t $n < input
        done
    done
done