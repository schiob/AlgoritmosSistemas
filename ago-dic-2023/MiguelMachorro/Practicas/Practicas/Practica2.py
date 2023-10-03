#Entrada.
n, m = map(int, input("Ingrese el numero de problemas, un espacio y el tiempo disponible\n").split())
tiempos = list(map(int, input("Ingresa el tiempo que te lleva hacer cada problema\n").split()))

#Inicializacion de variables.
problemas_resueltos = 0
tiempo_total = 0

#Ordena la lista.
for i in range(n - 1):
    for j in range(0, n - i - 1):
        if tiempos[j] > tiempos[j + 1]:
            # Intercambia los elementos si están en el orden incorrecto.
           tiempos[j], tiempos[j + 1] = tiempos[j + 1], tiempos[j]

#Basado en los tiempos de cada problema se sabe cuantos problemas resolvio David.
for i in range(n):
    problema_actual = tiempos[i]
    if tiempo_total + problema_actual <= m:
        tiempo_total += problema_actual
        problemas_resueltos += 1
    else:
        break;

#Imprime la cantidad de problemas que puede resolver David en dicho tiempo.
print("Lista de tiempos ordenadas", tiempos)
print("numero de problemas que pudo resolver David", problemas_resueltos)

