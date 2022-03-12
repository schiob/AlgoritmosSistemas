STDIN = input().split(" ")
STDOUT = []

def ordenarDinosaurios(STDIN):

    for i in range(1, len(STDIN)):
        ultimaposicion = STDIN[i-1]

        if STDIN[i] < ultimaposicion:
            temp = STDIN[i]
            for j in range(i - 1, -1, -1):
                if temp < STDIN[j]:
                    if j == 0:
                        STDIN[j + 1] = STDIN[j]
                        STDIN[j] = temp
                    else:
                        STDIN[j + 1] = STDIN[j]
        else:
            STDIN[j + 1] = temp
            temp = STDOUT
    return STDOUT

print(ordenarDinosaurios())


##################################################################################################################

numPeliculas = int(input())
nombre, horas, minutos = input().split(" ")
STDIN = []


def ordenarPeliculas():
    if len(STDIN) == 1:
        return STDIN[0]

    mitad = int((len(STDIN))//2)
    mitad1 = STDIN[:mitad:]
    mitad2 = STDIN[mitad::]


    z =  ordenarPeliculas(mitad1)
    k = ordenarPeliculas(mitad2)
    if z < k:
        return z
    else:
        return k

print(ordenarPeliculas())
