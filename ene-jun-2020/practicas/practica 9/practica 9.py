def bfs(graph, node):
  visited = []
  queue = []
  queue2 = []

  visited.append(node)
  queue.append(node)

  #queue.append(s)
  #visited[s]=True
  while queue:
    s = queue.pop(0)
       #print(s, end= " ")
    for neighbour in s.conexiones:
      if neighbour not in visited:
        #aqui es donde veremos lo del camino
        print("voy a el nodo {} y vengo del nodo {}".format(neighbour.valor,  s.valor))
        print()
        visited.append(neighbour)
        queue.append(neighbour)

  print(visited)

 #for i in node[s].conexiones:
  #if visited [i]== false:
  #queue.append(i.valor)
  #visited[i.valor]=True

#clase grafo que contiene los nodos
class Graph:
  def __init__(self, n):
    self.nodos = []

    for i in range(n):
      self.nodos.append(Node(i))

  def addCon(self, first, second):
    self.nodos[first].conexiones.append(self.nodos[second])

#clase nodo
class Node:
  def __init__(self, valor):
    self.valor = valor
    self.conexiones = []

# primera entrada del N, E y Z
nez = input().split(" ")

#creación de nodos
grafo = Graph(int(nez[0]))

#conexion de nodos
for i in range(int(nez[1])):
  con = input().split(" ")

  grafo.addCon(int(con[0]), int(con[1]))


#comprobar las conexiones
#for i in range(len(grafo.nodos)):
  #for j in range(len(grafo.nodos[i].conexiones)):
    #print(str(grafo.nodos[i].valor) + " " + str(grafo.nodos#[i].conexiones[j].valor))

# el algoritmo bfs
bfs(grafo, grafo.nodos[0])
#bfs(visited,grafo,13)