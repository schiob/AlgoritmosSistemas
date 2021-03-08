N, E = list(map(int, input().split()))

adj_list = [list() for x in range(N)]

for x in range(E):
    n1, n2 = list(map(int, input().split()))
    adj_list[n1].append(n2)
    adj_list[n2].append(n1)

print(adj_list)


def BFS(grafo, inicio):
    queue = []
    visited = [False] * len(grafo)
    pasos = [0] * len(grafo)

    visited[inicio] = True
    queue.append(inicio)
    while len(queue) > 0:
        actual = queue.pop(0)
        # print(actual)
        for vecino in grafo[actual]:
            if visited[vecino]:
                continue
            else:
                visited[vecino] = True
                queue.append(vecino)
                pasos[vecino] = pasos[actual] + 1

    # print(pasos)
    # print(list(range(len(grafo))))

BFS(adj_list, 0)



print("-------DFS-------")
visited = [False] * len(adj_list)
def DFS(grafo, actual):
    print("estoy en", actual)
    for vecino in grafo[actual]:
        if not visited[vecino]:
            visited[vecino] = True
            DFS(grafo, vecino)

visited[0] = True
DFS(adj_list, 0)