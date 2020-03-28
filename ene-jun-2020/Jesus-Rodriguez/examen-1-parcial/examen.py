numero_peliculas = int(input(''))
lista_peliculas = []

for i in range(0,numero_peliculas):
    pelicula = int(input('')).split()
    lista_peliculas.append(pelicula)

def obtener_tiempo_total(horas,minutos):
    cantidad_minutos_una_hora = 60
    tiempo_total = (horas*cantidad_minutos_una_hora)+minutos
    return tiempo_total

# Ciclo que irá iterando a través de toda la lista_peliculas.
for i in range(0,len(lista_peliculas)):
    # Decidí utilizar bubble sort por la forma sencilla en que ordena las cosas.
    for j in range(0, numero_peliculas-i-1):
        # Primer caso cuando la duración de la película es diferente.
        if obtener_tiempo_total(lista_peliculas[j][1],lista_peliculas[j][2]) > obtener_tiempo_total(lista_peliculas[j+1][1],lista_peliculas[j+1][2]):
            lista_peliculas[j], lista_peliculas[j+1] = lista_peliculas[j+1], lista_peliculas[j]
        elif obtener_tiempo_total(lista_peliculas[j][1],lista_peliculas[j][2]) == obtener_tiempo_total(lista_peliculas[j+1][1],lista_peliculas[j+1][2]):
            primera_pelicula = lista_peliculas[j][0].lower()
            segunda_pelicula = lista_peliculas[j+1][0].lower()
            if primera_pelicula[0] > segunda_pelicula[0]:
                lista_peliculas[j], lista_peliculas[j+1] = lista_peliculas[j+1], lista_peliculas[j]

respuesta_examen = ''
for i in range(0,len(lista_peliculas)):
    respuesta_examen += '{} '.format(lista_peliculas[i][0])

print(respuesta_examen)
