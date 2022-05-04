def countingSort(arr, exp1):
 
    n = len(arr)

    output = [0] * (n)
 
    # Se inicializa el conteo del array en 0
    count = [0] * (10)

    for i in range(0, n):
        index = arr[i] // exp1
        count[index % 10] += 1
 
    for i in range(1, 10):
        count[i] += count[i - 1]

    i = n - 1
    while i >= 0:
        index = arr[i] // exp1
        output[count[index % 10] - 1] = arr[i]
        count[index % 10] -= 1
        i -= 1

    i = 0
    for i in range(0, len(arr)):
        arr[i] = output[i]
 
def radixSort(arr):

    max1 = max(arr)

    exp = 1
    while max1 / exp > 1:
        countingSort(arr, exp)
        exp *= 10

print("\n Arreglo Ordenado por Radix_Sort \n")
arr = [77, 133, 97, 335, 487, 99, 103]
 
radixSort(arr)
 
for i in range(len(arr)):
    print(arr[i],end=" ")