import time

def strcmp():
    str1 = input("Insira o arquivo da primeira string: ")
    str2 = input("Insira o arquivo da segunda string: ")
    
    t1 = time.time()
    for i in range(0, len(str1)):
        if str1[i] == str2[i]:
            print("As strings são iguais")
        else:
            print("As strings são diferentes")
            break
    t2 = time.time()
    print(t2 - t1)