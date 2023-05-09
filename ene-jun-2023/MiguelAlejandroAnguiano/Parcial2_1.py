def quicksort(array, low, high):
    if low<high:
        #Dividir y acomodar el pivote
        pi = partition(array, low, high)

        quicksort(array, low, pi-1)
        quicksort(array, pi+1,high)

def partition(array, low, high):
    #Pivote derecho
    pivot=array[high]

    #apuntador del ultimo elemento mas pequeño
    i=low-1

    for j in range(low, high):
        if array[j]<=pivot:
            #avanzar apuntador
            i=i+1
            #intercambia elementos
            (array[i],array[j])=(array[j],array[i])

    #Al final intercambiar el pivote
    (array[i+1],array[high])=(array[high],array[i+1])

    #Regresa la posicion final del pivote
    return i+1

def binarySearch(arr, l, r, x):
    while l <= r:

        mid = l + (r - l) // 2

        if arr[mid] == x:
            return mid

        elif arr[mid] < x:
            l = mid + 1

        else:
            r = mid - 1

    return -1

if __name__ == '__main__':
    libros = ['Calculo2Deitel', 'CalculoForDummies', 'AlgebraLineal', 'TeoríaDeNúmeros', 'TheMangaGuideToCalculus']
    print(libros)
    quicksort(libros, 0, len(libros) - 1)
    print(libros)
    x = 'CalculoForDummies'
    result = binarySearch(libros, 0, len(libros) - 1, x)
    print(result)