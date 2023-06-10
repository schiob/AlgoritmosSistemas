
def QuickSort(arreglo, izquierda, derecha):
    if izquierda < derecha:
        indiceparticion = Particion(arreglo,izquierda,derecha)
        QuickSort(arreglo,izquierda, indiceparticion)
        QuickSort(arreglo,indiceparticion +1,derecha)
## se utiliza divide y venseras

def Particion(arreglo, izquierda, derecha):
    pivote=arreglo[izquierda]
    while True:
        while arreglo[izquierda] < pivote:
            izquierda += 1
        while arreglo[derecha] > pivote:
            derecha -= 1
            if izquierda >= derecha:
                return derecha
            else:
                arreglo[izquierda], arreglo[derecha] = arreglo[derecha], arreglo[izquierda]
                izquierda += 1
                derecha -= 1


def binarySearch(arreglo, izquierda, derecha, x):
    while izquierda <= derecha:
        mid = izquierda + (derecha - izquierda) // 2

        if arreglo[mid] == x:
            return mid
        elif arreglo[mid] < x:
            izquierda = mid + 1
        else:
            derecha = mid - 1
    return -1

n, m = input().split()
n = int(n)
m = int(m)

libros = []
for _ in range(n):
    nombre, paginas = input().split()
    libros.append((nombre, int(paginas)))

# Ordenar la lista de libros
quicksort(libros, 0, n - 1)

# Imprimir lista ordenada
for libro in libros:
    print(libro[0], end=" ")
print()

# Búsquedas
for _ in range(m):
    libro_name = input().strip()
    index = binary_search(libros, libro_name, 0, n - 1)
    print(index)
