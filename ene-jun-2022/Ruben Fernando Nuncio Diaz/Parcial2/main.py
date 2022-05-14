peticiones, canciones = int(input())
lstCanciones = list(map(int, input().strip().split(" ")))[:n]

count = 0

def partition(array, left, right):
    smaller_index = left - 1
    pivot = array[right]
    for i in range(left, right):
        global count
        count += 1
        if array[i] < pivot:
            smaller_index += 1
            array[smaller_index], array[i] = array[i], array[smaller_index]
    array[smaller_index+1], array[right] = array[right], array[smaller_index+1]
    print(array)
    return (smaller_index+1)

def quick_sort(array, left, right):
    if left < right:
        partitioning_index = partition(array, left, right)
        print(partitioning_index)
        quick_sort(array,left,partitioning_index-1)
        quick_sort(array,partitioning_index+1,right)


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


n = int(input())
a = list(map(int, input().strip().split(" ")))[:n]
b = list(map(str, input().strip().split(" ")))[:n]
#no funciona con espacio, solo funciona con enter



##################################################################################################################


def ordenarNumeros(inputArray):
    maxEl = max(inputArray)

    countArrayLength = maxEl+1

    countArray = [0] * countArrayLength

    for el in inputArray:
        countArray[el] += 1

    for i in range(1, countArrayLength):
        countArray[i] += countArray[i-1]

    outputArray = [0] * len(inputArray)
    i = len(inputArray) - 1
    while i >= 0:
        currentEl = inputArray[i]
        countArray[currentEl] -= 1
        newPosition = countArray[currentEl]
        outputArray[newPosition] = currentEl
        i -= 1

    return outputArray


n = int(input())

a = list(map(int, input().strip().split(" ")))[:n]
b = list(map(str, input().strip().split(" ")))[:n]


arrayOrdenado = ordenarNumeros(a)
print(arrayOrdenado.insert(b))




#no funciona con espacio, solo funciona con enter