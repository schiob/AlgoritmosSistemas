def partition(arr, low, high, color_priority):
    # Elegimos el último elemento como pivote
    pivot = arr[high]
    pivot_color = color_priority[pivot[0]]
    pivot_level = pivot[1]
    i = low -1 

    for j in range(low, high):
        current_color = color_priority[arr[j][0]]
        current_level = arr[j][1]
        
        # Comparar primero por color, luego por nivel
        if (current_color < pivot_color) or (current_color == pivot_color and current_level <= pivot_level):
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

def quick_sort(arr, low, high, color_priority):
    if low < high:
        pi = partition(arr, low, high, color_priority)
        quick_sort(arr, low, pi - 1, color_priority)
        quick_sort(arr, pi + 1, high, color_priority)

# Orden de los colores en el arco iris
rainbow_colors = ["Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"]
color_priority = {color: index for index, color in enumerate(rainbow_colors)}

# Lee entrada
n = int(input())
markers = []

for _ in range(n):
    s = input().strip()
    color, level = s.split("-")
    level = int(level)
    markers.append((color, level))

# Ordena los plumones usando Quick Sort
quick_sort(markers, 0, n - 1, color_priority)

# Imprimir la salida
for color, level in markers:
    print (f"{color}-{level}") 
