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


if __name__ == "__main__":
  
    n=int(input("Ingrese la cantidad de medicinas a ordenar:"))

    arr=str(input("Ingrese las medicinas a ordenar"))
    arreglo=list(map(str,arr.split()[:n]))


    print(arreglo)
    
    quicksort(arreglo,0,len(arreglo) -1)

    print("Arreglo ordenado")
    print(arreglo)
