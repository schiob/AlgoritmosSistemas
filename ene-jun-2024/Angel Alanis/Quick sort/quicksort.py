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
    arr = [5, 6, 7, 3, 14, 8, 5, 4, 3, 2, 1]

    print("Array original:")
    print(arr)

    quicksort(arr, 0, len(arr) - 1)

    print("Array ordenado:")
    print(arr)
