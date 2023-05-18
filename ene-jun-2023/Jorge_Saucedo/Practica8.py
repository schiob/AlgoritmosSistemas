from collections import deque

def encontrar_camino_mas_corto(grafo, inicio, destino):
    # Realizar la búsqueda en anchura
    visitados = [False] * len(grafo)
    padres = [-1] * len(grafo)
    cola = deque()
    cola.append(inicio)
    visitados[inicio] = True
    
    while cola:
        nodo_actual = cola.popleft()
        if nodo_actual == destino:
            break
        
        for vecino in grafo[nodo_actual]:
            if not visitados[vecino]:
                visitados[vecino] = True
                cola.append(vecino)
                padres[vecino] = nodo_actual
    
    # Reconstruir el camino más corto
    camino = []
    nodo = destino
    while nodo != -1:
        camino.append(nodo)
        nodo = padres[nodo]
    
    camino.reverse()
    return camino

# Lectura de la entrada
N, E, Z = map(int, input().split())
grafo = [[] for _ in range(N)]

for _ in range(E):
    u, v = map(int, input().split())
    grafo[u].append(v)
    grafo[v].append(u)

# Encontrar el camino más corto
camino_mas_corto = encontrar_camino_mas_corto(grafo, 0, Z)

# Imprimir el resultado
print(' '.join(map(str, camino_mas_corto)))
