#ordi
cantidad_de_productos = int(input("Dame la cantidad \n"))
cadena = []
nombre_productos = []

for i in range(0, cantidad_de_productos):
    productos = input("Dame el producto, dame su precio \n")
    productos_split = productos.split()
    print(productos_split)
    nombre_productos.append(productos)


def binarySearch (arr, l, r,x ): 

	# Verifique el caso base
	if r >= l:

		mid = l + (r - l)/2

		# Si el elemento está presente en el medio mismo
		if arr[mid] == x:
			return mid

		# Si el elemento es más pequeño que el medio, entonces
		# solo puede estar presente en el subarray izquierdo
		elif arr[mid] > x:
			return binarySearch(arr, l, mid-1, x)

		# De lo contrario, el elemento solo estar presente
		# en la submatriz derecha
		else:
			return binarySearch(arr, mid + 1, r, x)

	else:
		# El elemento no está presente en la matriz
		return -1
# Llamada de función
result = binarySearch(cadena)

if result != -1:
	print( "El elemento está presente en el índice % d" % result )
else:
	print( "El elemento no está presente en la matriz")
