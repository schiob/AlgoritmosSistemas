def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

if __name__ == "__main__":
    print("Introduce el número de medicamentos que se toma el profe Chio: ")
    n = int(input())
    print("Introduce el nombre de los medicamentos separados por espacios: ")
    medicinas = input().split()
    medicinas_ordenadas = quicksort(medicinas)
    print(" ".join(medicinas_ordenadas))