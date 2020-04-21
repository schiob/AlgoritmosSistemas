# obtener la información
datos = ['']*19

for i in range(19):
    datos[i] = input()

# clasificar los datos
repisa = [[], [], []]
#declaración de variables
aux = 0
aux2 = 0

for i in range(17):
    
    if len(datos[i]) > 0:
        repisa[aux].append(datos[i].split(' '))
        aux2+=1
        
        for j in range(10):
            repisa[aux][aux2 - 1][j] = repisa[aux][aux2 - 1][j].split(',')
    else:
        aux += 1
        aux2 = 0

# busqueda del numero
busqueda = "-1"
for a in range(3):#repisa
    for b in range(5):#libro
        for c in range(10):#pagina
            for d in range(5):#estampilla
                if int(repisa[a][b][c][d]) == int(datos[18]):
                    busqueda = str(a + 1) + " " + str(b + 1) + " " + str(c + 1) + " " + str(d + 1)
                    
print(busqueda)
