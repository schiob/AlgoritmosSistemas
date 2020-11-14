def linearSearch(item, ar):
    found = False
    position = 0
    while position < len(ar) and not found:
        if ar[position] == item:
            found = True
        position = position + 1
    return position


n, x = input().split()
libros = input().split()

if len(libros) != int(n):
    print('verifica el numero de libros a ingresar')
    exit()

print(linearSearch(x, libros))
