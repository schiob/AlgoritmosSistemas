lista = []
lista2=[]
i=0
while(i<20):
	num=(int(input("ingrese un numero: ")))
	lista.append(num)
	i+=1
	if(num%2==0):
		lista2.append(num)
print(lista)
print(lista2)
lista2.reverse()
print(lista2)
