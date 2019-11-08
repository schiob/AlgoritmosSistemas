def MergeSort(arr):
    if len(arr) > 1:
        mid = len(arr)//2
        L = arr[:mid]
        R = arr[mid:]

        MergeSort(L)
        MergeSort(R)

        i = j = k = 0

        while i < len(L) and j < len(R):
            if int(L[i][1]) < int(R[j][1]):
                arr[k] = L[i]
                i+=1
            else: 
                arr[k] = R[j]
                j+=1
            k+=1

        while i < len(L):
            arr[k] =L[i]
            i+=1
            k+=1
        while j < len(R):
            arr[k] = R[j]
            j+=1
            k+=1

ar = []
n = int(input("Cuantos libros son?: "))
for i in range(n):
    b = input("tituo del libro: ").split()
    ar.append(b)
MergeSort(ar)
for i in ar:
    print(''.join(i[0]), end=" ")