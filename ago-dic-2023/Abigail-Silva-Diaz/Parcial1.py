#Ejercicio 2
#ABIGAIL SILVA DIAZ
#Juan tiene un montón de libros que quiere leer, y quiere leer la mayor cantidad posible en un año 
#así que empezará a leer sus libros empezando del más corto en adelante. 
#El problema es que toda su biblioteca está desordenada,ayúdalo a ordenarla de menor a mayor
#tomando en cuenta el número de páginas que tiene cada libro. La entrada consiste en varias lineas,
#la primera tiene un entero n representado el número de libros que tiene Juan. 
#Después hay n líneas en la que cada una tiene un string y un entero separados por espacio representando
# el nombre del libro y el número de páginas que tiene. Imprime a salida estandar STDOUT la lista con el
# nombre de los libros ordenados de menor a mayor.
def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2
        left_half = arr[:mid]
        right_half = arr[mid:]

        merge_sort(left_half)
        merge_sort(right_half)

        i, j, k = 0, 0, 0

        while i < len(left_half) and j < len(right_half):
            if left_half[i][1] < right_half[j][1]:
                arr[k] = left_half[i]
                i += 1
            else:
                arr[k] = right_half[j]
                j += 1
            k += 1

        while i < len(left_half):
            arr[k] = left_half[i]
            i += 1
            k += 1

        while j < len(right_half):
            arr[k] = right_half[j]
            j += 1
            k += 1


if __name__ == "__main__":
    n = int(input())
    books = []

    for _ in range(n):
        book_info = input().split()
        book_name = book_info[0]
        pages = int(book_info[1])
        books.append((book_name, pages))

    merge_sort(books)
    print("-------------------")
    for book in books:
        print(book[0])

#lista de libros para prueba
#HarryPotter 245
#GodelEscherBach 777
#Flatland 96
#Mistborn 541
#CleanCode 469
