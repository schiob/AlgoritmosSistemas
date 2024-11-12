def quicksort(arr, left, right, key):
    if left < right:
        pivot_index = partition(arr, left, right, key)
        quicksort(arr, left, pivot_index - 1, key)
        quicksort(arr, pivot_index + 1, right, key)

def partition(arr, left, right, key):
    pivot = key(arr[right])
    i = left - 1
    for j in range(left, right):
        if key(arr[j]) <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[right] = arr[right], arr[i + 1]
    return i + 1

def ordenar_plumones(n, plumones):
    arcoiris = ["Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"]
    color_index = {color: i for i, color in enumerate(arcoiris)}

    plumones_tuplas = [
        (color.split('-')[0], int(color.split('-')[1]))
        for color in plumones
    ]
    
    quicksort(plumones_tuplas, 0, n - 1, key=lambda x: (color_index[x[0]], x[1]))

    return [f"{color}-{nivel}" for color, nivel in plumones_tuplas]

# Ejemplo de uso:
n = 5
plumones = ["Anaranjado-34", "Indigo-3", "Rojo-43", "Indigo-0", "Anaranjado-44"]
resultado = ordenar_plumones(n, plumones)
print("\n".join(resultado))
