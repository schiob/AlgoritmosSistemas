def reverse_quick_sort(array, start_idx, end_idx):
    pivot = start_idx
    pointer = end_idx

    while pivot != pointer:
        if array[pointer]['prioridad'] > array[pivot]['prioridad'] and pointer > pivot:
            array[pointer], array[pivot] = array[pivot], array[pointer]
            pointer, pivot = pivot, pointer

        elif array[pointer]['prioridad'] < array[pivot]['prioridad'] and pointer < pivot:
            array[pointer], array[pivot] = array[pivot], array[pointer]
            pointer, pivot = pivot, pointer

        if pointer > pivot:
            pointer -= 1
        else:
            pointer += 1

    if start_idx < pivot:
        reverse_quick_sort(array, start_idx, pivot - 1)

    if end_idx > pivot:
        reverse_quick_sort(array, pivot + 1, end_idx)


tareas_length = int(input())
tareas = []

# 5
# EstudiarParaAlgoritmos 64
# CompletarTareasPendientes 54
# RezarPorLosParciales 80
# ComprarLasBotellasDeSobornos 90
# LlorarEnUnRincón 20
for _ in range(tareas_length):
    nombre, prioridad = input().split()
    tarea = {'nombre': nombre,
             'prioridad': int(prioridad)}
    tareas.append(tarea)

reverse_quick_sort(tareas, 0, tareas_length - 1)
[print(f"\n{tarea['nombre']} ", end="") for tarea in tareas]
