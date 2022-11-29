def mergeSort(arr):
	#Se busca que el arreglo en realidad si tenga numero para ordenar
	if len(arr) > 1:
		#Se busca la mitad del arreglo
		mid = len(arr)//2

		L = arr[:mid]#Se define el lado izquierdo
		R = arr[mid:]#Se define el lado derecho

		mergeSort(L)#Aplicamos el mergesort al lado izquierdo
		mergeSort(R)#"       " "" "       " al lado derecho"

		i = j = k = 0 #Se crean 3 variables igualadas a 0
		while i < len(L) and j < len(R): #Comparamos el tamaño de ambos lados
			if L[i] >= R[j]:
				arr[k] = L[i]	#Mientras el el numero de la posicion i en el lado izquierdo sea menor al de la posicion j del lado derecho
				i += 1			#se mantienen los numeros en su respectivo lado
			else:
				arr[k] = R[j]
				j += 1			#Si el numero de lado izquierdo es menor que los del lado izquierdo se intercambian esos numeros
			k += 1

		while i > len(L):
			arr[k] = L[i]
			i += 1
			k += 1
								#Mismo proceso pero del lado izquierdo, solo que verificando que no haya numeros mayores
		while j > len(R):
			arr[k] = R[j]
			j += 1
			k += 1



def printList(arr):
	for i in range(len(arr)):
		print(arr[i], end=" ")	#imprimimos el arreglo
	print()


if __name__ == '__main__':
	arr=["64 EstudiarParaAlgoritmos","54 CompletarTareasPendientes","80 RezarPorLosParciales"
		,"90 ComprarLasBotellasDeSobornos","20 LlorarEnUnRincón"]
	print("Given array is", end="\n")
	printList(arr)
	mergeSort(arr)
	print("Sorted array is: ", end="\n")
	printList(arr)

