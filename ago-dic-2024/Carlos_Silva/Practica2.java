import java.util.*;

public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*SE INGRESA LA CANTIDAD DE PROBLEMAS QUE RESOLVERA DAVID Y LOS MINUTOS QUE
        TIENE DISPONIBLES PARA ESTO*/

        System.out.println("Digite la cantidad de problemas y minutos disponibles: ");
        int acts = sc.nextInt();
        int[] arr = new int[acts];
        int mins = sc.nextInt();

        /*SE INGRESAN LOS MINUTOS QUE TOMARA HACER CADA PROBLEMA*/

        System.out.println("Ingrese los minutos de cada problema");
        for(int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        /*SE ORDENAN LOS NUMEROS DE MENOR A MAYOR*/

        for(int i = 1; i < arr.length; i++) {
            int auxiliar = arr[i];
            int j;
            for(j = i - 1; j >= 0 && arr[j] > auxiliar; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = auxiliar;
        }

        /*SE CALCULA CUANTOS PROBLEMAS PODRA HACER EN EL TIEMPO CONCEDIDO*/

        int suma = 0;
        int problemas_resueltos = 0;
        for(int i = 0; i<arr.length; i++) {
            if (suma + arr[i] <= mins) {
                    suma = suma + arr[i];
                    problemas_resueltos++;
            } else {
                break;
            }
        }

        /*SE INGRESA LA CANTIDAD DE PROBLEMAS QUE RESOLVERA DAVID Y LOS MINUTOS QUE
        TIENE DISPONIBLES PARA ESTO*/
        System.out.println("\tProblemas resueltos");
        if (suma <= mins) {
            System.out.println("\t\t" + problemas_resueltos);
        } else {
            System.out.println("\t\t" + 0);
        }

        System.out.println("\tMinutos ingresados\n" + "\t\t" + mins);
    }
}