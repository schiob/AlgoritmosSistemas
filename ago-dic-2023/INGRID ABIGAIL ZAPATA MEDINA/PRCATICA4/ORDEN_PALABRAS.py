n = int(input())
palabras = input().split()

def comparar_palabras(word1, word2):
    word1 = word1.lower()
    word2 = word2.lower()

    if word1 < word2:
        return -1
    elif word1 > word2:
        return 1
    else:
        return 0

def ordenar_insercion(arr):
    for i in range(1, len(arr)):
        valor_actual = arr[i]
        posicion = i - 1

        while posicion >= 0 and comparar_palabras(valor_actual, arr[posicion]) == -1:
            arr[posicion + 1] = arr[posicion]
            posicion -= 1

        arr[posicion + 1] = valor_actual

ordenar_insercion(palabras)

print(" ".join(palabras))