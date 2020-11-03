entrada = input()
tareasymin = entrada.split(" ")
tareas = int(tareasymin[0])
minutos = int(tareasymin[1])

arreglo = input()
separararreglo = arreglo.split(" ")
lista = [int(x) for x in separararreglo]

for i in range(1, len(lista)):

    actual = lista[i]
    indice = i
    
    while indice > 0 and lista[indice -1] > actual:
       lista[indice] = lista[indice - 1]
       indice = indice -1


    lista[indice] = actual
    
print(lista)

for j in range (0,len(lista)):
    aux = lista[j]
    a=0
while aux < minutos:
       #a = a + 1
    if(aux < minutos and aux+lista[j+1] > minutos): 
       print(a+1)
    elif (aux == minutos):
        
        print()
    elif (aux > minutos):
        aux = aux + lista[j+1]
         

print(a)


"""entrada = input()
tareasymin = entrada.split(" ")
tareas = int(tareasymin[0])
minutos = int(tareasymin[1])

arreglo = input()
separararreglo = arreglo.split(" ")
a = int(separararreglo[0])
b = int(separararreglo[1])
c = int(separararreglo[2])
d = int(separararreglo[3])
e = int(separararreglo[4])
f = int(separararreglo[5])
g = int(separararreglo[6])
h = int(separararreglo[7])
i = int(separararreglo[8])
j = int(separararreglo[9])
lista = [a,b,c,d,e,f,g,h,i,j]

for i in range(1, len(lista)):

    actual = lista[i]
    indice = i
    
    while indice > 0 and lista[indice -1] > actual:
       lista[indice] = lista[indice - 1]
       indice = indice -1


    lista[indice] = actual
    
print(lista)

for j in range (0,len(lista)):
    aux = lista[j]
    a
while aux < minutos:
       
    if(aux > minutos ):
       print(a)
    elif (aux == minutos):
        a=a+1
        print("a")
    elif (aux < minutos):
        aux = aux + lista[j+1]"""
  
