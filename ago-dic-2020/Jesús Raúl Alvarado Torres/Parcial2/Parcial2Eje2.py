def quickSort(arr, izq, der):
    if izq >= der:
        return

    pivote = izq
    comparador = der

    while comparador != pivote:
        if comparador > pivote:
            if arr[comparador] <= arr[pivote]:
                #Intercambio valor
                temp = arr[pivote]
                arr[pivote] = arr[comparador]
                arr[comparador] = temp

                #Intercambio de indice
                temp_idx = pivote
                pivote = comparador
                comparador = temp_idx
        else:
            if arr[comparador] > arr[pivote]:
                #Intercambio valor
                temp = arr[pivote]
                arr[pivote] = arr[comparador]
                arr[comparador] = temp

                #Intercambio de indice
                temp_idx = pivote
                pivote = comparador
                comparador = temp_idx

                #Aumentar valor 
        if comparador > pivote:
            comparador -= 1
        else:
            comparador += 1

    quickSort(arr, izq, pivote-1)
    quickSort(arr, pivote+1, der)

def BusquedaBinaria(arr, izq, der, buscando):
    mitad = int((izq+der)/2)

    if arr[mitad] == buscando:
        return mitad

    if izq == der:
        return -1

    if arr[mitad] < buscando:
        return BusquedaBinaria(arr, mitad+1, der, buscando)

    else:
        return BusquedaBinaria(arr, izq, mitad-1, buscando)
    
n, m = map(int, input("").split())
arr = list(map(int, input("").split()))

quickSort(arr, 0, len(arr)-1)
print(BusquedaBinaria(arr, 0, len(arr)-1, m)+1)