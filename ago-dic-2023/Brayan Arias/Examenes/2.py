n = input("Numero de la lista")

numero = input("ingrese los nuemros: ")
numero = numero.split()
for i in range(len(numero)):
    numero[i] = int(numero[i])


def counting_sort(arr, exp1):
    n = len(arr)
    salida = [0] * n
    conteo = [0] * 10

    for i in range(n):
        indice = arr[i] // exp1
        conteo[indice % 10] += 1

    for i in range(1, 10):
        conteo[i] += conteo[i - 1]

    i = n - 1
    while i >= 0:
        indice = arr[i] // exp1
        salida[conteo[indice % 10] - 1] = arr[i]
        conteo[indice % 10] -= 1
        i -= 1

    for i in range(len(arr)):
        arr[i] = salida[i]


def radix_sort(arr):
    maximo = max(arr)
    exp = 1
    while maximo / exp > 1:
        counting_sort(arr, exp)
        exp *= 10
    return arr


array_ordenado = radix_sort(numero)
print(*array_ordenado)
