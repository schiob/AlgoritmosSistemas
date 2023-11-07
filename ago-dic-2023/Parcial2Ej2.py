#Abigail Silva Diaz
#Juan tiene una lista de números enteros positivos y desea ordenarlos de menor a mayor 
#utilizando el algoritmo Radix Sort. Ayuda a Juan a ordenar su lista de números utilizando Radix Sort.
#La entrada será recibida por STDIN.
#La primera línea contiene un entero n, que representa la cantidad de números en la lista.
#La siguiente línea contiene n enteros separados por espacios, que son los números que Juan quiere ordenar.
#Imprime a la salida estándar STDOUT la lista de números ordenados de menor a mayor.

def radix_sort(arr):
    # Encuentra el número máximo para saber el número de dígitos
    max_num = max(arr)
    exp = 1

    while max_num // exp > 0:
        counting_sort(arr, exp)
        exp *= 10

def counting_sort(arr, exp):
    n = len(arr)
    output = [0] * n
    count = [0] * 10

    # Contar la frecuencia de cada dígito en la posición actual
    for i in range(n):
        index = arr[i] // exp
        count[index % 10] += 1

    # Actualizar la cuenta para indicar la posición actual de cada dígito
    for i in range(1, 10):
        count[i] += count[i - 1]

    # Construir el array de salida
    i = n - 1
    while i >= 0:
        index = arr[i] // exp
        output[count[index % 10] - 1] = arr[i]
        count[index % 10] -= 1
        i -= 1

    # Copiar el array de salida al array original
    for i in range(n):
        arr[i] = output[i]

# Lectura de la entrada
n = int(input())
numbers = list(map(int, input().split()))

# Aplicar Radix Sort
radix_sort(numbers)

# Imprimir el resultado
for num in numbers:
    print(num, end=' ')

#Entrada
#6
#17 45 92 83 6 31

#Salida Esperada
#6 17 31 45 83 92