import time

def strcpy():
    str1 = input("Insira o arquivo para copiar a string: ")
    str2 = input("Insira as strings a serem copiadas: ")
    
    t1 = time.time()
    str1 = str1 + str2;
    t2 = time.time()
    print(t2 - t1)