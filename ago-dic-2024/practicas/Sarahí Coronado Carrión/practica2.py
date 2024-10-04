def insertion_sort(arr):
    # Ordena el arreglo utilizando el algoritmo de Insertion Sort
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

def max_problems(n, m, times):
    # Ordenar los tiempos de los problemas
    insertion_sort(times)
    
    count = 0
    total_time = 0
    
    # Calcular cuántos problemas puede resolver David
    for time in times:
        if total_time + time <= m:
            total_time += time
            count += 1
        else:
            break
    
    return count, total_time

# Leer la entrada
entrada = input("Ingrese n y m: ")
n, m = map(int, entrada.split())
tiempos = list(map(int, input("Ingrese los tiempos de los problemas: ").split()))

# Obtener la cantidad máxima de problemas y el tiempo total
cantidad_problemas, tiempo_total = max_problems(n, m, tiempos)

# Imprimir el resultado
print(cantidad_problemas)
