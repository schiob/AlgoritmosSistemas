def partition(array, low, high):
    pivot = array[high]
    i = low - 1

    for j in range(low, high):
        if array[j] <= pivot:
            i = i + 1
            (array[i], array[j]) = (array[j], array[i])
    (array[i + 1], array[high]) = (array[high], array[i + 1])
    return i + 1

def quickSort(array, low, high):
    if low < high:
        pi = partition(array, low, high)
        quickSort(array, low, pi - 1)
        quickSort(array, pi + 1, high)

def binarySearch(arr, x):
    l = 0
    r = len(arr)
    while (l <= r):
        m = l + ((r - l) // 2)
        res = (x == arr[m])
        if (res == 0):
            return m - 1
        if (res > 0):
            l = m + 1
        else:
            r = m - 1
    return -1

if __name__ == "__main__":
    arr = ['FiestaDeLocos','Matador','Comprendes,Mendes?','PadreNuestro','YoTomo','Frijolero','SiSeñor','Imagina']
    print('Playlist:\n',arr)
    n = len(arr)
    x = 'SI'
    quickSort(arr,0,n-1)
    result = binarySearch(arr, x)
    print('Playlist ordenada:\n',arr)
    if (result == -1):
        print('\nLa cancion no esta en la playlist')
    else:
        print('\nLa cancion se encuentra en la posicion:',result)