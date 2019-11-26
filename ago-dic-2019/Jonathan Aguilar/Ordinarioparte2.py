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

if __name__ == "__main__":
    
    n,x = input().split()       ##ingreso del tamaño del arreglo y lo que buscas
    arreglo = []                ## arreglo 
    for i in range(int(n)): 
        b = input().split()     ##datos a ingresar
        arreglo.append(b)       ## se agregan los datos en el arreglo

    print("=========estos son los datos que ingresaste=========")
    print(arreglo)
    print("=========Posicion del articulo que buscas n.n=========")
    print(binarySearch(arreglo, 0, len(arreglo), x)+1)