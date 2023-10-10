#  número de medicinas
n = int(input("Ingrese el número de medicinas recetadas: "))

# lista de medicamentos
palabras = input("Ingrese la lista de medicamentos separados por espacios: ").split()

# selection sort
for i in range(n):
    min_idx = i
    for j in range(i + 1, n):
        if palabras[j] < palabras[min_idx]:
            min_idx = j
    palabras[i], palabras[min_idx] = palabras[min_idx], palabras[i]

# imprimir lista 
print("Lista ordenada:")
for palabra in palabras:
    print(palabra, end=' ')
