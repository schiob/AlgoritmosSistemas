print("ingrese la cantidad de numeros en la lista:")
n =(input())
print("Ingrese los numeros que juan quiere ordenar:")
numero= list(map(int, input().split()))

def countingSort(arreglo, exp1):
    n = len(arreglo)
    output = [0] * (n)
    count = [0] * (10)

    for i in range(0, n):
        index = arreglo[i] // exp1
        count[index % 10] += 1

    for i in range(1, 10):
        count[i] += count[i - 1]

    i = n - 1
    while i >= 0:
        index = arreglo[i] // exp1
        output[count[index % 10] - 1] = arreglo[i]
        count[index % 10] -= 1
        i -= 1

    i = 0
    for i in range(0, len(arreglo)):
        arreglo[i] = output[i]


def radixSort(arreglo):
    max1 = max(arreglo)

    exp = 1
    while max1 / exp >= 1:
        countingSort(arreglo, exp)
        exp *= 10

radixSort(numero)
print(numero)