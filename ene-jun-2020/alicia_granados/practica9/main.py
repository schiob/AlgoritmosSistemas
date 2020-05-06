# Nodos-Aristas-Destino.
entrada = '16 20 13'.split(' ')

# Destructuración.
cantidad_nodos = int(entrada[0])
cantidad_aristas = int(entrada[1])
nodo_destino = entrada[2]

# Esto me permitirá abrir un archivo y leerlo.
data = open("data.txt", "r")
lineas = data.readlines()

# Creación de una matríz booleana rellena con False.
x, y = cantidad_nodos, cantidad_nodos;
matrix = [[False for x in range(x)] for y in range(x)]

# Matriz booleana rellena con True tomando en cuenta los nodos y aristas del archivo data.txt
for i in range(0,cantidad_aristas):
    nodo_data = lineas[i].split()
    # Se hará el proceso 16 veces.
    matrix[int(nodo_data[0])][int(nodo_data[1])] = True

# Creo un diccionario que se convertirá en una lista de adyacencia.
lista_adyacencia = {}

# Transformo la matríz en una lista de adyacencia.
for i in range(0, cantidad_nodos):
    empty = []
    for j in range(0, cantidad_nodos):
        if matrix[i][j] == True:
            empty.append(j)
    lista_adyacencia.update({i: empty})

# Emojis de ballenas docker para agradecer su existencia aunque no se vean 🐋🐳🐋🐳🐋🐳🐳 🐋 👽 :)!!!!!

# Función para encontrar la ruta más óptima.
def bfs_shortest_path(lista_adyacente, inicio, meta):
    # Tracking de los nodos visitados.
    explorado = []
    # Tracking de las rutas visitadas.
    cola = [[inicio]]
    # Mejor de los casos cuando el inicio es el mismo que la meta.
    if inicio == meta:
        return "El inicio es el mismo que la meta"
 
    # Loop para iterar en cada una de las rutas posibles.
    while cola:
        # Se saca la primera ruta de la cola.
        path = cola.pop(0)
        # Se obtiene el último nodo de la ruta.
        node = path[-1]
        # Si el nodo no está en el arreglo explorado.
        if node not in explorado:
            vecinos = lista_adyacente[node]
            # Va a través de todos los nodos, construye una nueva ruta y la empuja dentro de la cola.
            for vecino in vecinos:
                nueva_ruta = list(path)
                nueva_ruta.append(vecino)
                cola.append(nueva_ruta)
                # Regresa la ruta si el vecino es la meta.
                if vecino == meta:
                    return nueva_ruta
 
            # Marca el nodo como explorado al guardarlo dentro del arreglo de explorados.
            explorado.append(node)
 
    # Caso cuando no hay conexión entre dos nodos.
    return "Esa ruta no existe... emojis tristes :("
 
# Imprimo la ruta más óptima.
print(bfs_shortest_path(lista_adyacencia, 0, 13))