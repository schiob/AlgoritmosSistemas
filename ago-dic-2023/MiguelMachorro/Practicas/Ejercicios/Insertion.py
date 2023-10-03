import random

# Generar una lista de 10 números al azar
numeros = [random.randint(1, 100) for _ in range(10)]

# Mostrar la lista original
print("Lista original:")
print(numeros)

for i in range(1, len(numeros)):
    var = numeros[i]
    j = i-1
    while j>= 0 and var < numeros[j]:
        numeros[j+1] = numeros[j]
        j-=1
    numeros[j+1] = var


# Mostrar la lista ordenada
print("\nLista ordenada:")
print(numeros)
