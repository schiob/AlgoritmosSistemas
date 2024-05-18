def buscar_libro(n, libro_buscado, libros):
    for i in range(n):
        if libros[i] == libro_buscado:
            return i + 1 
    return -1  #En caso de que el libro no se encuentre en la repisa nos devolverá un -1#


def main():
    # Leer la entrada(la cantidad de libros que tenemos en nuestra repisa y el nombre del libro que buscamos)#
    n, libro_buscado = input().split()
    n = int(n)
    libros = input().split()

    # Llamar a la función para buscar el libro en la repisa#
    posicion = buscar_libro(n, libro_buscado, libros)

    print(posicion)


if __name__ == "__main__":
    main()

