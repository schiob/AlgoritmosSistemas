
def quick_sort(arr,primero,ultimo):

	pivote = arr[(primero+ultimo)//2]
	min =primero
	max =ultimo
	while min <= max:

		nom = arr[min]
		while nom[0] < pivote[0]:
			min +=1
			nom = arr[min]
			pass

		nom2 = arr[max]
		while nom2[0] > pivote[0]:
			max -=1
			nom2 = arr[max]
			pass

		if min <= max :
			temp = arr[min]
			arr[min] =arr[max]
			arr[max] =temp
			min +=1
			max -=1
			pass
		pass
		if primero < max:
			quick_sort(arr,primero,max)
			pass
		if min < ultimo:
			quick_sort(arr,min,ultimo)
			pass
		return arr
	pass


def Busqueda_binaria(arr,x):
	primero = 0
	ultimo = len(arr)-1
	while primero <= ultimo:
		
		centro =(primero + ultimo)//2
		valor = arr[centro]
		if x == valor:
			return centro
			pass

		elif x != valor:
			if x[0] < valor[0]:
				ultimo = centro - 1
				pass
			else:
				primero = centro + 1
			pass
		
		pass
	return -1
	pass


import random
if __name__ == '__main__':
	print("numero de canciones y  peticiones a buscar:")
	num = input().split()
	medi = int(num[0])
	peti = int(num[1])

	arr=[]
	cancion = []
	8


	print("nombre de canciones: ")
	cancion = input().split()

	
	print("")
	print("Buscar cancion: ")
	buscar = []
	for x in range(peti):
		bus = input()
		buscar.append(bus)

	arr = quick_sort(cancion,0,len(cancion)-1)
	print(" ")

	for i in range(len(arr)):
		print(arr[i], end=" ")
	print("")

		
	for i in range(len(buscar)):
		resul = Busqueda_binaria(arr,buscar[i])
		print(resul,"\n")

		
