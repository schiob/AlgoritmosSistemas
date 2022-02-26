lista_num = [3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78]

def checkPar(lista_num):
    listaPar = []
    for i in lista_num:
        if i % 2 ==0:
            listaPar.append(i)
            x = listaPar
    return x



def bubbleSort():
    lista_ordenana = checkPar(lista_num)
    total_lista_ordenada = len(lista_ordenana)
    for k in range(total_lista_ordenada):
        for o in range(0, total_lista_ordenada-k-1):
            if lista_ordenana[o] > lista_ordenana[o+1]:
                lista_ordenana, lista_ordenana[o+1] = lista_ordenana[0+1], lista_ordenana[o]










checkPar(lista_num)
bubbleSort()
