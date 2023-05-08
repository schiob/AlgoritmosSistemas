N, E, Z = map(int, input().split())

graph = [[] for _ in range(N)]
for _ in range(E):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

queue = [0]  # primer nodo/empezar en el nodo 0
visited = [False] * N
visited[0] = True
prev = [-1] * N  # nodo anterior

# bfs
while queue:
    node = queue.pop(0)
    if node == Z:
        break
    for neighbor in graph[node]:
        if not visited[neighbor]:
            visited[neighbor] = True
            prev[neighbor] = node
            queue.append(neighbor)

path = [Z]
while path[-1] != 0:
    path.append(prev[path[-1]])
path.reverse()

print(*path)
