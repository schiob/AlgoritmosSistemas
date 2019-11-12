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
        #print(izquierda+["-"]+centro+["-"]+derecha)
        return quicksort(izquierda)+centro+quicksort(derecha)
    else:
      return lista

def binarysearch(arr,inicio,fin,x):
    if inicio > fin:
        return-1 #determina que no lo hemos encontrado
    mid= (inicio+fin)//2
    if arr[mid]==x:
        return mid
    if x < arr[mid]:
        return binarysearch(arr, inicio,mid-1,x)##regresar lo que me da + mid
    else:
        return binarysearch(arr,mid+1, fin, x)



n,m=input().split()
n,m=int(n),int(m)


arr=list(map(str,input().split()))
arr=quicksort(arr)
print((arr))

for i in range (m):
    s = str(input())
    print(binarysearch(arr,0,len(arr),s))