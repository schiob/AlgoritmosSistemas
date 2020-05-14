#_____________________________________Busqueda binaria________________________________________
def Binary_search(arr,x):
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
#__________________________________________________________________________________________________


#___________________________odenamiento por quick_sort____________________________
def quick(arr,primero,ultimo):
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
			quick(arr,primero,max)
			pass
		if min < ultimo:
			quick(arr,min,ultimo)
			pass
		return arr
	pass
#____________________________________________________________________________________________


#________________________________main___________________________________________
import random
if __name__ == '__main__':
	print("canciones y peticiones:")
	num = input().split()
	medi = int(num[0]) # la cantidad de canciones
	peti = int(num[1]) # las peticiones a buscar
	arr=[]
	cancion = []	

	print("nombre de canciones: ")
	cancion = input().split() # lista de las canciones

	if medi == len(cancion): # si numero de canciones no concide con la lista esta fuera de rango
		print("")
		print("Buscar cancion: ")
		buscar = []

		for x in range(peti):
			bus = input()
			buscar.append(bus)   # se agrega la canciones a buscar

#__________________________se ordena por quick sort__________________________________________________________
		arr = quick(cancion,0,len(cancion)-1)
		print(" ")

		for i in range(len(arr)):
			print(arr[i], end=" ")    #imprime la lista ordenada
		print("")

		if peti == len(buscar):   # si el numero de peticiones no es igual a la lista de peticiones esta fuera de rango
			for i in range(len(buscar)):
				resul = Binary_search(arr,buscar[i])  #se busca las caciones comparando las canciones con la lista de peticion
				print(resul,"\n")

		elif peti != len(buscar):
			primero("fuera de rango de peticiones")

	elif medi != len(cancion):
		print("fuera de rango")
	#print(arr,"\n")
	print("------------------------------------------------Ordenado por quick_sort------------------------------------------")
	print("------------------------------------------------Busqueda binaria------------------------------------------")

	
