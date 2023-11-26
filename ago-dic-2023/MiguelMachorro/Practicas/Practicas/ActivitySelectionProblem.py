def max_activity(a_start, a_end, last_selected, n):
    # Inicializa el índice de la próxima actividad
    next_activity = last_selected + 1

    # Encuentra la próxima actividad compatible
    while next_activity < n and a_start[next_activity] < a_end[last_selected]:
        next_activity = next_activity + 1

    # Si hay una actividad compatible, agrega su índice a la solución y llama recursivamente a la función
    if next_activity < n:
        return [next_activity] + max_activity(a_start, a_end, next_activity, n)
    
    # Si no hay más actividades compatibles, devuelve una lista vacía
    return []

# Datos de inicio y finalización de las actividades
start_time = [2, 4, 6, 1, 6, 8, 3, 1, 0, 3]
end_time = [2, 1, 5, 6, 4, 2, 6, 8, 6, 2]

# Llama a la función con los parámetros iniciales e imprime el resultado
print(max_activity(start_time, end_time, 0, len(start_time)))
