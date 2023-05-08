from collections import deque

def shortest_path(graph, start, end):
    # Inicializar cola para el BFS
    queue = deque()
    # Agregar el nodo inicial a la cola y marcarlo como visitado
    queue.append(start)
    visited = set()
    visited.add(start)
    # Diccionario para guardar el camino recorrido
    path = {}
    path[start] = None

    # BFS
    while queue:
        current_node = queue.popleft()
        # Si encontramos el nodo final, reconstruir el camino y retornarlo
        if current_node == end:
            path_list = []
            while current_node is not None:
                path_list.append(current_node)
                current_node = path[current_node]
            return path_list[::-1] # devolver la lista en orden correcto
        # Si no, agregar todos los vecinos no visitados a la cola
        for neighbor in graph[current_node]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)
                path[neighbor] = current_node
    # Si llegamos aquí, no se encontró un camino
    return []

# Lectura de la entrada
n, e, z = map(int, input().split())
# Inicializar grafo como un diccionario
graph = {i: set() for i in range(n)}
# Leer conexiones
for _ in range(e):
    u, v = map(int, input().split())
    graph[u].add(v)
    graph[v].add(u)

# Encontrar el camino más corto de María a Juan
path = shortest_path(graph, 0, z)

# Imprimir el camino encontrado
if path:
    print(" -> ".join(str(node) for node in path))
else:
    print("No se encontró un camino de María a Juan.")
