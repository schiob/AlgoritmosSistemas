def Busqueda_binaria(arr,x):
	primero = 0
	ultimo = len(arr)-1

	while primero <= ultimo:
		centro =(primero + ultimo)//2
		valor = arr[centro]
		var = valor[1]
		if x == var:

			return centro + 1
			pass

		elif x < var:
			ultimo = centro - 1
			pass
		else:
			primero = centro + 1

		pass
	return -1
	pass
	

#_______________________________________________________________________
print("cantida regalos y buscar regalos:")
num = input().split()
cantidad = int(num[0]) # la cantidad de canciones
buscar = num[1] # las peticiones a buscar
print(buscar)

regalos = []	
	
for i in range(cantidad):
	print("nombro de regalos: ")
	reg = input().split()
	st = reg[0] # lista de las cancione
	nom = int(reg[1])
	regalos.append([st,nom])

bus = []
for x in range(len(regalos)):
	pe = regalos[x]

	print(regalos[x], end=" ")

	if buscar == pe[0]:
		bus = pe[1]
		pass
	pass

print(bus)


resultado = Busqueda_binaria(regalos,bus)

print(resultado)
