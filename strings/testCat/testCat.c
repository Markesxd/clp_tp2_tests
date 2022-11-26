#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>

int main(int argc, char **argv){
    if(argc < 2){
        printf("Voce esqueceu o parametro\n");
        return 1;
    }
    int n = atoi(argv[1]);
    if(n % 2 != 0){
        printf("O numero de strings deve ser par\n");
        return 2;
    }
    char strings[n][30];
    for(int i = 0; i < n; i++){
        scanf("%s", strings[i]);
    }
    time_t t1, t2;

    t1 = clock();
    for(int i = 0; i < n / 2; i += 2){
        strcat(strings[i], strings[i + 1]);
    }
    t2 = clock();

    printf("%f\n", (t2 - t1) / (double) CLOCKS_PER_SEC);

    return 0;
}