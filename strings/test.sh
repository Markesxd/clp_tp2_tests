#!/bin/bash

for n in {10000..100000..5000}
do
    ./stringGen/stringGen $n > input

    for dir in test*/
    do
        for file in $dir*
        do
            if [[ $file == *'.c' ]] || [ $file = ${dir}makefile ] || [[ $file == *'.java' ]]
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
            elif [[ $file == *'.py' ]]
            then
                echo -n ${n},py, >> ./results/output$1
                python3 ${file} $n < input >> ./results/output$1
            elif [[ $file == *'.class' ]]
            then
                echo -n ${n},java, >> ./results/output$1
                jfile="${file%%.*}"
                java -cp $dir ${jfile##*/} $n < input >> ./results/output$1
            else
                echo -n ${n},c, >> ./results/output$1
                $file $n < input >> ./results/output$1
            fi
        done
    done
done

rm input