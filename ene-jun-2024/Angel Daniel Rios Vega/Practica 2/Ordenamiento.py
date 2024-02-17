
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
        if tiempo + tiempo_total <= m:
            problemas_realizados += 1
            tiempo_total += tiempo
        else:
            break
    
    return problemas_realizados

def solicitar_informacion():
    print("Ingrese el número de problemas y el tiempo que le toma hacerlos (separados por espacios):")
    n, m = map(int, input().split())
    print("Ingrese los tiempos que le toma hacer cada problema (separados por espacios):")
    tiempos = list(map(int, input().split()))
    return n, m, tiempos

# Llamada a la función y salida del resultado
n, m, tiempos = solicitar_informacion()
print("Cantidad de problemas realizados:", problemas_a_realizar(n, m, tiempos))