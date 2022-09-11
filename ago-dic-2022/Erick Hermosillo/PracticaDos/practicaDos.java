
package parcialUno;

import java.util.Scanner;


public class practicaDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de tareas y minutos disponibles para realizarlas\nEjemplo: 5 120");
        String numeros = sc.nextLine();
        String[] tareasYMinutos = numeros.split(" ");
        int minutosMaximos = Integer.valueOf(tareasYMinutos[1]);
        int numeroDeTareas = Integer.valueOf(tareasYMinutos[0]);
        int tareasPosibles = 0;
        int minutosDeLasTareas[] = new int [numeroDeTareas];
        int sumaDeMinutos = 0;
        System.out.println("\nIngrese la duracion de las " + numeroDeTareas+ " tareas\nEjemplo: 10 20 30 40 ");
        String minutosDe = sc.nextLine();
        String[] minutosDeLasTareasString = minutosDe.split(" ");
        for (int k = 0; k < numeroDeTareas; k++) {
        minutosDeLasTareas [k] = Integer.valueOf(minutosDeLasTareasString[k]);            
        }
                  System.out.println("\n Los minutos de cada tarea son:");
      for(int elem:minutosDeLasTareas){

            System.out.printf("%d ", elem);    
        }       
       for (int i = 0; i < minutosDeLasTareas.length; i++) {
            int key = minutosDeLasTareas[i];
            int j = i-1;
            while ((j > -1) && minutosDeLasTareas [j] > key) {
                minutosDeLasTareas [j+1] = minutosDeLasTareas [j];
                j--;
            }
            minutosDeLasTareas [j+1] = key;
            
        }
//        System.out.println("\nLas tareas ordenadas de menor duracion a mayor duracion: ");
//        for(int elem:minutosDeLasTareas){
//
//            System.out.printf("%d ", elem);    
//        }
        if (sumaDeMinutos < minutosMaximos) {
            for (int i = 0; i < minutosDeLasTareas.length; i++) {
                sumaDeMinutos += minutosDeLasTareas[i];
                if (sumaDeMinutos < minutosMaximos) {
                  tareasPosibles++;  
                }
                            
            }
        }
        System.out.println("\nEl maximo numero de tareas posibles a realizar son: "+tareasPosibles);
    }
}
