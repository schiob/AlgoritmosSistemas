def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        # Mueve los elementos del arreglo que son mayores que key a una posición adelante
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

def max_problems_solved(n, m, times):
    # Ordenar los tiempos con insertion sort
    insertion_sort(times)
    
    total_time = 0
    problems_solved = 0
    
    # Sumar tiempos hasta que no tengamos más tiempo disponible
    for time in times:
        if total_time + time <= m:
            total_time += time
            problems_solved += 1
        else:
            break
    
    return problems_solved

try:
    # Entrada
    n, m = map(int, input("Introduce n y m separados por un espacio: ").split())  # Leer n y m
    times = list(map(int, input(f"Introduce {n} tiempos separados por espacios: ").split()))  # Leer los tiempos de cada problema

    if len(times) != n:
        raise ValueError(f"Se esperaban {n} tiempos, pero se recibieron {len(times)}.")
    
    # Resolver el problema
    result = max_problems_solved(n, m, times)
    
    # Salida
    print(result)

except ValueError as e:
    print(f"Error en la entrada: {e}")
