# Obtengo la longitud de la lista.
length = int(input(''))
# Creo una lista donde se almacenarán los datos.
data = []
# Ciclo para agregar elementos a la lista.
for i in range(length):
    data.append(input(''))

# Algoritmo de ordenamiento basado en el tamaño del string.
for i in range(1,length):
    temporal = data[i]
    j = i-1
    while j >= 0 and len(temporal) < len(data[j]):
        data[j+1] = data[j]
        j-=1
    data[j+1] = temporal

# Ciclo para imprimir la nueva lista ordenada dado el tamaño de cada string.
for i in range(0,len(data)):
    print('{}'.format(data[i]))
