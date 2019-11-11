
def MergeSort(lista):
    if len(lista) > 1:
        mitad = len(lista)//2
        Izq = lista[:mitad]
        Der = lista[mitad:]
        MergeSort(Izq)
        MergeSort(Der)
        i=0 
        j=0
        k=0
        while i < len(Izq) and j < len(Der):
            if int(Izq[i][1]) < int(Der[j][1]):
                lista[k] = Izq[i]
                i+=1
            else: 
                lista[k] = Der[j]
                j+=1
            k+=1

        while i < len(Izq):
            lista[k] = Izq[i]
            i+=1
            k+=1
        while j < len(Der):
            lista[k] = Der[j]
            j+=1
            k+=1

lista = []
n = int(input("Rango: "))
for i in range(n):
    libro= input("Nombre del libro: ").split()
    lista.append(libro)
MergeSort(lista)
for i in lista:
    print(''.join(i[0]), end=" ")