#________________Quick ordena los tiempos________________________

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
#_________________quick ordena tamaños de cajas____________________________________________________
def quick_sort(arr,primero, ultimo):

	pivote = len(arr[(primero+ultimo)//2])
	min =primero
	max =ultimo
	while min <= max:

		while len(arr[min]) < pivote:
			min +=1
			pass

		while len(arr[max]) > pivote:
			max -=1
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

#_________________main_____________________________________
print("cantidad chocolate:")
num = int(input())
auxi = ["1","2","3","4","5","6","7","8","9","0"]

if 1 < num and num < 15:
	arr = []
	st2 = 0
	st3 = " "

	for i in range(num):
		print("chocolates y boleto: ")
		choco = input().split()
		arr.append([])
		for j in range(len(choco)):
			st=""
			aux = choco[j]
			for x in range(len(aux)):

				for k in range(len(auxi)):
					if aux[x] == auxi[k]:
						st += str(aux[x])
						st2 = int(st)
					else:
						st3 = "-"+aux[x]

			arr[i].append([st2,st3])
	print(arr)
	print("")
	for i in range(len(arr)):
		print(arr[i])

	resul = arr

	for x in range(len(arr)):
		resul = quick_sort(arr,0,len(arr)-1)
		pass
	for x in range(len(resul)):
		print(resul[x])
		pass

	for i in range(len(resul)):
		cool = resul[i]
		if 1 < len(cool):
			quick(cool,0,len(resul[i])-1)


	for i in range(len(resul)):
		print(resul[i])

	act = False
	res = 0
	for i in range(len(resul)):
		cool = resul[i]

		if act == False:
			for x in range(len(cool)):
				cool2 = cool[x]
				if cool2[1] != '-b':
					res += cool2[0]
				
				elif cool2[1] == '-b' :
					res+=cool2[0]
					act = True
					break
		elif act == True:
			break
	print(res)