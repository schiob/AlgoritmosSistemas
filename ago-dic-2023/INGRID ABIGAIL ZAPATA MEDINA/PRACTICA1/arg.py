import random
numeros = [random.randint(1, 100) for _ in range(10)]  
print("Lista original:", numeros)
n = len(numeros)
cambiado = True
while cambiado:
    cambiado = False
    for i in range(n - 1):
        if numeros[i] > numeros[i + 1]:
            numeros[i], numeros[i + 1] = numeros[i + 1], numeros[i]
            cambiado = True
            # Imprimir la lista después de cada intercambio
            #print("Lista parcial:", numeros)

print("Lista ordenada:", numeros)

