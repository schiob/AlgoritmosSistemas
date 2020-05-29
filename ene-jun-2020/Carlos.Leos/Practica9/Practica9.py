Nodos-Aristas-Destino.
entrada = '16 20 13'.split(' ')

cantidad_nodos = int(entrada[0])
cantidad_aristas = int(entrada[1])
nodo_destino = entrada[2]

data = open("data.txt", "r")
lineas = data.readlines()

x, y = cantidad_nodos, cantidad_nodos;
matrix = [[False for x in range(x)] for y in range(x)]

for i in range(0,cantidad_aristas):
    nodo_data = lineas[i].split()
    matrix[int(nodo_data[0])][int(nodo_data[1])] = True

lista_adyacencia = {}

for i in range(0, cantidad_nodos):
    empty = []
    for j in range(0, cantidad_nodos):
        if matrix[i][j] == True:
            empty.append(j)
    lista_adyacencia.update({i: empty})

def bfs_shortest_path(lista_adyacente, inicio, meta):
    explorado = []
    cola = [[inicio]]
    if inicio == meta:
        return "El inicio es el mismo que la meta"

    while cola:
        path = cola.pop(0)
        node = path[-1]
        if node not in explorado:
            vecinos = lista_adyacente[node]
            for vecino in vecinos:
                nueva_ruta = list(path)
                nueva_ruta.append(vecino)
                cola.append(nueva_ruta)
                if vecino == meta:
                    return nueva_ruta

            explorado.append(node)

    return "Esa ruta no existe... emojis tristes :("

print(bfs_shortest_path(lista_adyacencia, 0, 13))