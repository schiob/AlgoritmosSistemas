def QuickSort(arreglo, inicio, final):
    if inicio >= final:
        return
    #dividir el arreglo
    pivote = inicio
    primer_mas_grande = inicio + 1

    for i in range(inicio + 1, final + 1):
        if arreglo[i][1] < arreglo[pivote][1]:
            arreglo[primer_mas_grande], arreglo[i] = arreglo[i], arreglo[primer_mas_grande]
            primer_mas_grande += 1

    arreglo[pivote], arreglo[primer_mas_grande - 1] = arreglo[primer_mas_grande - 1], arreglo[pivote]
    pivote = primer_mas_grande

    #resolver las partes de forma recursiva
    QuickSort(arreglo, inicio, pivote - 1)
    QuickSort(arreglo, pivote + 1, final)


if __name__ == "__main__":
    print("numero de autos en la lista de juan:")
    n = int(input())
    print("Ingresa el nombre del auto y su kilometraje:")
    autos = []

    for i in range(n):
        auto, kilometraje = input().split()
        autos.append((auto, int(kilometraje)))

    QuickSort(autos, 0, len(autos) - 1)
    print("Los autos ordenados de mayor a menos kilometraje:")
    for auto in reversed(autos):
        print(auto[0], end=" ")
