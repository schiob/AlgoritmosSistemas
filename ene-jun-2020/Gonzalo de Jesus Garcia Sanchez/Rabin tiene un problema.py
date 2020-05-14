# método que devuelve la partición que luego será usado por el quick sort
def partition(arr, low, high):
	i = low - 1
	pivot = arr[high]

	for j in range(low , high):
		if arr[j] <= pivot:
			i += 1
			arr[i], arr[j] = arr[j], arr[i]

	arr[i + 1], arr[high] = arr[high], arr[i + 1]
	return i + 1

# método de ordenamiento quick sort
def quickSort(arr, low, high):
	if low < high:
		pi = partition(arr, low, high)

		quickSort(arr, low, pi - 1)
		quickSort(arr, pi + 1, high)

# método de busqueda binaria
def binarySearch(canciones, l, r, cancion):
	if r >= l:
		mid = l + (r - l) // 2

		if canciones[mid] == cancion:
			return mid
		elif canciones[mid] > cancion:
			return binarySearch(canciones, l, mid - 1, cancion)
		else:
			return binarySearch(canciones, mid + 1, r, cancion)

	else:
		return -1

# método para imprimir un arreglo
def printArr(arr):
	for i in range(len(arr)):
		print(arr[i], end=" ")
	print("")


# ===== ENTRADAS ==== #
NQ = input().split(" ")		# entrada N y Q
canciones = input().split(" ")	# entrada de las canciones separadas por un espacio en blanco
busqueda = []			# lista donde se almacena las canciones a buscar

# convierto la entrada de un array de strings a un array de enteros,
# siendo las posiciones N y Q respectivamente.
NQ = [
	int(NQ[0]),
	int(NQ[1])
]

# compruebo que el número de canciones sea correcto
if len(canciones) != NQ[0]:
	print("Número de canciones incorrecto...")
	exit()

# obtengo las busquedas
for i in range(NQ[1]):
	busqueda.append(input())

#"aplicó el método quick sort"
quickSort(canciones, 0, len(canciones) - 1)

# ===== SALIDAS ==== #
print("\n\nCanciones ordenadas y posiciones en la playlist:")

# muestro el arreglo ordenado
printArr(canciones)

# busco y muestro los indices de las canciones
for i in range(NQ[1]):
	print(binarySearch(canciones, 0, NQ[0] - 1, busqueda[i]))
