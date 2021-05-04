def BusquedaX(pos, array):
    found = False
    posicion = 0
    while posicion < len(array) and not found:
        if array[posicion] == pos:
            found = True
        posicion = posicion + 1
    return posicion
n, x = input('valores separdos por espacio:').split()
libro = input().split()
if len(libro) != int(n):
    print('n de libros')
    exit()
print(BusquedaX(x, libro)) 