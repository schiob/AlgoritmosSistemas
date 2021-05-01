def busquedaSecuencial(arr, item):
    pos = 0
    encontrado = -1
    while pos < len(arr) and not encontrado:
        if arr[pos] == item:
            encontrado = True
        else:
            pos = pos+1
        return encontrado

n=int(input('REPISA '))
n2=int(input('le caben'))
n3=int(input('paginas'))
n4=int(input('estampillas'))
x=int(input('buscar: '))
arr=[]
for i in range(n):
    arr.append(input('repisa: '))
    for i in range(n2):
        arr.append(input('le caben: '))
        for i in range(n3):
            arr.append(input('paginas: '))
            for i in range(n3):
                arr.append(input('estampillas: '))

ordenado=quickSort(arr)
busquedas=[]
for i in range(x):
    busquedas.append(input('dame algo a buscar: '))

busquedas_index=[]
for b in busquedas:
    result = busquedaSecuencial(ordenado, 0, len(ordenado)-1, b)
    busquedas_index.append(result)

for index in busquedas_index:
    print(index) 
