def insertion_sort(arr):
    # Implementamos el algoritmo Insertion Sort
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        # Mover los elementos de arr[0...i-1] que son mayores que key
        # a una posición adelante de su posición actual
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

def max_problems_solved(n, m, problem_times):
    # Ordenamos los tiempos de los problemas usando Insertion Sort
    insertion_sort(problem_times)
    
    total_time = 0
    problems_solved = 0
    
    # Iteramos sobre la lista de tiempos ordenada
    for time in problem_times:
        if total_time + time <= m:
            total_time += time
            problems_solved += 1
        else:
            break
    
    return problems_solved

# Leer los valores de entrada
n, m = map(int, input().split())
problem_times = list(map(int, input().split()))

# Obtener el número máximo de problemas que David puede resolver
result = max_problems_solved(n, m, problem_times)

# Imprimir el resultado
print(result)
