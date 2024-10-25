def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        max_idx = i
        for j in range(i+1, n):
            if arr[j] > arr[max_idx]:
                max_idx = j
        # Intercambia el elemento mayor encontrado con el primer elemento
        arr[i], arr[max_idx] = arr[max_idx], arr[i]
    return arr
n = int(input())
cp_list = list(map(int, input().split()))
# Ordenar la lista usando selection sort
sorted_cp_list = selection_sort(cp_list)
print(" ".join(map(str, sorted_cp_list)))
