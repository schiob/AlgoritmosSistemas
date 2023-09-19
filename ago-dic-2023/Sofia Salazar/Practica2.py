
#n = numero de problemas
#m = minutos disponibles
n = (input("Ingrese la cantidad total de problemas: ").split())
m = (input("Ingrese la cantidad de tiempo por problema: ").split())

minutos_dis = [2,5,6,9,4]
for i in range(0,len(minutos_dis)): #recorre el arreglo#
    actual = minutos_dis[i]
    #comparar con todos los anteriores para encontrar el lugar
    idx_final = 0
    for j in reversed(range(0,i)):#recorrer de i -1 hasta 0 de reversa
        if minutos_dis[j] > actual:
            minutos_dis[j+1] = minutos_dis[j]
        else:
            idx_final = j+1
            break
    minutos_dis[idx_final] = actual
print(minutos_dis)

problemas_Resueltos = 0
tiempo_Total=0
i=0
for i in range (n):
    if tiempo_Total + minutos_dis[i] <=m:
        problemas_Resueltos += 1
        tiempo_Total += minutos_dis[i]
    else:
        break


print(problemas_Resueltos)