import time

def strlen():
    str1 = input("Insira o arquivo para contar a string: ")
    
    t1 = time.time()
    len(str1)
    t2 = time.time()
    print(t2 - t1)