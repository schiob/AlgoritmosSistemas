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
    def selection_order(arr):
        quicksort(arr, 0, len(arr) - 1)

    n = int(input("Ingrese el número de medicamentos: "))

    medicamentos = []
    print("Ingrese el nombre de los medicamentos:")
    for i in range(n):
        nombre_medicamento = input()
        medicamentos.append(nombre_medicamento)

    selection_order(medicamentos)
    print("Medicamentos ordenados:", medicamentos)
