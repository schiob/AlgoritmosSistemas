

def quicksort(arr, inicio, fin):
    if fin <= inicio:
        return 

    pivoteIdx = inicio
    compActual = fin

    while pivoteIdx != compActual:
        if compActual > pivoteIdx:
            if arr[compActual] > arr[pivoteIdx]:
                compActual -= 1
            else:
                arr[compActual], arr[pivoteIdx] = arr[pivoteIdx], arr[compActual]
                tempIdx = compActual
                compActual = pivoteIdx
                pivoteIdx = tempIdx
                compActual += 1
        else:
            if arr[compActual] <= arr[pivoteIdx]:
                compActual += 1
            else:
                arr[compActual], arr[pivoteIdx] = arr[pivoteIdx], arr[compActual]
                tempIdx = compActual
                compActual = pivoteIdx
                pivoteIdx = tempIdx
                compActual -= 1

    quicksort(arr, inicio, pivoteIdx - 1)
    quicksort(arr, pivoteIdx + 1, fin)

def BinarySearch(arr,start,end,search):
    if end < start:
        return -1
    
    middle = (start + end) // 2

    if arr[middle] == search:
        return middle
    if search < arr[middle]:
        return BinarySearch(arr, start, middle - 1, search)
    else:
        return BinarySearch(arr, middle + 1, end, search)


if __name__ == "__main__":
    N=int(input("Ingrese la cantidad de canciones en la playlist"))
    Q=int(input("Ingrese la cantidad de canciones que busca"))

    songs=str(input("Ingrese las canciones de la playlist:"))

    arreglo=list(map(str,songs.split()[:N]))

    

    q=(str(input("Ingresa las canciones que busca: ")))
    
    arr_buscados=list(map(str,q.split()[:Q]))

    quicksort(arreglo,0,len(arreglo)- 1)

    print(arreglo)

    BinarySearch(arreglo,0, len(arreglo),q)
    print(BinarySearch) 
    