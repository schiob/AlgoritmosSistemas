from collections import deque, namedtuple

inf = float('inf')
Edge = namedtuple('Edge', 'start, end, cost')

def make_edge(start, end, cost=1):
  return Edge(start, end, cost)

class Graph:
    def __init__(self, edges):
        wrong_edges = [i for i in edges if len(i) not in [2, 3]]
        if wrong_edges:
            raise ValueError('Wrong edges data: {}'.format(wrong_edges))
        self.edges = [make_edge(*edge) for edge in edges]

    @property
    def vertices(self):
        return set(sum(([edge.start, edge.end] for edge in self.edges), []))

    def get_node_pairs(self, n1, n2, both_ends=True):
        if both_ends:
            node_pairs = [[n1, n2], [n2, n1]]
        else:
            node_pairs = [[n1, n2]]
        return node_pairs

    def add_edge(self, n1, n2, cost=1, both_ends=True):
        node_pairs = self.get_node_pairs(n1, n2, both_ends)
        for edge in self.edges:
            if [edge.start, edge.end] in node_pairs:
                return ValueError('Edge {} {} already exists'.format(n1, n2))

        self.edges.append(Edge(start=n1, end=n2, cost=cost))
        if both_ends:
            self.edges.append(Edge(start=n2, end=n1, cost=cost))

    @property
    def pairs(self):
        pairs = {vertex: set() for vertex in self.vertices}
        for edge in self.edges:
            pairs[edge.start].add((edge.end, edge.cost))

        return pairs

    def dijkstra(self, source, dest):
        assert source in self.vertices, 'Source node doesn\'t exist'
        dist = {vertex: inf for vertex in self.vertices}
        p_vert = {vertex: None for vertex in self.vertices}
        dist[source] = 0
        vertices = self.vertices.copy()

        while vertices:
            c_vert = min(vertices, key=lambda vertex: dist[vertex])
            vertices.remove(c_vert)
            if dist[c_vert] == inf:
                break
            for pair, cost in self.pairs[c_vert]:
                alt_route = dist[c_vert] + cost
                if alt_route < dist[pair]:
                    dist[pair] = alt_route
                    p_vert[pair] = c_vert

        path, c_vert = deque(), dest
        while p_vert[c_vert] is not None:
            path.appendleft(c_vert)
            c_vert = p_vert[c_vert]
        if path:
            path.appendleft(c_vert)
        return path
    
    def calc_cost(self, path, t_cost=0):
        arr = list(path)
        for i in range(1,len(path)):
            for pair, cost in self.pairs[path[i-1]]:
                if pair in arr:
                    arr.remove(path[i-1])
                    t_cost+=cost
        return t_cost

s = list(map(int,input().split()))
graph = Graph([])

for i in range(s[1]):
    l = list(map(int,input().split()))
    graph.add_edge(l[0],l[1],l[2])

way = graph.dijkstra(s[2],s[3])
print(' '.join(str(e) for e in way),'Total:',graph.calc_cost(way))