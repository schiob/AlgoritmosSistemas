def mainBSF():
    # Crear el grafo
    adja_list = []
    with open("grafo.txt", "r") as file:
        n, e = file.readline().split()
        n = int(n)
        e = int(e)

        for i in range(n):
            adja_list.append([])

        for _ in range(e):
            nodo1, nodo2 = map(int, file.readline().split())
            print(nodo1,":::",nodo2)
            adja_list[nodo1].append(nodo2)
            adja_list[nodo2].append(nodo1)
            print(adja_list,";;;;;;;;;")
        print(adja_list,"________________________________")
    # for edge in edge_list:
    #   print(edge[0], edge[1])

    # BFS
    Q = []
    visitado = [False] * n
    saltos_para_inicio = [0] * n

    visitado[0] = True
    Q.insert(0, 0)
    while len(Q) != 0:
        nodo_actual = Q.pop()
        print("procesando el nodo:", nodo_actual)

        # Recorrer las aristas
        for w in adja_list[nodo_actual]:
            # si el nodo ya se visitó
            print(w,"......")
            if not visitado[w]:
                print("entro: ",w)
                visitado[w] = True
                Q.insert(0, w)
                saltos_para_inicio[w] = saltos_para_inicio[nodo_actual] + 1
                print(Q)
                print(saltos_para_inicio)

    print()
    print(adja_list)
    for i, val in enumerate(saltos_para_inicio):
        print("nodo", i, "está a", val, "saltos :)")


if __name__ == "__main__":
   mainBSF()




