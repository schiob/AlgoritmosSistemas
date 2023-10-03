#Colonnia de abejas
#Coloia de hormigas 
#Son metodos, metauristicas bioinspiradas

import random

# Generar una lista de 10 números al azar
numeros = [random.randint(1, 100) for _ in range(10)]

# Mostrar la lista original
print("Lista original:")
print(numeros)

# Método de burbuja para ordenar la lista
def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Ordenar la lista utilizando el método de burbuja
bubble_sort(numeros)

# Mostrar la lista ordenada
print("\nLista ordenada:")
print(numeros)
