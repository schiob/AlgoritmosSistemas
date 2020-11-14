def sort(lista):
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
        return sort(izquierda)+centro+sort(derecha)
    else:
      return lista


def binarySearch(arr, l, r, x):
    while l <= r:

        mid = l + (r - l) // 2;
       
        if arr[mid] == x:
            return mid

        elif arr[mid] < x:
            l = mid + 1
  
        else:
            r = mid - 1

    return -1

n = input("Dime cuantos tazos tienes y el numero de serie que busca separado por un espacio -> ")
n = n.split(" ")
nserie = input("Dime los numeros de serie de tus tazos separados por un espacio -> ")
nserie = nserie.split(" ")
serieordenada = sort(nserie)
print(serieordenada)
print(n[1])
print(binarySearch(serieordenada, 0, len(serieordenada)-1, n[1]))