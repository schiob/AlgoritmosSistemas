# Cantidad de alumnos a los que se les pedirán sus respectivos datos.
numero_personas = int(input(''))
# Creo una lista vacía donde se guardarán los alumnos con sus respectivos datos.
alumnos = []

# Ciclo que agregará alumnos a la lista dado el límite capturado previamente.
for i in range(0,numero_personas):
    persona_medallas = input('').split(' ')
    alumnos.append(persona_medallas)

# Ciclo que irá iterando a través de toda la lista.
for i in range(numero_personas):
    # Decidí utilizar bubble sort por la forma sencilla en que ordena las cosas.
    for j in range(0, numero_personas-i-1):
        # Primer caso cuando un alumno tiene más medallas de oro que el otro.
        if alumnos[j][1] < alumnos[j+1][1]:
            alumnos[j], alumnos[j+1] = alumnos[j+1], alumnos[j]
        # Segundo caso cuando tienen la misma cantidad de medallas de oro pero diferente cantidad de medallas de plata.
        elif alumnos[j][1] == alumnos[j+1][1] and alumnos[j][2] != alumnos[j+1][2]:
            if alumnos[j][2] < alumnos[j+1][2]:
                alumnos[j], alumnos[j+1] = alumnos[j+1], alumnos[j]
        # Tercer caso cuando tienen la misma cantidad de medallas de oro y de plata pero diferente cantidad de medallas de bronce.
        elif alumnos[j][1] == alumnos[j+1][1] and alumnos[j][2] == alumnos[j+1][2] and alumnos[j][3] != alumnos[j+1][3]:
            if alumnos[j][3] < alumnos[j+1][3]:
                alumnos[j], alumnos[j+1] = alumnos[j+1], alumnos[j]
        # Cuarto caso cuando tienen la misma cantidad de medallas de oro, plata y bronce pero se ordenan alfabeticamente.
        elif alumnos[j][1] == alumnos[j+1][1] and alumnos[j][2] == alumnos[j+1][2] and alumnos[j][3] == alumnos[j+1][3]:
            primera_palabra = alumnos[j][0].lower()
            segunda_palabra = alumnos[j+1][0].lower()
            # Obtengo la primera letra de cada palabra para ordenarlas alfabeticamente.
            if primera_palabra[0] > segunda_palabra[0]:
                alumnos[j], alumnos[j+1] = alumnos[j+1], alumnos[j]

# Inicializo una respuesta vacía a la que se le concatenarán los alumnos ordenados con las reglas descritas en el problema.
respuesta = ''
for i in range(0,len(alumnos)):
    respuesta += '{}\n'.format(alumnos[i][0])
# Imprimo la respuesta.
print(respuesta)
