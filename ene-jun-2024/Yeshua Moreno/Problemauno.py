def buscar_libro(n, libro_buscado, libros):
    izquierda, derecha = 0, n - 1
    while izquierda <= derecha:
        medio = (izquierda + derecha) // 2
        if libros[medio] == libro_buscado:
            return medio + 1
        elif libros[medio] < libro_buscado:
            izquierda = medio + 1
        else:
            derecha = medio - 1
    return -1
n, libro_buscado = input().split()
n = int(n)
libros = input().split()
posicion = buscar_libro(n, libro_buscado, libros)
print(posicion)