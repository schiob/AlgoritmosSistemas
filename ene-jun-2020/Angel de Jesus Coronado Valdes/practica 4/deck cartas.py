#_______________________________________________________________________________________________________
def Merge_Sort(arr):
	arr3= arr
	if len(arr) > 1:
		#se divide el arreglo por la mitad
		#y se le asignan a dos arreglo arrleft y arrright
		middle = len(arr)//2
		arrleft = arr[:middle]
		arrright = arr[middle:]
		#print("....",arrleft)
		#print(arrright,".....")
		#Recursividad
		arrleft = Merge_Sort(arrleft)
		arrright = Merge_Sort(arrright)
		#metodo para reorganizar los numeros
		arr3 = Mezclado(arrleft,arrright)
	return arr3 


def Mezclado(arrleft,arrright):
	arr2 =arrleft+arrright #arreglo con el tamaño original del arreglo
	#apuntadores
	center = 0
	left = 0
	right = 0
	#comparacion del tamaño del arreglo con el apuntador en crsimiento
	#si el apuntador es igual o ma grande que el tamaño del arreglo se detiene el while
	while len(arrleft) > left and len(arrright) > right:
		if arrleft[left] < arrright[right]: # se compara los arreglos 
			arr2[center] = arrleft[left]
			center +=1
			left +=1
		else:
			arr2[center] = arrright[right]
			center +=1
			right +=1
    #reacomoda todo lo que esta en el lado izquierdo 
    #y lo almacena en el arreglo arr2
	while len(arrleft) > left:
		arr2[center] = arrleft[left]
		center +=1
		left +=1
    #reacomoda todo lo que esta en el lado derecho 
    #y lo almacena en el arreglo arr2
	while len(arrright) > right:
		arr2[center] =arrright[right]
		center +=1
		right +=1

	return arr2	

#-----------main ordenado de menor a mayor
import random
if __name__ == '__main__':
	letra = ["A","T","J","Q","K"]
	numero = [1,10,11,12,13]

	angel=[   [(1,'T'),(2,'C'),(3,'E'),(4,'D')]   ,   [(3,'T'),(3,'C'),(10,'E'),(3,'D'),(2,'D')]  ,  [(10,'E'),(1,'E')]  ]
	print("  ")
	print("---------Organizado por Merge_Sort----------------------")
	print(len(angel))
	for x in range(len(angel)):
		new = Merge_Sort(angel[x])
		print(new,"\n")
		angel[x]=new
		pass

	p=[]
	p2=[]
	p3=[]
	p4 =[]
	p5=[]
	p6=[]
	for i in range(len(angel)):
		for j in range(len(angel[i])):
			if i == 0:
				a,b = zip(*angel[i])
				p= list(b)
				p4 = list(a)
				pass
			pass
			if i == 1:
				a,b = zip(*angel[i])
				p2=list(b)
				p5 = list(a)
				pass
			if i == 2:
				a,b = zip(*angel[i])
				p3 = list(b)
				p6 = list(a)
				pass
			pass
		pass

	print("__________________________________________________")
	for x in range(len(angel)+1):
		if p4[x] == numero[x] :
			p[x] = letra[x] +p[x]
		else:
			p[x] = str(p4[x])+p[x]
		pass

	for x in range(len(angel)+2):
		if p5[x] == numero[x] :
			p2[x] = letra[x] +p2[x]
		else:
			p2[x] = str(p5[x])+p2[x]
		pass

	for x in range(len(angel)-1):
		if p6[x] == numero[x] :
			p3[x] = letra[x] +p3[x]
		else:
			p3[x] = str(p6[x])+p3[x]
		pass

print(p,"\n")
print(p2,"\n")
print(p3,"\n")
