def quicksort(array, low, high):
    if low<high:
        pi = partition(array, low, high)

        quicksort(array, low, pi-1)
        quicksort(array, pi+1,high)

def partition(array, low, high):
    pivot=array[high]

    i=low-1

    for j in range(low, high):
        if array[j]<=pivot:
            i=i+1
            (array[i],array[j])=(array[j],array[i])

    (array[i+1],array[high])=(array[high],array[i+1])

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
    canciones=['FiestaDeLocos','Matador','Comprendes,Mendes?','PadreNuestro','YoTomo','Frijolero','SiSeñor','Imagina']
    a='SiSeñor'
    b='Imagina'
    c='PadreNuestro'
    d='Matador'
    print("Medicinas en desorden:")
    print(canciones)
    quicksort(canciones, 0, len(canciones) - 1)
    print("Medicinas ordenadas:")
    print(canciones)
    resulta = binarySearch(canciones, 0, len(canciones) - 1, a)
    print(resulta)
    resultb = binarySearch(canciones, 0, len(canciones) - 1, b)
    print(resultb)
    resultc = binarySearch(canciones, 0, len(canciones) - 1, c)
    print(resultc)
    resultd = binarySearch(canciones, 0, len(canciones) - 1, d)
    print(resultd)