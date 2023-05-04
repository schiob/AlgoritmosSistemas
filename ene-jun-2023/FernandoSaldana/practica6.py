def quicksort(concursantes):
    if len(concursantes) <= 1:
        return concursantes

    pivote = concursantes[0]
    iguales = []
    mayores = []
    menores = []r

    for concursante in concursantes:
        if concursante[1:] == pivote[1:]:
            iguales.append(concursante)
        elif concursante[1] > pivote[1] or (concursante[1] == pivote[1] and concursante[2] > pivote[2]) or (concursante[1] == pivote[1] and concursante[2] == pivote[2] and concursante[3] > pivote[3]) or (concursante[1:] == pivote[1:] and concursante[0] < pivote[0]):
            mayores.append(concursante)
        else:
            menores.append(concursante)

    return quicksort(mayores) + iguales + quicksort(menores)


n = int(input("Ingresa la lista de concursantes y sus medallas de oro, plata y bronce"))
concursantes = []

for i in range(n):
    s, x, y, z = input().split()
    concursantes.append((s, int(x), int(y), int(z)))

ordenados = quicksort(concursantes)

for concursante in ordenados:
    print(concursante[0])
