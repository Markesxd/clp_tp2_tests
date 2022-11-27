#!/bin/bash

for a in {1..5}
do
    for n in {10000..100000..5000}
    do
        ./stringGen/stringGen $n > input

        for dir in test*/
        do
            for file in $dir*
            do
                cleanFile="${file%%.*}"
                if [[ $file == *'.c' ]] || [ $file = ${dir}makefile ] || [[ $file == *'.java' ]]
                then
                    continue
                elif [[ $file == *'.php' ]]
                then
                    echo -n "${n},php,${cleanFile##*/}," >> ./results/output$1
                    php ${file} $n < input >> ./results/output$1
                elif [[ $file == *'.js' ]]
                then
                    echo -n "${n},js,${cleanFile##*/}," >> ./results/output$1
                    node ${file} $n < input >> ./results/output$1
                elif [[ $file == *'.py' ]]
                then
                    echo -n "${n},py,${cleanFile##*/}," >> ./results/output$1
                    python3 ${file} $n < input >> ./results/output$1
                elif [[ $file == *'.class' ]]
                then
                    echo -n "${n},java,${cleanFile##*/}," >> ./results/output$1
                    java -cp $dir ${cleanFile##*/} $n < input >> ./results/output$1
                else
                    echo -n "${n},c,${cleanFile##*/}," >> ./results/output$1
                    $file $n < input >> ./results/output$1
                fi
            done
        done
    done
done

rm input