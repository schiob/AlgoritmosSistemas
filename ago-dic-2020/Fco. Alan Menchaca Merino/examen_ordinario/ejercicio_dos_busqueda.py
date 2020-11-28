def binary_search(array, start, end, articulo):
    middle = (start + end) // 2

    if articulo['precio'] == array[middle]['precio']:
        return (middle + 1)

    if start == end:
        return -1

    if articulo['precio'] < array[middle]['precio']:
        return binary_search(array, start, middle - 1, articulo)
    else:
        return binary_search(array, middle + 1, end, articulo)


num_articulos, nom_articulo = input().split()
num_articulos = int(num_articulos)
busq_articulo = {}
articulos = []

# 6 NintendoSwitch
# TacosPastor 70
# Teclado 200
# Audífonos 1000
# NintendoSwitch 9000
# Iphone 15000
# LaptopLenovo 20000
busq_articulo['nombre'] = nom_articulo
busq_articulo['precio'] = 0
for _ in range(num_articulos):
    nombre, precio = input().split()
    articulo = {'nombre': nombre,
                'precio': int(precio)}
    if nom_articulo == nombre:
        busq_articulo['precio'] = int(precio)

    articulos.append(articulo)

pos_articulo = binary_search(articulos, 0, num_articulos, busq_articulo)
print(pos_articulo)
