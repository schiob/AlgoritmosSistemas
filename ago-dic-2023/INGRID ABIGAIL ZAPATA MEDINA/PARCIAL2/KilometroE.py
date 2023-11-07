def quick_sort(lista_autos):
    if len(lista_autos) <= 1:
        return lista_autos
    
    pivote = lista_autos[0][1]  
    menos, igual, mayor = [], [], []
    
    for auto in lista_autos:
        if auto[1] > pivote:
            mayor.append(auto)
        elif auto[1] == pivote:
            igual.append(auto)
        else:
            menos.append(auto)
    
    return quick_sort(mayor) + igual + quick_sort(menos)

n = int(input())  
lista_autos = []  

for i in range(n):
    nombre_auto, kilometraje = input().split()
    kilometraje = int(kilometraje)
    lista_autos.append((nombre_auto, kilometraje))

autos_ordenados = quick_sort(lista_autos)

for auto in autos_ordenados:
    print(auto[0], end=' ')