# Implementación de Quick Sort para ordenar los ids de los colores
def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    
    # Seleccionar el pivote
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    
    # Llamadas recursivas para ordenar las sublistas
    return quick_sort(left) + middle + quick_sort(right)

# Función principal para leer entrada y realizar el ordenamiento
def main():
    # Leer el número de colores (no se utiliza en el procesamiento)
    n = int(input().strip())
    
    # Leer los ids de los colores y convertirlos en una lista de enteros
    color_ids = list(map(int, input().strip().split()))
    
    # Ordenar los ids usando Quick Sort
    sorted_colors = quick_sort(color_ids)
    
    # Imprimir el resultado
    print(" ".join(map(str, sorted_colors)))

# Llamar a la función principal
if __name__ == "__main__":
    main()
