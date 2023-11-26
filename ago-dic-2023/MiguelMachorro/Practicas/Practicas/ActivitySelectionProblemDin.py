def max_activities(a_start, a_end):
    n = len(a_start)

    # Crear una lista para almacenar la solución óptima para cada subproblema
    dp = [0] * n

    # Inicializar la solución para el último subproblema (última actividad)
    dp[n - 1] = 1

    # Llenar la tabla dp desde el final hacia el principio
    for i in range(n - 2, -1, -1):
        # Encontrar la próxima actividad compatible
        next_activity = i + 1
        while next_activity < n and a_start[next_activity] < a_end[i]:
            next_activity += 1

        # Calcular la solución óptima para el subproblema actual
        included_activities = dp[next_activity] if next_activity < n else 0
        excluded_activity = dp[i + 1]
        dp[i] = max(included_activities + 1, excluded_activity)

    # Reconstruir la solución óptima
    result = []
    i = 0
    while i < n:
        next_activity = i + 1
        while next_activity < n and a_start[next_activity] < a_end[i]:
            next_activity += 1

        if next_activity < n and dp[i] == dp[next_activity] + 1:
            result.append(next_activity)
            i = next_activity
        else:
            i += 1

    return result

# Datos de inicio y finalización de las actividades
start_time = [2, 4, 6, 1, 6, 8, 3, 1, 0, 3]
end_time = [2, 1, 5, 6, 4, 2, 6, 8, 6, 2]

result = max_activities(start_time, end_time)
print(result)
