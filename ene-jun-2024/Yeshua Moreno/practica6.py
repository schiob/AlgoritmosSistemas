def quicksort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quicksort(left) + middle + quicksort(right)

#Entrada
import sys
input = sys.stdin.read

data = input().splitlines()

#Numero de medicinas
n = int(data[0])

#Lista de medicinas
medicines = data[1].split()

#Ordena
sorted_medicines = quicksort(medicines)

#Salida
print(" ".join(sorted_medicines))