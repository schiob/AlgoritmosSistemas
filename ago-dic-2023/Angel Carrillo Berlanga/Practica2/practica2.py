def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

def problemas_a_realizar(n, m, tiempos):
    insertion_sort(tiempos)
    problemas_realizados = 0
    tiempo_total = 0

    for tiempo in tiempos:
        if tiempo_total + tiempo <= m:
            problemas_realizados += 1
            tiempo_total += tiempo
            print(tiempo)  # Imprimir el tiempo de cada problema
        else:
            break

    return problemas_realizados

# Leer la entrada
n, m = map(int, input("Ingrese el número de problemas y minutos disponibles (separados por espacio): ").split())
tiempos = list(map(int, input("Ingrese los tiempos para cada problema (separados por espacio): ").split()))

# Calcular y mostrar la salida
resultado = problemas_a_realizar(n, m, tiempos)
print("Total de problemas resueltos:", resultado)
