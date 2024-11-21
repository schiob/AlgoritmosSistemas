# Función de Merge Sort para ordenar las palabras
def merge_sort(words):
    if len(words) <= 1:
        return words
    
    # Dividir la lista en mitades
    mid = len(words) // 2
    left_half = merge_sort(words[:mid])
    right_half = merge_sort(words[mid:])
    
    # Mezclar las dos mitades ordenadas
    return merge(left_half, right_half)

# Función de mezcla para unir las dos mitades ordenadas
def merge(left, right):
    sorted_list = []
    i = j = 0
    
    # Comparar y mezclar
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            sorted_list.append(left[i])
            i += 1
        else:
            sorted_list.append(right[j])
            j += 1
    
    # Añadir los elementos restantes de cada mitad
    sorted_list.extend(left[i:])
    sorted_list.extend(right[j:])
    
    return sorted_list

# Lectura de entrada desde el estándar (STDIN)
def main():
    # Leer número de palabras (no se utiliza en el procesamiento)
    n = int(input().strip())
    
    # Leer la lista de palabras y dividirlas en una lista
    words = input().strip().split()
    
    # Ordenar la lista de palabras
    sorted_words = merge_sort(words)
    
    # Imprimir el resultado en formato requerido
    print(" ".join(sorted_words))

# Llamar a la función principal
if __name__ == "__main__":
    main()
