#___________________________odenamiento por sehll____________________________
def Shell(arr):
	salto = len(arr)//2 # en numero del salto al principio
	while salto > 0: # mientras haya algun valor en el arreglo se puede correr el ciclo
	                 # siempre y cuando salto se pueda dibidir en entero
		for i in range(salto,len(arr),1): # i toma la pocicion de salto para ir recorriendo el arreglo
			j = i-salto #toma la distancia del salto  y comparar la pocicion separada por el tamaño de salto

			while j >= 0: # y siempre que "j" tenga un valor mayor a cero en la divicion del salto se corre el ciclo

				k = j + salto # "k" obtiene el valor de "j + salto" osea la pocision distante para la comparacion con j
				nom = arr[j]
				nom2 = arr[k]
				if nom[0] <= nom2[0]: # se compara la posicion de "j" con respecto a la pocicion del salta "k"
					j =-1 # si es menor "j" se da el valor -1 para romper el ciclo
					pass

				elif nom[0] > nom2[0]: # se compara los valosres en las posiciones para hacer el intercambio
					aux = arr[j]
					arr[j] = arr[k]
					arr[k] = aux
					j -= salto 
				pass 
			pass
		#print("salto: ", salto) #posiciones de los saltos	
		salto = salto//2 # se vuelve a hacer la divicion de salto siempre y cuando salto no llegue a sero o menor
		pass
	return arr
	pass

#_____________________________________Busqueda binaria________________________________________
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

#________________________________main___________________________________________
import random
if __name__ == '__main__':
	print("numero de medicamento y peticiones a buscar:")
	num = input().split()
	medi = int(num[0])
	peti = int(num[1])
	arr=[]

	for i in range(medi):
		print(i+1,"° primer medicamento")
		lista = input()
		arr.append(lista)
		print("")
		pass

	print(arr,"\n")
	print("------------------------------------------------Ordenado por Shell------------------------------------------")

	arr = Shell(arr)
	print(arr)

	for i in range(peti):
		x = input("medicamento a buscar: ")
		resul = Busqueda_binaria(arr,x)
		print(resul,"\n")
		pass
