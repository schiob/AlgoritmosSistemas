def ordenar_cuenta(lista, exp):
    n = len(lista)
    resultado = [0] * n
    conteo = [0] * 10

    for i in range(n):
        indice = lista[i] // exp
        conteo[indice % 10] += 1

    for i in range(1, 10):
        conteo[i] += conteo[i - 1]

    i = n - 1
    while i >= 0:
        indice = lista[i] // exp
        resultado[conteo[indice % 10] - 1] = lista[i]
        conteo[indice % 10] -= 1
        i -= 1
        
    for i in range(n):
        lista[i] = resultado[i]

def radix_sort(lista):
    maximo = max(lista)
    exp = 1
    while maximo // exp > 0:
        ordenar_cuenta(lista, exp)
        exp *= 10

if __name__ == "__main__":
    n = int(input())
    numeros = list(map(int, input().split()))

    radix_sort(numeros)

    for num in numeros:
        print(num, end=" ")