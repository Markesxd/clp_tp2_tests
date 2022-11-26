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
    char strings[n][15];
    for(int i = 0; i < n; i++){
        scanf("%s", strings[i]);
    }
    time_t t1, t2;

    t1 = clock();
    for(int i = 0; i < n; i++){
        size_t len;
        len = strlen(strings[i]);
    }
    t2 = clock();

    printf("%f\n", (t2 - t1) / (double) CLOCKS_PER_SEC);

    return 0;
}