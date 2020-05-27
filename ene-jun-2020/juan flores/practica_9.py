def camino_grafo(g, start, end, path =[]): 
        path = path + [start] 
        if start == end: 
            return path 
        corto = None
        for nodo in g[start]: 
            if nodo not in path: 
                camino = camino_grafo(g, nodo, end, path) 
                if camino: 
                    if not corto or len(camino) < len(corto): 
                        corto = camino
        return corto

def arista(grafo,a,b):
    grafo[a].append(b)

s = list(map(int,input().split()))
grafo = []

for i in range(s[1]):
    l = list(map(int,input().split()))
    while len(grafo)<=l[0] or len(grafo)<=l[1]:
        grafo.append([])
    arista(grafo,l[0],l[1])
    arista(grafo,l[1],l[0])

camino_corto = ' '.join(str(e) for e in camino_grafo(grafo,0,s[2]))
print(camino_corto)