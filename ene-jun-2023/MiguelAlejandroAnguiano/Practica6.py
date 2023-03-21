def main():
    n = int(input())
    participantes=[]

    for _ in range(n):
        s, x, y, z = input().split()
        x, y, z = int(x), int(y), int(z)
        participantes.append((s, x, y, z))

    quicksort(participantes, 0, n-1)

    for s, x, y, z in participantes:
        print(s, x, y, z)

def quicksort(arr, low, high):
    if low < high:
        pivot = partition(arr, low, high)
        quicksort(arr, low, pivot - 1)
        quicksort(arr, pivot + 1, high)

def partition(arr, low, high):
    pivot = arr[high][1:]
    i = low - 1
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

if __name__ == "__main__":
    main()