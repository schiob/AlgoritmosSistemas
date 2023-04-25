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


def binarySearch(arr, left, right, x):
    while left <= right:

        mid = left + (right - left) // 2

        if arr[mid] == x:
            return mid

        elif arr[mid] < x:
            left = mid + 1

        else:
            right = mid - 1

    return -1

if __name__=='__main__':
    medicinas=['naproxeno', 'paracetamol', 'rimantadina', 'azitromicina', 'ibuprofeno']
    x='azitromicina'
    y='ibuprofeno'
    z='aspirina'
    print("Medicinas en desorden:")
    print(medicinas)
    quicksort(medicinas, 0, len(medicinas) - 1)
    print("Medicinas ordenadas:")
    print(medicinas)
    resultx = binarySearch(medicinas, 0, len(medicinas) - 1, x)
    print(resultx)
    resulty = binarySearch(medicinas, 0, len(medicinas) - 1, y)
    print(resulty)
    resultz = binarySearch(medicinas, 0, len(medicinas) - 1, z)
    print(resultz)