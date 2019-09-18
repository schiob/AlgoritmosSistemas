L = list(map(str, input("Maldita sea manuel, por lo menos dame los nombres: ").split()))
def selectionSort(L):
    for i in range(len(L)):
        indxmin = i
        for j in range(i+1, len(L)):
            if len(L[j]) < len(L[indxmin]):
                indxmin = j
                #print(' '.join(L)) Para ver como va ordenando#
        t = L[i]
        L[i] = L[indxmin]
        L[indxmin] = t 
selectionSort(L)
print(' '.join(L), end="")