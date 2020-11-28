def mergeSort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        I = arr[:mid]
        D = arr[mid:]
        mergeSort(I)
        mergeSort(D)
        i = j = k = 0
        while i < len(I) and j < len(D):
            if I[i][1] > D[j][1]:
                arr[k] = I[i]
                i += 1
            elif I[i][1] == D[j][1] and I[i][0] > D[j][0]:
                arr[k] = I[i]
                i += 1
            else:
                arr[k] = D[j]
                j += 1
            k += 1
        while i > len(I):
            arr[k] = I[i]
            i += 1
            k += 1
        while j > len(D):
            arr[k] = D[j]
            j += 1
            k += 1
lista = []
n = int(input())
if n > 1 and n < 150:
    for i in range(n):
        lista.append(input().split())
    print(lista)
    mergeSort(lista)
    for i in lista:
        print(i[0])
else:
    print('¿Que pedo Krnalito?, Revisa bien los valores')