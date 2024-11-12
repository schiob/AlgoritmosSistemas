def quick_sort(arr):
    if len(arr) <= 1:
        return arr
  
    pivot = arr[0]

    menores = [x for x in arr[1:] if x <= pivot]
    mayores = [x for x in arr[1:] if x > pivot]
    
    return quick_sort(menores) + [pivot] + quick_sort(mayores)

n = int(input())
ids = list(map(int, input().split()))
ordenados = quick_sort(ids)

print(" ".join(map(str, ordenados)))
