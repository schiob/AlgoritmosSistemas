def quicksort(arr, start, end, color_order):
    if start < end:
        pivot_index = partition(arr, start, end, color_order)
        quicksort(arr, start, pivot_index - 1, color_order)
        quicksort(arr, pivot_index + 1, end, color_order)
        
def partition(arr, start, end, color_order):
    pivot = arr[end]
    i = start - 1
    for j in range(start, end):
        if (color_order.index(arr[j][0]), arr[j][1]) < (color_order.index(pivot[0]), pivot[1]):
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[end] = arr[end], arr[i + 1]
    return i + 1

n = int(input("INGRESE LA CANTIDAD DE COLORES ENTER Y LUEGO SU NOMBRE Y SU CANTIDAD"))
markers = [input().split('-') for _ in range(n)]
markers = [(color, int(dilution)) for color, dilution in markers]

color_order = ["Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"]
quicksort(markers, 0, n - 1, color_order)
print("ORDENADO")
for color, dilution in markers:
    print(f"{color}-{dilution}")
