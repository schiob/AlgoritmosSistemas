# obtener la información
datos = ['']*19

for i in range(19):
    datos[i] = input()

# clasificar los datos
repisa = [[], [], []]
aux = 0
u = 0

for i in range(17):
    if len(datos[i]) > 0:
        repisa[aux].append(datos[i].split(' '))
        u+=1

        for j in range(10):
            repisa[aux][u - 1][j] = repisa[aux][u - 1][j].split(',')
    else:
        aux += 1
        u = 0

# buscar el dato en la información
res = "-1"
for i in range(3):
    for j in range(5):
        for k in range(10):
            for m in range(5):
                if int(repisa[i][j][k][m]) == int(datos[18]):
                    res = str(i + 1) + " " + str(j + 1) + " " + str(k + 1) + " " + str(m + 1)

print(res)
