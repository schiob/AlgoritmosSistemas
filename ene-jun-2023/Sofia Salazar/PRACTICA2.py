arreglo=[3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78]
numpar=[]
print(arreglo)
for s in range(0,len(arreglo)):
    if arreglo[s] % 2 == 0:
        numpar.append(arreglo[s])


for i in range(0,len(arreglo)): #recorre el arreglo#
    actual = arreglo[i]
    #comparar con todos los anteriores para encontrar el lugar
    idx_final = 0
    for j in reversed(range(0,i)):#recorrer de i -1 hasta 0 de reversa
        if arreglo[j] > actual:
            arreglo[j+1] = arreglo[j]
        else:
            idx_final = j+1
            break
    arreglo[idx_final] = actual
print(arreglo)