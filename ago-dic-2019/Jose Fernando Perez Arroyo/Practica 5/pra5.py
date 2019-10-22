def mergeSort(ar):
    if len(ar) > 1:
        mid = len(ar)//2
        L = ar[:mid]
        R = ar[mid:]

        mergeSort(L)
        mergeSort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if int(L[i][1]) < int(R[j][1]):
                ar[k] = L[i]
                i+=1
            else: 
                ar[k] = R[j]
                j+=1
            k+=1

        while i < len(L):
            ar[k] = L[i]
            i+=1
            k+=1
        while j < len(R):
            ar[k] = R[j]
            j+=1
            k+=1

derf = []
n = int(input("Numero de registros : "))
for i in range(n):
    ward= input("Nombre del libro y paginas : ").split()
    derf.append(ward) 
    mergeSort(derf)
for i in derf:
    print(''.join(i[0]), end=" ")