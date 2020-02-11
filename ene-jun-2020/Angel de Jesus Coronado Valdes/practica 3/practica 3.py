if __name__ == '__main__':

	num=int(input("Numero de medicinas: "))
	nombre=[]#cantidad de medicina
	#nombre = ["CANDESARTAN HIDROCLOROTIAZIDA ALTER","CARBAMAZEPINA NORMON","MATRIF","ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"]

	if num >=1 and num <= 100:
		for i in range(num):
			print("Nombre: ")
			nom = input()
			nombre.insert(i, nom)#se agrega el nombre de la medicina 
			print("")
			pass

		print("\n")
		print(num,"\n",nombre,"\n")

		#se ordena por tamaño de la palabra utilizando len como tamaño de caracteres
		#utilizando insertion sort

		for i in range(1,len(nombre)):
			temp = nombre[i]
			j = i-1

			while j >= 0 and len(temp) < len(nombre[j]):
				nombre[j+1] = nombre[j]
				j =j-1
				nombre[j+1] = temp
				pass
			pass

		print(nombre)

		pass