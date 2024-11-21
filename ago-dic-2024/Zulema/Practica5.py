# Implementación de Merge Sort para ordenar los libros por número de páginas
def merge_sort(books):
    if len(books) <= 1:
        return books
    
    # Dividir la lista en mitades
    mid = len(books) // 2
    left_half = merge_sort(books[:mid])
    right_half = merge_sort(books[mid:])
    
    # Mezclar las dos mitades ordenadas
    return merge(left_half, right_half)

# Función de mezcla para unir las dos mitades ordenadas
def merge(left, right):
    sorted_list = []
    i = j = 0
    
    # Comparar y mezclar según el número de páginas
    while i < len(left) and j < len(right):
        if left[i][1] < right[j][1]:  # Ordenar por el número de páginas
            sorted_list.append(left[i])
            i += 1
        else:
            sorted_list.append(right[j])
            j += 1
    
    # Añadir los elementos restantes de cada mitad
    sorted_list.extend(left[i:])
    sorted_list.extend(right[j:])
    
    return sorted_list

# Función principal para leer entrada y realizar el ordenamiento
def main():
    # Leer el número de libros
    n = int(input().strip())
    
    # Leer cada libro y su número de páginas
    books = []
    for _ in range(n):
        line = input().strip().split()
        book_name = line[0]
        pages = int(line[1])
        books.append((book_name, pages))
    
    # Ordenar los libros usando Merge Sort
    sorted_books = merge_sort(books)
    
    # Imprimir el resultado solo con los nombres de los libros
    print(" ".join(book[0] for book in sorted_books))

# Llamar a la función principal
if __name__ == "__main__":
    main()
