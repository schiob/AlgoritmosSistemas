def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[0]
    left = []
    right = []
    for i in range(1, len(arr)):
        if arr[i] < pivot:
            left.append(arr[i])
        else:
            right.append(arr[i])
    return quicksort(left) + [pivot] + quicksort(right)

def binary_search(arr, x):
    left = 0
    right = len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            left = mid + 1
        else:
            right = mid - 1
    return -1

n, q = map(int, input().split())
medicinas = input().split()
medicinas = quicksort(medicinas) # Ordenar las medicinas utilizando Quicksort

for i in range(q):
    medicina_buscada = input().strip()
    index = binary_search(medicinas, medicina_buscada)
    print(index if index != -1 else -1) # Imprimir la posición o -1 si no se encuentra
