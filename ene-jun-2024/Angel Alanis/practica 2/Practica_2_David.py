def Insertion_Order(arr):
    for i in range(1, len(arr)):
        x = arr[i]
        j = i - 1

        # elementos mayores
        while j >= 0 and x < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = x
        
#entradas 
n, m = map(int, input("Ingresar las tareas de David, y los minutos disponibles: ").split(" "))

# Limitar la cantidad de elementos ingresados a n
tiempos_problemas = []
for i in range(n):
    tiempos_problemas.append(int(input("Ingresar los minutos de cada tarea que tiene David: ")))

# Ahora tiempos_problemas contendrá exactamente n elementos

Insertion_Order(tiempos_problemas)

# variables de conteo
problemas_resueltos = 0
x = 0 # x es la variable temporal del tiempo utilizado 

for i in tiempos_problemas:#i es el tiempo
    print("suma de tiempos5",i)
    if x + i <= m:
        problemas_resueltos += 1
        x += i
    else:
        break

print(problemas_resueltos)