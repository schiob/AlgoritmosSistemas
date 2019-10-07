def MergeSort(ar):
    if len(ar) > 1:
        mid = len(ar)//2
        L = ar[:mid]
        R = ar[mid:]
        
        MergeSort(L)
        MergeSort(R)

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

ar = []
n = int(input("Range: "))
for i in range(n):
    bks= input("Name Book: ").split()
    ar.append(bks)
MergeSort(ar)
for i in ar:
    print(''.join(i[0]), end=" ")

    #SALIDA
#Flatland HarryPotter CleanCode Mistborn GodelEscherBach