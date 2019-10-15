def MergeSort(arr):
    if len(arr) > 1:
        mid = len(arr)//2
        I = arr[:mid]
        D = arr[mid:]

        MergeSort(I)
        MergeSort(D)

        i = j = k = 0

        while i < len(I) and j < len(D):
            if int(I[i][1]) < int(D[j][1]):
                arr[k] = I[i]
                i+=1
            else: 
                arr[k] = D[j]
                j+=1
            k+=1

        while i < len(I):
            arr[k] = I[i]
            i+=1
            k+=1
        while j < len(D):
            arr[k] = D[j]
            j+=1
            k+=1

ar = []
n = int(input("Cuantos libros Juan?: "))
for i in range(n):
    lbs = input("tituo del libro: ").split()
    ar.append(lbs)
MergeSort(ar)
for i in ar:
    print(''.join(i[0]), end=" ")