
def colores(arr): 
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    rigth = [x for x in arr if x > pivot]
    return colores(left) + middle + colores(rigth)

n = int(input().strip())
c_ids = list(map(int, input().strip().split()))
sorted_co=colores(c_ids)

print(" ".join(map(str, sorted_co)))

