

nombre = ["CANDESARTAN HIDROCLOROTIAZIDA ALTER","CARBAMAZEPINA NORMON","MATRIF","ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"]
print(len(nombre))
if len(nombre) >=1 and len(nombre) <= 100:
	print(nombre)

	for i in range(1,len(nombre)):
		temp = nombre[i]
		j = i-1

		while j >= 0 and len(temp) < len(nombre[j]):
			nombre[j+1] = nombre[j]
			j =j-1
			nombre[j+1] = temp
			pass
		pass

	print("\n Ordenados")
	print(nombre)

	pass