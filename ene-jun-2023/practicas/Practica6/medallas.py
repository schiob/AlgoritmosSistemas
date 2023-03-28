def ordenar_por_medallas(concursante):
    # función personalizada de ordenamiento
    nombre, medallas = concursante
    oro, plata, bronce = medallas
    return (-oro, -plata, -bronce, nombre)

def quicksort(lista):
    # algoritmo Quicksort
    if len(lista) <= 1:
        return lista
    pivot = lista[0]
    left = []
    right = []
    for i in range(1, len(lista)):
        if ordenar_por_medallas(lista[i]) < ordenar_por_medallas(pivot):
            left.append(lista[i])
        else:
            right.append(lista[i])
    return quicksort(left) + [pivot] + quicksort(right)

# lectura de input
n = int(input())
concursantes = []
for i in range(n):
    s, x, y, z = input().split()
    medallas = (int(x), int(y), int(z))
    concursantes.append((s, medallas))

# ordenamiento con Quicksort
concursantes_ordenados = quicksort(concursantes)

# impresión de resultados
for concursante in concursantes_ordenados:
    nombre, medallas = concursante
    print(nombre, medallas[0], medallas[1], medallas[2])
