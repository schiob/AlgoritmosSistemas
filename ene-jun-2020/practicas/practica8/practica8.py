def buscar(repi,bus):
	flag = False
	while flag == False:
		for x in range(len(repi)):
			re = repi[x]
			for i in range(len(repi[x])):
				re2 = re[i]
				for k in range(len(re2)):
					re3 = re2[k]
					for j in range(len(re3)):
						if bus == repi[x][i][k][j]:
							return "Repisa:",x," Libro: ",i," Hoja: ",k,"Estampillas: ",j
		flag = True
	return -1
	pass

def ver(repi):
	for x in range(len(repi)):
		re = repi[x]

		for i in range(len(repi[x])):
			re2 = re[i]

			for k in range(len(re2)):
				re3 = re2[k]

				for j in range(len(re3)):
					print(repi[x][i][k][j], end="")
					if j < len(re3):
						print(end=",")
						if j == (len(re3)-1):
							print(end=" ")
					pass
			print(" ")
			pass
		print("\n")
		pass
	pass


import random
print("No. de repisas, libros, hojas y estampillas")
num = input().split()
repisa = int(num[0])
libro  = int(num[1])
hoja  = int(num[2])
estampillas = int(num[3])

repi = []
for i in range(repisa):
	
	repi.append([])

	for j in range(libro):
		repi[i].append([])
		pass

		for x in range(hoja):
			repi[i][j].append([])

			for k in range(estampillas):
				repi[i][j][x].append(random.randint(1, 750))
				pass
			pass
	pass
print("")
print(ver(repi))
#busuqeda
print(" numero que buscas: ")
bus = int(input())
print(buscar(repi,bus))
