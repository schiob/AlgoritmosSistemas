def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min = i
        for j in range(i + 1, n):
            if arr[j] < arr[min]:
                min = j
        arr[i], arr[min] = arr[min], arr[i]

n = int(input())

medicinas = input().split()

selection_sort(medicinas)

print(" ".join(medicinas))