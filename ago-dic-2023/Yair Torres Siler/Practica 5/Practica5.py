def merge_sort(arr):
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    mitadIzq = arr[:mid]
    mitadDer = arr[mid:]

    mitadIzq = merge_sort(mitadIzq)
    mitadDer = merge_sort(mitadDer)

    return merge(mitadIzq, mitadDer)

def merge(left, right):
    result = []
    Izq_idx, Der_idx = 0, 0

    while Izq_idx < len(left) and Der_idx < len(right):
        if len(left[Izq_idx]) <= len(right[Der_idx]):
            result.append(left[Izq_idx])
            Izq_idx += 1
        else:
            result.append(right[Der_idx])
            Der_idx += 1

    result.extend(left[Izq_idx:])
    result.extend(right[Der_idx])
    return result

# Entrada
dinosaurios = input().split()

# Merge sort a entrada
dinosaurios_ordenados = merge_sort(dinosaurios)

# Lista ordenada
print(" ".join(dinosaurios_ordenados))
