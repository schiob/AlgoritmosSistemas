def pares(numeros):
    numeros_pares = []

    for n in numeros:
        if n % 2 == 0:
            numeros_pares.append(n)
    
    return numeros_pares

arr = [3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78]

resultado = pares(arr)
ordenados = sorted(resultado, reverse=True)

print(arr)
print(ordenados)