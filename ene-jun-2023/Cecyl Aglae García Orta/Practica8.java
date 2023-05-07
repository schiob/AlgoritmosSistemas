package Parcial2;
import java.util.*;

/*@author cecyl*/
public class Practica8 {

    public static List<Integer> bfs(List<List<Integer>> graph, int inicio, int obj) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> Vis = new HashSet<>();
        Map<Integer, Integer> parent = new HashMap<>();
        queue.add(inicio);
        Vis.add(inicio);
        while (!queue.isEmpty()) {
            int nodo = queue.poll();
            if (nodo == obj) {
                List<Integer> path = new ArrayList<>();
                while (nodo != inicio) {
                    path.add(nodo);
                    nodo = parent.get(nodo);
                }
                path.add(inicio);
                Collections.reverse(path);
                return path;
            }
            for (int neighbor : graph.get(nodo)) {
                if (!Vis.contains(neighbor)) {
                    queue.add(neighbor);
                    Vis.add(neighbor);
                    parent.put(neighbor, nodo);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el número de personas, número de conexiones entre 2 personas y numero identificador de Juan:");
        int N = scanner.nextInt();
        int E = scanner.nextInt();
        int Z = scanner.nextInt();
        System.out.println("Escribe las conexiones dependiendo de los datos que diste:");
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        List<Integer> path = bfs(graph, 0, Z);

        System.out.println("El camino es: ");
        if (path != null) {
            for (int nodo : path) {
                System.out.print(nodo + " ");
            }
        } else {
            System.out.println("No existe un camino para que María llegue al amor :(");
        }
    }
}
