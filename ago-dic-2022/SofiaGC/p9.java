import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos corrales hay, cuántos caminos hay y en qué corral está Betsy?");
        String entrada = teclado.nextLine();
        String[] s = entrada.split(" ");
        int corrales = Integer.parseInt(s[0]);
        int caminos = Integer.parseInt(s[1]);
        int betsy = Integer.parseInt(s[2]);
    
        //System.out.println(corrales + " " + caminos + " " + betsy);

        int arr[][] = new int[corrales][corrales];

        System.out.println("Ingresar los caminos ");
        //Llena la matriz de adyacencia
        for (int a = 0; a < caminos; a++) {
            String camino = teclado.nextLine();
           
            String conexiones[] = camino.split(" ");
            int n1 = Integer.parseInt(conexiones[0]);
            int n2 = Integer.parseInt(conexiones[1]);

            arr[n1][n2] = 1;
            arr[n2][n1] = 1;
        }
        //Imprime la matriz de adyacencia
        for (int b = 0; b < corrales; b++) {
            for (int c = 0; c < corrales; c++) {
                System.out.print(arr[b][c] + " ");
            }
            System.out.println();
        }
        int visitado[] = new int[corrales];
        int padres[][] = new int[corrales][corrales];
        //bfs(arr, 0);
        dfs(arr, betsy, visitado, 0);
    }
    public static boolean dfs(int[][] arr, int actual, int[]visitado, int padres){
        //System.out.println("visitando el nodo " + actual);
        visitado[actual] = 1;
        if (actual == padres) {
            System.out.println(actual);
            return true;
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[actual][j] == 1){
                if(visitado[j] == 0){
                    padres[j] = actual;
                    dfs(arr, j, visitado, padres)
                    System.out.println(actual);
                    return true;
                }
            }
        }
        return false;
    }

   /*public static void bfs(int[][] arr, int inicio, ){
        int visitados[] = new int[arr.length];
        int cola[] = new int[0];

        visitados[inicio] = 1;
        cola = addToQueue(cola, inicio);

        while(cola.length != 0){
            int actual = cola[0];
            cola = deQueue(cola);

            System.out.println("visitando " + actual);
            for(int j = 0; j < arr.length; j++){
                if(arr[actual][j] == 1){
                    if(visitados[j] == 0){
                        visitados[j] == 1;
                        cola = addToQueue(cola, 1);
                        bfs (arr, j)
                    }
                }
            }
        }
    }*/
}
