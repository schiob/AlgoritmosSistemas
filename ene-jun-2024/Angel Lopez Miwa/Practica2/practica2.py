#Entradas en la terminal
n=int(input("Ingrese la cantidad de problemas que se encargaron:"))
m= int(input("Ingrese la cantidad de minutos disponibles:"))
print(n, "Problemas",m,"Minutos Disponibles")

#Crear el arreglo con tamaño igual a n
arr=input("Ingrese el numero de minutos que toma hacer cada problema:")

arreglo=list(map(int,arr.split()[:n]))

print(arreglo)

"""
if len(arreglo)!=n:
    print("Se pidieron",n,"datos.")
else:
        print(arreglo)
"""

#def insertion_sort():
#Desarrollo de algoritmo insertion sort

for i in range(1,len(arreglo)):

    temp=arreglo[i]
    j=i-1
    while j >= 0 and temp < arreglo[j]:
        arreglo[j + 1] = arreglo[j]
        j -= 1
    arreglo[j + 1] = temp

print("-----", arreglo)

#Calcular cuantas tareas puede hacer con el tiempo dado.
tiempo=0
tareas_hechas=0
for i in range(0,len(arreglo), + 1):
    tiempo=arreglo[i]+ tiempo
    tareas_hechas+=1
    if tiempo > m:
        break

print("Se pueden hacer un total de ",tareas_hechas-1,"tareas en ",m ,"minutos")