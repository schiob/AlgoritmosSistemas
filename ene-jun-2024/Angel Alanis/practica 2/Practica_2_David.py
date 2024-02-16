def Insertion_Order(arr):
    for i in range(1, len(arr)):
        x = arr[i]
        j = i - 1

        # elementos mayores
        while j >= 0 and x < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = x

def Problemas_que_podra_resolver(problemas_resueltos):
    # variables de conteo
    x = 0 # x es la variable temporal del tiempo utilizado 

    for i in tiempos_problemas:#i es el tiempo
        print("suma de tiempos5",i)
        if x + i <= m:
            problemas_resueltos += 1
            x += i
        else:
            break

    print(problemas_resueltos)        

#entradas 
n, m = map(int, input("Ingresar las tareas de David, y los minutos disponibles: ").split(" "))
problemas_resueltos = 0

# Limitar la cantidad de elementos ingresados a n
tiempos_problemas = []

for i in range(n):
    tiempos_problemas.append(int(input("Ingresar los minutos de cada tarea que tiene David: ")))

Insertion_Order(tiempos_problemas)
Problemas_que_podra_resolver(problemas_resueltos) 