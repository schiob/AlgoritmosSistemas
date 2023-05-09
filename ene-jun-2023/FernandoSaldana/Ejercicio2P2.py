def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivote = arr[len(arr) // 2]
    left = [x for x in arr if x < pivote]
    mit = [x for x in arr if x == pivote]
    right = [x for x in arr if x > pivote]
    return quicksort(left) + mit + quicksort(right)


def busquedaBinaria(arr, x):
    lo, hi = 0, len(arr)
    while lo < hi:
        mid = (lo + hi) // 2
        if arr[mid] < x:
            lo = mid + 1
        elif arr[mid] > x:
            hi = mid
        else:
            return mid
    return -1

n, q = map(int, input("Cuantas canciones hay y cuantas peticiones haras?"+"\n").split())
playlist = input("Cuales son las canciones?"+"\n").split()

playlist = quicksort(playlist)

print("\n"+"Canciones ordenadas")
print(' '.join(playlist)+"\n")

for i in range(q):
    rolita = input().strip()
    dj = busquedaBinaria(playlist, rolita)
    print(dj)



