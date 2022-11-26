#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char **argv){
    if(argc < 2){
        printf("Esqueceu de passar o parametro\n");
        return 1;
    }
    srand(time(0));
    int n = atoi(argv[1]);
    for(int i = 0; i < n; i++){
        size_t num = 1099500329 + rand();
        float fnum;
        fnum = * (float*) &num; //thx quake
        if(fnum < 0.0000001 || !(fnum == fnum)){
            i--;
            continue;
        }
        printf("%f\n", fnum);
    }

    return 0;
}