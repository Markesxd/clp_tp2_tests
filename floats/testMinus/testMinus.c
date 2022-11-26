#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char **argv){
    if(argc < 2){
        printf("Voce esqueceu o parametro\n");
        return 1;
    }
    int n = atoi(argv[1]);
    float floats[n];
    for(int i = 0; i < n; i++){
        scanf("%f", &floats[i]);
    }
    time_t t1, t2;

    t1 = clock();
    float num;
    for(int i = 0; i < n; i += 2){
        num = floats[i] - floats[i + 1];
    }
    t2 = clock();

    printf("%f\n", (t2 - t1) / (double) CLOCKS_PER_SEC);

    return 0;
}