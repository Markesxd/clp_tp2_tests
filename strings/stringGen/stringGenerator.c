#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char **argv){
    int n = atoi(argv[1]);
    srand(time(0));
    for(int i = 0; i < n; i++){
        int size = 5 + rand() % 8;
        char string[size + 1];
        for(int j = 0; j < size; j++){
            string [j] = 'a' + rand() % ('z' - 'a');
        }
        string[size] = '\0';
        printf("%s\n", string);
    }
    return 0;
}