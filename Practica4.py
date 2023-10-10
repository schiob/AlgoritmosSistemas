def ordenar_seleccion(lista):
    n = len(lista)

    for i in range(n):
        # Encuentra el índice del mínimo elemento restante
        indice_minimo = i
        for j in range(i + 1, n):
            if lista[j] < lista[indice_minimo]:
                indice_minimo = j

        # Intercambia el mínimo elemento con el primero no ordenado
        lista[i], lista[indice_minimo] = lista[indice_minimo], lista[i]

# Lee el número de palabras
n = int(input())

# Lee la lista de palabras
palabras = input().split()

# Llama a la función de ordenar selección
ordenar_seleccion(palabras)

# Imprime la lista ordenada
for palabra in palabras:
    print(palabra)
