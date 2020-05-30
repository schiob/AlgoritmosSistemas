
##algoritmo de busqueda binaria
def binarySearch(arreglo, inicial, final, x):

    medio = (inicial + final)//2 ##sDivide el arreglo en partes iguales
    if inicial > final: 
        return -1

    if arreglo[medio][0] == x : ## si x esta exactamente a la mitad
        return medio

    if x < arreglo[medio][0]: 
        return binarySearch(arreglo, inicial, medio-1, x) ## busca x en el inicio hasta medio-1
    else:
        return binarySearch(arreglo, medio+1, final, x) ## busca x en la mitad +1 hasta el final del arreglo


##ingreso del tamaño del arreglo y lo que buscas
entrada_datos = input().split()    

#declarar posiciones
# número de artículo
tamaño=int(entrada_datos[0]) 
#artículo que busca Panchito.
palabra=entrada_datos[1]
## arreglo 
arreglo = []              
for i in range(tamaño): 
    b = input().split()     ##datos a ingresar
    arreglo.append(b)       ## se agregan los datos en el arreglo

#print(arreglo)
print(binarySearch(arreglo, 0, len(arreglo), palabra)+1)
