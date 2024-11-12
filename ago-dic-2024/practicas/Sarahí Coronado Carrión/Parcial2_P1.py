rainbow_order = ["Rojo", "Anaranjado", "Amarillo", "Verde", "Azul", "Indigo", "Violeta"]

def key_func(marker):
    color, dilution = marker.split('-')
    dilution = int(dilution)  
    color_order = rainbow_order.index(color)  
    return color_order, dilution

def quicksort(markers, low, high):
    if low < high:
        pivot_index = partition(markers, low, high)
        quicksort(markers, low, pivot_index - 1)
        quicksort(markers, pivot_index + 1, high)

def partition(markers, low, high):
    pivot = markers[high]
    i = low - 1
    for j in range(low, high):
        if key_func(markers[j]) < key_func(pivot):
            i += 1
            markers[i], markers[j] = markers[j], markers[i]
    markers[i + 1], markers[high] = markers[high], markers[i + 1]
    return i + 1

def sort_markers(markers):
    quicksort(markers, 0, len(markers) - 1)
    for marker in markers:
        print(marker)

n = int(input())  
markers = [input().strip() for _ in range(n)]  
sort_markers(markers)