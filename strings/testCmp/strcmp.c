#include <stdio.h>
#include <string.h>
#include <time.h>
int main(int argc, char **argv){
    if(argc < 2){
        printf("Você esqueceu o parametro\n");
        return 1;
    }
    int n = atoi(argv[1]);
    char str1[n][15];
    char str2[n][15];
    for(int i = 0; i < n; i++){
        scanf("%s %s", str1[i], str2[i]);
    }
    time_t t1, t2;
    t1 = clock();
    for(int i = 1; i < n; i++){
        strcmp(str1[i], str2[i]);
    }
    t2 = clock();
    printf("%f\n", (double)(t2 - t1)/CLOCKS_PER_SEC);
    return 0;
}