def busqueda(arr, inicio, fin, x):
	if inicio> fin:
		return -1
	medio=(inicio + fin )//2#validar
	if arr[medio]==x:
		return medio
	if x<arr[medio]:
		return busqueda(arr, inicio, medio-1, x) #izquierda
	else:
		return busqueda(arr, medio+1, fin, x) #derecha

arr=[]
n,x = int(input("numero de libros: ")),input("libro a buscar: ")
for i in range(n):
   	libro= input("Nombre del libro: ")
   	arr.append(libro)
arr=sorted(arr)
print(sorted(arr))
print(busqueda(arr,0,len(arr)-1,x))
