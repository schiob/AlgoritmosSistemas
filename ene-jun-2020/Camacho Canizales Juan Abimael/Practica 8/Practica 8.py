var = ['']*19

for i in range(19):
    var[i] = input()

#Clasificacion de datos
repisa = [[], [], []]
aux = 0
n = 0

for i in range(17):
    if len(datos[i]) > 0:
        repisa[aux].append(datos[i].split(' '))
        n+=1

        for j in range(10):
            repisa[aux][n - 1][j] = repisa[aux][n - 1][j].split(',')
    else:
        aux += 1
        n = 0

#Buscar dato
res = "-1"
for i in range(3):
    for j in range(5):
        for k in range(10):
            for m in range(5):
                if int(repisa[i][j][k][m]) == int(datos[18]):
                    res = str(i + 1) + " " + str(j + 1) + " " + str(k + 1) + " " + str(m + 1)

print(res)