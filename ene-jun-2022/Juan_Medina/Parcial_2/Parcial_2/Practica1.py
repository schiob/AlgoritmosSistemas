from tokenize import String


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
periferico = 375892
sanPedro = 90334
abasolo = 203569
guadalajara = 403236
CDMX = 479983
cancun = 122112
tlaxcala = 200
sonora = 223211

arr = [periferico, sanPedro, abasolo, guadalajara,CDMX, cancun, tlaxcala, sonora]

radixSort(arr)

for i in range(len(arr)):
    print(arr[i],end=" ")

