def insertion_sort(arr):
    for i in range(1, len(arr)):
        j = i
        while arr[j - 1] > arr[j] and j > 0:
            arr[j-1], arr[j] = arr[j], arr[j-1]
            j -= 1


arr = [2, 6, 5, 1, 3, 4, 10, 15]
insertion_sort(arr)
print(arr)
 