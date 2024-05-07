def main():
    
    n, q = map(int, input().split())
    playlist = input().split()
    queries = [input().strip() for _ in range(q)]

   
    quick_sort(playlist, 0, len(playlist) - 1)

    
    print(" ".join(playlist))

    for query in queries:
        index = binary_search(playlist, query)
        print(index)

def quick_sort(arr, low, high):
    if low < high:
        pi = particion(arr, low, high)
        quick_sort(arr, low, pi - 1)  
        quick_sort(arr, pi + 1, high)

def particion(arr, low, high):
    pivot = arr[(low + high) // 2]
    i = low - 1
    j = high + 1
    while True:
        i += 1
        while arr[i] < pivot:
            i += 1

        j -= 1
        while arr[j] > pivot:
            j -= 1

        if i >= j:
            return j

        arr[i], arr[j] = arr[j], arr[i]

def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid + 1  
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1 

if __name__ == "__main__":
    main()

