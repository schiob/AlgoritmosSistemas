# Función para implementar el algoritmo MergeSort
def merge_sort(libros):
    if len(libros) > 1:
        # Dividimos la lista en dos mitades
        mid = len(libros) // 2
        left_half = libros[:mid]
        right_half = libros[mid:]

        # Llamadas recursivas para dividir más
        merge_sort(left_half)
        merge_sort(right_half)

        # Índices para recorrer las sublistas
        i = j = k = 0

        # Fusionar las dos mitades
        while i < len(left_half) and j < len(right_half):
            if left_half[i][1] < right_half[j][1]:
                libros[k] = left_half[i]
                i += 1
            else:
                libros[k] = right_half[j]
                j += 1
            k += 1

        # Copiar los elementos restantes, si los hay
        while i < len(left_half):
            libros[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            libros[k] = right_half[j]
            j += 1
            k += 1

# Paso 1: Leer la entrada desde stdin
n = int(input())  # Número de libros
libros = []

# Paso 2: Recoger los libros y sus páginas
for _ in range(n):
    entrada = input().split()
    nombre_libro = entrada[0]
    paginas = int(entrada[1])
    libros.append((nombre_libro, paginas))

# Paso 3: Ordenar los libros usando MergeSort
merge_sort(libros)

# Paso 4: Imprimir solo los nombres de los libros en orden de páginas
print(" ".join([libro[0] for libro in libros]))
