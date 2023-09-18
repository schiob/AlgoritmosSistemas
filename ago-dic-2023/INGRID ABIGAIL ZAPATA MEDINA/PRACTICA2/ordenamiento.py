#entradas 
n, m = map(int, input().split())
tiempos_problemas = list(map(int, input().split()))


def ordenar_insercion(arr):
    for i in range(1, len(arr)):
        valor_actual = arr[i]
        posicion = i - 1

        # elementos mayores
        while posicion >= 0 and valor_actual < arr[posicion]:
            arr[posicion + 1] = arr[posicion]
            posicion -= 1
        arr[posicion + 1] = valor_actual
ordenar_insercion(tiempos_problemas)

# variables para conteo
problemas_resueltos = 0
tiempo_utilizado = 0

for tiempo in tiempos_problemas:
    if tiempo_utilizado + tiempo <= m:
        problemas_resueltos += 1
        tiempo_utilizado += tiempo
    else:
        break

print(problemas_resueltos)