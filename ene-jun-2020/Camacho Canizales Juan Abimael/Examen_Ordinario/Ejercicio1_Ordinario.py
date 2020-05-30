numero = int(input(""))

aux = []

for i in range(numero):
    aux.append(input("").split(" "))

aux2 = []

for i in range(len(aux)):
    aux2.append(len(aux[i]))


def quicksort(lista):
    izquierda = []
    centro = []
    derecha = []
    if len(lista) > 1:
        pivote = lista[0]
        for i in lista:
            if i < pivote:
                izquierda.append(i)
            elif i == pivote:
                centro.append(i)
            elif i > pivote:
                derecha.append(i)
        return quicksort(izquierda)+centro+quicksort(derecha)
    else:
      return lista

#Hice todo lo que pude, profesor apiadese de mi alma por favor