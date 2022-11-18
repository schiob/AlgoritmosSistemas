
package parcialDos;

import java.util.Scanner;


public class practicaNueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de corrales, numero de conexiones y el corral en el que se encuentra Betsy. Ejemplo: 5 7 2");
        String datosEntrada = sc.nextLine();
        String datosEntradaSeparados[];
        datosEntradaSeparados = datosEntrada.split(" ");
        int corrales = Integer.parseInt(datosEntradaSeparados[0]);
        int conexiones = Integer.parseInt(datosEntradaSeparados[1]);
        int nConexiones = conexiones;
        int posicionBetsy = Integer.parseInt(datosEntradaSeparados[2]);       
        int matriz[][] = new int [corrales][corrales];
        int nBetsy = posicionBetsy;
         System.out.println("Ingrese las conexiones. Ejemplo: 2 3\n ");
        for (int i = 0; i < conexiones; i++) {
        System.out.println(nConexiones-- +" conexiones restantes");
        String datosConexiones = sc.nextLine();
        String datosConexionesSeparados[];
        datosConexionesSeparados = datosConexiones.split(" ");
        int a = Integer.parseInt(datosConexionesSeparados[0]);
        int b = Integer.parseInt(datosConexionesSeparados[1]);
        matriz [a][b] = 1;
        matriz [b][a] = 1;
        }
    
         int visitado[] = new int[corrales];
        dfs(matriz, nBetsy, visitado, 0);
                  
    }
      public static boolean dfs(int[][] grafo, int actual, int[]visitado, int obj) {
        visitado[actual] = 1;
        if (actual == obj) {
            System.out.println(actual);
            return true;
        }
        for (int i = 0; i < grafo.length; i++) {
            if (grafo[actual][i] == 1) {
                if (visitado[i] == 0) {
                    if (dfs(grafo, i, visitado, obj)) {
                        System.out.println(actual);
                        return true;
                    }
                    
                }
                
            }
        }
     return false;   
    }
}