def quickSort(arr,start,end):
    # Se asigna un pivote y un point dados como parámetros.
    pivot = start
    point = end
    # Se comparan hasta que seans iguale o mientras sean diferentes.
    while pivot != point:
        # Comparo pivote con el point.
        # Acercar el point al pivote.
        if len(arr[point]) < len(arr[pivot]) and point > pivot:
            # Si la regla no se cumple, cambio.
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot

        elif len(arr[point]) > len(arr[pivot]) and point < pivot:
            # Si la regla no se cumple, cambio.
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        # Acercar el apuntador al pivote.
        if pivot > point:
            point += 1
        else:
            point -= 1
    # Izquierda.
    if pivot != start:
        quickSort(arr, start, pivot-1)
    # Derecha.
    if pivot != end:
        quickSort(arr, pivot+1, end)


#INGRESA NUMEROS DE LINEAS
   
n = int(input())
#declara arreglo
lista = []

#pedir datos
for i in range(0,n):
    arreglo = input('').split(' ')
    lista.append(arreglo)
#imprime lista Primero ordenan las cajas de menor a mayor en cuanto a cantidad de dulces:

quickSort(lista,0,len(lista)-1)



#imprimir listaa
def imprimirLista(lista): 
    for i in range(len(lista)):         
        print(lista[i]) 

#imprimirLista(lista)




#contar tiempo
def Tiempo():
    numeros = 0
    for i in range(0,len(lista)):
        for j in lista[i]:
            if j[-1] == 'X':
                numero = j.split('-')
                numeros = numeros + int(numero[0])
            elif j[-1] == 'B':
                numero = j.split('-')
                numeros = numeros+ int(numero[0])
                return numeros
            else:
                return 0
    return 0
  


#Luego ordenan cada dulce de menor a mayor:
for b in lista:
    for i in lista:
        quickSort(b,0,len(b)-1)
        

#imprimirLista(lista)
print(Tiempo())
