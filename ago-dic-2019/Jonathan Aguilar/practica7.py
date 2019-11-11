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
n = int(input("Rango: "))
for i in range(n):
   	medicina= input("Nombre del Medicamento: ")
   	arr.append(medicina)
arr=sorted(arr)
print(sorted(arr))
y = int(input("Rango: "))
for j in range(y):
	print(busqueda(arr,0,len(arr)-1,input("Medicamento a buscar: ")))