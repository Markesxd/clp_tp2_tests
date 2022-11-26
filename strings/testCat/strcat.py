import time

def strcat():
    str1 = input("Insira o arquivo para concatenar a string: ")
    str2 = input("Insira as strings a serem concatenadas: ")
    
    t1 = time.time()
    for i in range(0, len(str2)):
        str1[i] = str1[i] + str2[i];
    t2 = time.time()
    print(t2 - t1)