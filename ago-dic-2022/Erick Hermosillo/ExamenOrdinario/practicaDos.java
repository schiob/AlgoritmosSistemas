
package ordinario;

import java.util.Scanner;

public class practicaDos {
     
        public static int busquedaBinaria2(String arr[], int inicio, int fin, String buscando){
            if (inicio > fin) {
                return -1;
                
            }
    int mitad = (inicio+fin)/2;
            if (arr[mitad].equals(buscando)) {

                return mitad + 1;      
        }
            //a[indicea].compareTo(b[indiceb]) < 0
        if (arr[mitad].compareTo(buscando) < 0) {
            return busquedaBinaria2(arr, mitad+1, fin, buscando);
        }
        else{
            return busquedaBinaria2(arr, inicio, mitad-1, buscando);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de regalos y el regalo que busca panchito");
        String datosEntrada = sc.nextLine();
        String datosEntradaSeparados[];
        datosEntradaSeparados = datosEntrada.split(" ");
        int numeroDeRegalos = Integer.parseInt(datosEntradaSeparados[0]);
        String regaloBuscado = datosEntradaSeparados[1];
        String listaDeRegalos[] = new String[numeroDeRegalos];
        String listaDeRegalosSinPrecio[] = new String[numeroDeRegalos];

System.out.println("\nIngrese cada uno de los " + numeroDeRegalos + " regalos, con su nombre y su precio separado por un espacio \nEjemplo: unosTakis 15");
        for (int i = 0; i < numeroDeRegalos; i++) {
            listaDeRegalos[i] = sc.nextLine();
        }
        for (int i = 0; i < listaDeRegalos.length; i++) {
            listaDeRegalosSinPrecio[i] = listaDeRegalos[i].split(" ")[0];
        }
       
        
   

        System.out.println(busquedaBinaria2(listaDeRegalosSinPrecio, 0, listaDeRegalos.length, regaloBuscado));

        
        
    }
}
