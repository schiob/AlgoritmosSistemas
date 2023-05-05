from collections import deque

# entrada de datos 
n, m, z = map(int, input().split())

# lista de adyacencia
adj = [[] for _ in range(n)]
for _ in range(m):
    a, b = map(int, input().split())
    adj[a].append(b)
    adj[b].append(a)

# Algoritmo BFS
visited = [False] * n
distance = [0] * n
parent = [None] * n
queue = deque([0])
visited[0] = True
while queue:
    node = queue.popleft()
    for neighbor in adj[node]:
        if not visited[neighbor]:
            visited[neighbor] = True
            distance[neighbor] = distance[node] + 1
            parent[neighbor] = node
            queue.append(neighbor)

# camino más corto
path = [z]
while path[-1] != 0:
    path.append(parent[path[-1]])
path.reverse()


print(' '.join(map(str, path)))
