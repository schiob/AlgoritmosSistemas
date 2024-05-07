def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)

def binary_search(arr, x):
    low = 0
    high = len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        if arr[mid] < x:
            low = mid + 1
        elif arr[mid] > x:
            high = mid - 1
        else:
            return mid
    return -1

def main():
    # Lee las canciones que introducimos y el número de canciones#
    N, Q = map(int, input().split())
    playlist = input().split()
    requests = [input().strip() for _ in range(Q)]

    # Ordenar la playlist#
    sorted_playlist = quick_sort(playlist)

    # Aquí imprimimos la playlist de manera ordenada#
    print(" ".join(sorted_playlist))

    # Realiza las búsquedas Binarias#
    for song in requests:
        index = binary_search(sorted_playlist, song)
        if index != -1:
            print(index)  # Imprimir el índice sin sumar 1
        else:
            print(index)  # Imprimir -1 si la canción no se encuentra

if __name__ == "__main__":
    main()
