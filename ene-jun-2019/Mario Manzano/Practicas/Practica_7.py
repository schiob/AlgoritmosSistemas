def n_edge(g,a,b):
    g[a].append(b)

def g_path(g, start, end, path =[]): 
        path = path + [start] 
        if start == end: 
            return path 
        shrt = None
        for node in g[start]: 
            if node not in path: 
                newpath = g_path(g, node, end, path) 
                if newpath: 
                    if not shrt or len(newpath) < len(shrt): 
                        shrt = newpath
        return shrt

s = list(map(int,input().split()))
graph = []

for i in range(s[1]):
    l = list(map(int,input().split()))
    while len(graph)<=l[0] or len(graph)<=l[1]:
        graph.append([])
    n_edge(graph,l[0],l[1])
    n_edge(graph,l[1],l[0])

pth = ' '.join(str(e) for e in g_path(graph,0,s[2]))
print(pth)