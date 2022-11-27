from time import time
from sys import argv

def strcat():
    n = int(argv[1])
    floats = []
    forRange = range(0, n, 2)
    for i in range(0, n):
        floats.append(float(input('')))

    t1 = time()
    for i in forRange:
        floats[i] = floats[i] == floats[i + 1]
    t2 = time()
    print(t2 - t1)


if( __name__ == '__main__'):
    strcat()