def mergeSort(lista, numeroPaso):
    if len(lista) > 1:
        medio = len(lista)//2
        izquierda = lista[:medio]
        derecha = lista[medio:]
        mergeSort(izquierda,numeroPaso)
        mergeSort(derecha,numeroPaso)
        i = j = k = 0
        if numeroPaso == '1':
            while i < len(izquierda) and j < len(derecha):
                if len(izquierda[i]) < len(derecha[j]):
                    lista[k] = izquierda[i]
                    i+=1
                else:
                    lista[k] = derecha[j]
                    j+=1
                k+=1
        elif numeroPaso == '2':
            while i < len(izquierda) and j < len(derecha):
                if int(izquierda[i][:-2]) < int(derecha[j][:-2]):
                    lista[k] = izquierda[i]
                    i+=1
                else:
                    lista[k] = derecha[j]
                    j+=1
                k+=1
        while i < len(izquierda):
            lista[k] = izquierda[i]
            i+=1
            k+=1
        while j < len(derecha):
            lista[k] = derecha[j]
            j+=1
            k+=1

# Función para ir imprimiendo una lista.
def imprimirLista(lista):
    for i in range(len(lista)):
        print(lista[i])

def obtenerTotalTiempo():
    number = 0
    for i in range(0,len(lista)):
        for j in lista[i]:
            if j[-1] == 'X':
                numero = j.split('-')
                number = number + int(numero[0])
            elif j[-1] == 'B':
                numero = j.split('-')
                number = number + int(numero[0])
                return number
            else:
                return 'no existe ese boleto '
    return 'No hay boleto ganador'

if '_name_'== '_main_':
    n = int(input('Ingresa n \n'))
    lista = []
    for i in range(0,n):
        string = input('Ingresa la línea \n').split(' ')
        lista.append(string)

    print ("Lista base")
    print(lista)
    mergeSort(lista,'1')
    print("Primer paso")
    imprimirLista(lista)
    for i in lista:
        mergeSort(i,'2')
    print("Segundo paso")
    imprimirLista(lista)
    print("Tiempo que tomó hasta encontrar el dulce con el boleto")
    print(obtenerTotalTiempo())