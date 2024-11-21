# leer la lista de entrada
n = int(input().strip())
numbers = list(map(int, input().strip().split()))

# Encontrar el valor máximo en la lista para definir el tamaño del arreglo de conteo
max_val = max(numbers)

# Crear el arreglo de conteo
conteo = [0] * (max_val + 1)

# Llenar el arreglo de conteo
for num in numbers:
    conteo[num] += 1

# Reconstruir la lista ordenada
sorted_numbers = []
for num in range(len(conteo)):
    sorted_numbers.extend([num] * conteo[num])

# Imprimir la lista ordenada
print(" ".join(map(str, sorted_numbers)))
