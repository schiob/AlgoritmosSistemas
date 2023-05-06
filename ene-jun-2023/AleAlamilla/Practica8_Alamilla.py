from queue import Queue

def bfs(graph, start, end):
    visited = [False] * len(graph)
    distance = [float('inf')] * len(graph)
    parent = [-1] * len(graph)
    q = Queue()

    visited[start] = True
    distance[start] = 0
    q.put(start)

    while not q.empty():
        current = q.get()
        for neighbor in graph[current]:
            if not visited[neighbor]:
                visited[neighbor] = True
                distance[neighbor] = distance[current] + 1
                parent[neighbor] = current
                q.put(neighbor)
            if neighbor == end:
                return parent, distance[end]

    return parent, -1

def main():
    n, e, z = map(int, input().split())


    graph = [[] for _ in range(n)]

    for _ in range(e):
        u, v = map(int, input().split())
        graph[u].append(v)
        graph[v].append(u)

    parent, distance = bfs(graph, 0, z)

    print("The path is: ")
    path = []
    current = z
    while current != -1:
        path.append(current)
        current = parent[current]
    path.reverse()

    print(' '.join(str(node) for node in path))

if __name__ == '__main__':
    main()
