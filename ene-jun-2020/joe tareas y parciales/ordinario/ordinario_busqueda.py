def binarySearch(arreglo, inicial, final, x):

    medio = (inicial + final)//2 
    if inicial > final: 
        return -1

    if arreglo[medio][0] == x :

    if x < arreglo[medio][0]: 
        return binarySearch(arreglo, inicial, medio-1, x) 
    else:
        return binarySearch(arreglo, medio+1, final, x)



entrada_datos = input().split()    


# número de cosa que va a comprar
tamaño=int(entrada_datos[0]) 
#artículo que busca
palabra=entrada_datos[1]
## arreglo 
arreglo = []              
for i in range(tamaño): 
    b = input().split()     
    arreglo.append(b)       

def quickSort(arr,start,end):
    
    pivot = start
    point = end
   
    while pivot != point:
        
        if len(arr[point]) < len(arr[pivot]) and point > pivot:
            # Si la regla no se cumple, cambio.
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        elif len(arr[point]) > len(arr[pivot]) and point < pivot:
            # Si la regla no se cumple, cambio.
            arr[point], arr[pivot] = arr[pivot], arr[point]
            pivot, point = point, pivot
        
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

quickSort(arreglo,0,len(arreglo)-1)
#print(arreglo)
print(binarySearch(arreglo, 0, len(arreglo), palabra)+1)