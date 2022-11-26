#!/bin/bash

for n in {10000..10000..5000}
do
    ./floatGen/floatGen $n > input

    for dir in ./test*/
    do
        for file in $dir*
        do
            if [[ $file == *'.c' ]] || [ $file = ${dir}makefile ]
            then
                continue
            elif [[ $file == *'.php' ]]
            then
                echo -n ${n},php, >> ./results/output$1
                php ${file} $n < input >> ./results/output$1
            elif [[ $file == *'.js' ]]
            then
                echo -n ${n},js, >> ./results/output$1
                node ${file} $n < input >> ./results/output$1
            else
                echo -n ${n},c, >> ./results/output$1
                $file $n < input >> ./results/output$1
            fi
        done
    done
done

rm input