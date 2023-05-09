def QuickSort(arreglo, izquierda, derecha):
    if izquierda < derecha:
        indiceparticion = Particion(arreglo,izquierda,derecha)
        QuickSort(arreglo,izquierda, indiceparticion)
        QuickSort(arreglo,indiceparticion +1,derecha)

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
    while izqueirda <= derecha:
        mid = izquierda + (derecha - izquierda) // 2

        if arreglo[mid] == x:
            return mid
        elif arreglo[mid] < x:
            izquierda = mid + 1
        else:
            derecha = mid - 1
    return -1


if __name__=='__main__':
    Musica=['FiestaDeLocos', 'Matador', 'Comprendes,Mendes?', 'PadreNuestro', 'YoTomo', 'Frijolero', 'SiSeñor', 'Imagina']
    x= 'SiSeñor'
    y = 'Imagina'
    z = 'PadreNuestro'
    s= 'Matador'
    print("Musica en desorden:")
    print(Musica)
    QuickSort(Musica, 0, len(Musica) - 1)
    print("Musica ordenadas:")
    print(Musica)
    resultox = binarySearch(Musica, 0, len(Musica) - 1, x)
    print(resultox)
    resultoy = binarySearch(Musica, 0, len(Musica) - 1, y)
    print(resultoy)
    resultoz = binarySearch( Musica, 0, len(Musica) - 1, z)
    print(resultoz)
    resultos = binarySearch(Musica, 0, len(Musica) - 1, s)
    print(resultos)

