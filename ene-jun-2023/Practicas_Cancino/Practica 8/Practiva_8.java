package U2;

/**
 *
 * @author Cancino
 */
import java.util.*;

public class Practiva_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int e = sc.nextInt();
        int z = sc.nextInt();

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[0] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adjList.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    queue.offer(v);
                }
            }
        }
        List<Integer> path = new ArrayList<>();
        path.add(z);
        while (path.get(path.size() - 1) != 0) {
            int u = path.get(path.size() - 1);
            for (int v : adjList.get(u)) {
                if (dist[v] == dist[u] - 1) {
                    path.add(v);
                    break;
                }
            }
        }
        Collections.reverse(path);
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
            if (i != path.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
