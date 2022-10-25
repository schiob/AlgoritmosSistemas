package parcialDos;

import java.util.Scanner;

public class examenSegundoParcial {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de libros que hay en la repisa de mate y el nombre del libro que buscas");
        String datosEntrada = sc.nextLine();
        String datosEntradaSeparados[];
        datosEntradaSeparados = datosEntrada.split(" ");
        int numeroDeLibros = Integer.parseInt(datosEntradaSeparados[0]);
       String listaDeLibros[] = new String[numeroDeLibros] ;
        System.out.println("\nIngrese cada uno de los " + numeroDeLibros + " libros que estan en la repisa, con su nombre");
        for (int i = 0; i < numeroDeLibros; i++) {
           listaDeLibros[i] = sc.nextLine();
        }
        String buscando = datosEntradaSeparados[1];
        for (int j = 0; j < numeroDeLibros; j++) {
            if (listaDeLibros[j].equals(buscando)) {
                System.out.println("El libro esta en el indice " +j+ " del estante");                
            }
            
        }
        
    }
}



    