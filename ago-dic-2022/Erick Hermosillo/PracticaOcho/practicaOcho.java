
package parcialDos;

import java.util.Scanner;


public class practicaOcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas, numero de conexiones y numero de positivos. Ejemplo: 20 3 2");
        String datosEntrada = sc.nextLine();
        String datosEntradaSeparados[];
        datosEntradaSeparados = datosEntrada.split(" ");
        int personas = Integer.parseInt(datosEntradaSeparados[0]);
        int conexiones = Integer.parseInt(datosEntradaSeparados[1]);
        int nConexiones = conexiones;
        int positivos = Integer.parseInt(datosEntradaSeparados[2]);       
        int matriz[][] = new int [personas][personas];
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
    
  System.out.println("Ingrese las personas que dieron positivo. Ejemplo: 2 3 6");
        String datosPositivos = sc.nextLine();
        String datosPositivosSeparados[];
        datosPositivosSeparados = datosPositivos.split(" ");
        int datosPositivosInt[] = new int [positivos];
         for (int k = 0; k < positivos; k++) {
        datosPositivosInt[k] = Integer.valueOf(datosPositivosSeparados[k]);//En este ciclo establezo que el arreglo de puntosDeCombate de tipo int va a recoger los valores del arreglo puntosDeCombateString convirtiendolos de String a int        
        }     
        int personasInfectadas[] = new int [personas];
        
        for (int i = 0; i < positivos; i++) {
            for (int j = 0; j < personas; j++) {
                if (matriz[datosPositivosInt[i]][j] == 1) {
                    personasInfectadas[j] = 1;
                }
            }
        }

        for (int i = 0; i < personas; i++) {
            if (personasInfectadas[i]==1) {
                System.out.printf("%d ", i);    
            }

        }
    }
}
