def QuickSort(arr, start, end):
    if start >= end:
        return

    # Dividir el arr
    pivot_idx = start
    primer_mas_grade = start + 1

    for i in range(start + 1, end + 1):
        if arr[i][1] > arr[pivot_idx][1]:
            arr[primer_mas_grade], arr[i] = arr[i], arr[primer_mas_grade]
            primer_mas_grade += 1

    arr[pivot_idx], arr[primer_mas_grade - 1] = arr[primer_mas_grade - 1], arr[pivot_idx]

    pivot_idx = primer_mas_grade - 1

    # Resolver las partes de forma recursiva
    QuickSort(arr, start, pivot_idx - 1)
    QuickSort(arr, pivot_idx + 1, end)

if __name__ == "__main__":
    # Entrada 
    #Lee la cantidad de Autos para juan junto con los nombres y la cantidad de kilometraje
    n = int(input("Ingrese la cantidad de autos que tiene Juan: "))
    print("Ingresa el nombre de los autos y el kilometraje")
    autos = [] 

    for _ in range(n):
        name, km = input().split()
        autos.append((name, int(km)))

    #Llamar a la función de ordenación Marge Sort
    QuickSort(autos, 0, len(autos) - 1)

    print(" ")
    # Imprimir la lista ordenada de autos
    print("La lista ordenada de autos es la siguiente")
    for autoss in autos:
        print(autoss)