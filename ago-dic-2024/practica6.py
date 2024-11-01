def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[len(arr) // 2]
        left = [x for x in arr if x < pivot]
        middle = [x for x in arr if x == pivot]
        right = [x for x in arr if x > pivot]
        return quick_sort(left) + middle + quick_sort(right)

n = int(input().strip())
color_ids = list(map(int, input().strip().split()))

sorted_colors = quick_sort(color_ids)

print(" ".join(map(str, sorted_colors)))
