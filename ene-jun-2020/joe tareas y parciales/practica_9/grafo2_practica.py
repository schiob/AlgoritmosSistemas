grafo = []
with open("grafo.txt", "r") as file:
    n1, n2 = file.readline().split()
    n1 = int(n1)
    n2 = int(n2)

    for i in range(n1):
        grafo.append([])
    for _ in range(n2):
        nodo1, nodo2 = map(int, file.readline().split())
        grafo[nodo1].append(nodo2)
        grafo[nodo2].append(nodo1)
#------------------------------------------------------------
col = []
visited = [-1] * n1
saltos = [0] * n1

visited[0] = 0
col.insert(0, 0)
bus = []
cont = 0
while len(col) != 0:
    actual = col.pop()
    print("procesando el nodo:", actual)

    for w in grafo[actual]:
        print("____",w)
        if visited[w] == -1:
            print("entro ",w)
            visited[w] = 0
            col.insert(0, w)
            print(col)
            saltos[w] = saltos[actual] + 1
            print(saltos)

        
print(bus,":::::::::::::::::::::::::")
print()
print(grafo)
for i, val in enumerate(saltos):
    print("nodo", i, "está a", val, "saltos :)")


