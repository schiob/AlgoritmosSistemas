def Busqueda_binaria(arr,x):
	pri = 0
	ultimo = len(arr)-1

	while pri <= ultimo:
		centro =(pri + ultimo)//2
		valor = arr[centro]
		var = valor[1]
		if x == var:

			return centro + 1
			pass

		elif x < var:
			ultimo = centro - 1
			pass
		else:
			pri = centro + 1

		pass
	return -1
	pass
	
	


print("lista de regalos")
num = input().split()
cantidad = int(num[0]) 
buscar = num[1] 
print(buscar)

regalos = []	
	
for i in range(cantidad):
	print("regalo buscado: ")
	reg = input().split()
	st = reg[0] 
	nom = int(reg[1])
	regalos.append([st,nom])

bus = []
for x in range(len(regalos)):
	da = regalos[x]

	

	if buscar == da[0]:
		bus = da[1]
		pass
	pass

print(bus)


resultado = Busqueda_binaria(regalos,bus)

print(resultado)
