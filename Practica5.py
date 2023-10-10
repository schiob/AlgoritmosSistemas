def merge_sort(lista):
    if len(lista) > 1:
        mitad = len(lista) // 2
        izquierda = lista[:mitad]
        derecha = lista[mitad:]

        merge_sort(izquierda)
        merge_sort(derecha)

        i = j = k = 0

        while i < len(izquierda) and j < len(derecha):
            if len(izquierda[i]) < len(derecha[j]):
                lista[k] = izquierda[i]
                i += 1
            else:
                lista[k] = derecha[j]
                j += 1
            k += 1

        while i < len(izquierda):
            lista[k] = izquierda[i]
            i += 1
            k += 1

        while j < len(derecha):
            lista[k] = derecha[j]
            j += 1
            k += 1

# Entrada de nombres de dinosaurios
nombres_dinosaurios = input("Ingresa los nombres de dinosaurios separados por espacio: ")

# Dividir la entrada en una lista de nombres
lista_dinosaurios = nombres_dinosaurios.split()

merge_sort(lista_dinosaurios)
print("Lista de dinosaurios ordenada:")
print(" ".join(lista_dinosaurios))
