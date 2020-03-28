# Función que recibe como parámetro un arreglo y lo ordena mediante el álgoritmo shell sort.
def shellSort(alist):
    sublistcount = len(alist)//2
    while sublistcount > 0:
      for startposition in range(sublistcount):
        gapInsertionSort(alist,startposition,sublistcount)
      sublistcount = sublistcount // 2

def gapInsertionSort(alist,start,gap):
    for i in range(start+gap,len(alist),gap):
        currentvalue = alist[i]
        position = i
        while position>=gap and alist[position-gap]>currentvalue:
            alist[position]=alist[position-gap]
            position = position-gap
        alist[position]=currentvalue

# Parámetro.
parametro = int(input(''))

# Arreglo que contiene los id de colores.
id_colores = input('').split(' ')
# Los convierto en enteros.
id_colores = list(map(int, id_colores))

# Los ordeno mediante shell sort.
shellSort(id_colores)

# Los imprimo.
respuesta = ''
for i in range(0,len(id_colores)):
    if i < len(id_colores)-1:
        respuesta += '{} '.format(id_colores[i])
    else:
        respuesta += '{}'.format(id_colores[i])

print(respuesta)
