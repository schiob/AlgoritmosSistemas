def mergeSort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        izq = arr[:mid]
        der = arr[mid:]
        mergeSort(izq)
        mergeSort(der)
        i = j = k = 0
        while i < len(izq) and j < len(der):
            if izq[i][1] > der[j][1]:
                arr[k] = izq[i]
                i += 1
            else:
                arr[k] = der[j]
                j += 1
            k += 1
        while i > len(izq):
            arr[k] = izq[i]
            i += 1
            k += 1
        while j > len(der):
            arr[k] = der[j]
            j += 1
            k += 1


tareas = []
n = int(input())


if 1 < n < 500:
    for i in range(n):
        tareas.append(input().split())
    mergeSort(tareas)
    if n == len(tareas):
        for i in tareas:
            print(i[0])
    else:
        print('Verifique la informacion')
else:
    print('Solo se pueden evaluar entre 1 y 500 elementos')
