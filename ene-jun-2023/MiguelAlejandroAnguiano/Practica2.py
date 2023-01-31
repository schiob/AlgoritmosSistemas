num=[3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78]
print(num)
par=[]

for x in range(0,len(num)):
    if num[x] % 2 == 0:
        par.append(num[x])

for i in range(0, len(par)): #recorrer el arreglo
    actu=par[i] #Posicion actual
    final=0
    for j in reversed(range(0,i)): #Recorrer desde la posicion actual a cero
        if par[j]<actu:
            par[j+1]=par[j] #intercambiar el mayor a la posicion actual
        else:
            final=j+1
            break
    par[final]=actu

print(par)