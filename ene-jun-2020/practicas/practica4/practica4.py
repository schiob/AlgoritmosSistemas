#_______________________________________________________________________________________________________
def Merge_Sort(arr):
    arr3= arr
    if len(arr) > 1:
       
        middle = len(arr)//2
        arrleft = arr[:middle]
        arrright = arr[middle:]
       
        arrleft = Merge_Sort(arrleft)
        arrright = Merge_Sort(arrright)
        
        arr3 = Mezclado(arrleft,arrright)
    return arr3 


def Mezclado(arrleft,arrright):
    arr2 =arrleft+arrright 
    center = 0
    left = 0
    right = 0
    
    while len(arrleft) > left and len(arrright) > right:
        if arrleft[left] < arrright[right]:
            arr2[center] = arrleft[left]
            center +=1
            left +=1
        else:
            arr2[center] = arrright[right]
            center +=1
            right +=1
    
    while len(arrleft) > left:
        arr2[center] = arrleft[left]
        center +=1
        left +=1
    
    while len(arrright) > right:
        arr2[center] =arrright[right]
        center +=1
        right +=1

    return arr2


#metodo main

if __name__ == '__main__':
    letra = ["A","T","J","Q","K"]
    numero = [1,10,11,12,13]
   
    carta=[   [('A','T'),(2,'C'),(3,'E'),(4,'D')]   ,   [(3,'T'),(3,'C'),('T','E'),(3,'D'),(2,'D')]  ,  [('T','E'),('A','E')]  ]

    print(len(carta),"\n")


    for x in range(len(carta)):
        a,b = zip(*carta[x])
        lista=list(a)
        lista2 = list(b)
        for i in range(len(lista)):
            lista2[i] = str(lista[i])+str(lista2[i]) 
            pass
        print(lista2)   
        pass

    for x in range(len(carta)):
        a,b = zip(*carta[x])
        lista=list(a)
        lista2 = list(b)
        for i in range(len(lista)):

            for j in range(len(lista)):
                if lista[i] == letra[j] :
                    lista[i] = numero[j]
                    pass
                pass
            pass
        carta[x] = list(zip(lista,lista2))
        pass

    for x in range(len(carta)):
        new = Merge_Sort(carta[x])
        carta[x]=new
        pass

    print("___________________________________cartas ordenadas____________________________________________________________________")

    for x in range(len(carta)):
        a,b = zip(*carta[x])
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
