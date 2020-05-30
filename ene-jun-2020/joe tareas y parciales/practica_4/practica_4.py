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


#metodo main

if __name__ == '__main__':
    letra = ["A","T","J","Q","K"]
    numero = [1,10,11,12,13]
   #arreglo lista de tuplas
    joe=[   [('A','T'),(2,'C'),(3,'E'),(4,'D')]   ,   [(3,'T'),(3,'C'),('T','E'),(3,'D'),(2,'D')]  ,  [('T','E'),(1,'E')]  ]

    print(len(joe),"\n")#tamaño del arreglo 

#imprime el numero de cartas de cada jugados
    for x in range(len(joe)):
        a,b = zip(*joe[x])
        lista=list(a)
        lista2 = list(b)
        for i in range(len(lista)):
            lista2[i] = str(lista[i])+str(lista2[i]) 
            pass
        print(lista2)   
        pass
#transforma la letra utilizando unos arreglo definidos como "letra","numero" para cambiarlo por dicho numero
    for x in range(len(angel)):
        a,b = zip(*angel[x])
        lista=list(a)
        lista2 = list(b)
        for i in range(len(lista)):

            for j in range(len(lista)):
                if lista[i] == letra[j] :
                    lista[i] = numero[j]
                    pass
                pass
            pass
        joe[x] = list(zip(lista,lista2))
        pass
#se ordena las pociciones de los numero utilizando merge_sort
    for x in range(len(joe)):
        new = Merge_Sort(angel[x])
        joe[x]=new
        pass

    print("___________________________________cartas ordenadas____________________________________________________________________")
#imprime las cartas ordenadas de cada mano
    for x in range(len(joe)):
        a,b = zip(*joe[x])
        lista=list(a)
        lista2 = list(b)
        for i in range(len(lista)):

            for j in range(len(letra)):
                if lista[i] == numero[j] :
                    lista[i] = letra[j]
                    pass
                pass
            pass
            lista[i] = str(lista[i])+str(lista2[i]) 
        print(lista)
        pass




        