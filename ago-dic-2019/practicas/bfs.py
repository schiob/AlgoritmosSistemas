def bfs(graph, n):
	n_actual = 0
	visitado = [False] * n
	queue =[]
	dist = [0]*n

	visitado[n_actual] = True
	queue.append(n_actual)
	#Por cada uno de los adyacentes
	while len(queue) !=0:
		n_actual = queue.pop(0)
	#Si no visitado, marcar y agregar a cola
		for adj in graph[n_actual]:
			if visitado[adj] == False:
				visitado[adj] = True
				queue.append(adj)
				dist[adj] = dist[n_actual]+1
				print("Marcado como visitado", adj)

	print(row)
	print(dist)

def(graph, visitado, actual):
	visitado[actual] = True:
	print()
	for adj in graph[actual]:
		if visitado[adj] == False:
			dfs(graph, visitado, adj)
	
if __name__ == '__main__':

n, e =list(map(int, input().split()))

adj_list =[]
for _ in range(n):
	adjlist.append([])
for _ in range (e):
	nodo_a, nodo_b= list(map(int, input().split()))
	adj_list[nodo_a].append(nodo_b)
	adj_list[nodo_b].append(nodo_a)

for row in adj_list:
	print(row)
	
bfs(adj_lista,n)
