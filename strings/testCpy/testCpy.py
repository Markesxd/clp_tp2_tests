from time import time
from sys import argv

def strcat():
    n = int(argv[1])
    strings = []
    for i in range(0, n):
        strings.append(input(''))

    t1 = time()
    buffer = ''
    for str in strings:
        buffer = str
    t2 = time()
    print(t2 - t1)


if( __name__ == '__main__'):
    strcat()