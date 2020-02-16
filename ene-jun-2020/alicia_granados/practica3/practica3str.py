
n=int(input())
arreglo=[]

#ingresa
for i in range (int (n)):
    arreglo.append(input(str (i)))

#ordena 
def selectionSort(L):
    for i in range(len(L)):
        indxmin = i
        for j in range(i+1, len(L)):
            if len(L[j]) > len(L[indxmin]):
                indxmin = j
                #
        t = L[i]
        L[i] = L[indxmin]
        L[indxmin] = t 
selectionSort(arreglo)

#imprime
for i in range (int (n)):
    print(arreglo[i])





 
