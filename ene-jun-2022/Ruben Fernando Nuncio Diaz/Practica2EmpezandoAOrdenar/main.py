# [X] input con espacio de los minutos y los problemas en una misma linea
# [X] input de la lista de problemas
# [X] Odernar mediante insertion Sort

problemas, minutos = int(input())
listaProblemas = []

for i in range(problemas):

    xInputProblemas = listaProblemas.append(int(input()))



def insertionSort():
    for i in range(1, len(listaProblemas)):
        buscarindex = i
        valor_insertar = listaProblemas[i]
        while buscarindex > 0 and listaProblemas[buscarindex - 1] > valor_insertar:
            listaProblemas[buscarindex] = listaProblemas[buscarindex-1]
            buscarindex -= 1
            listaProblemas[buscarindex] = valor_insertar


def checar():

    if len(listaProblemas) == 0:
        print('No hay problemas por hacer')
    elif max(listaProblemas) > minutos:
        listaProblemas.remove(max(listaProblemas))



# como hacer la sumas
# ver si un problema es mayor a los minutos que tenemos
#Proble al momento de acer una lcase main


insertionSort()