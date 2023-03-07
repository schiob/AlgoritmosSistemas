import sys

stdout_fileno = sys.stdout

n = int(input())  # número de películas
peliculas = []  # lista vacía para almacenar las películas

# leer las n películas
for i in range(n):
    nombre, horas, minutos = input().split()
    duracion = int(horas) * 60 + int(minutos)  # convertir la duración a minutos
    peliculas.append((nombre, duracion))  # agregar la película a la lista como una tupla

# ordenar las películas de menor a mayor duración
for i in range(len(peliculas)):
    for j in range(i+1, len(peliculas)):
        if peliculas[i][1] > peliculas[j][1]:
            peliculas[i], peliculas[j] = peliculas[j], peliculas[i]

# imprimir la lista ordenada
for pelicula in peliculas:
    stdout_fileno.write(pelicula[0] + ' ')
