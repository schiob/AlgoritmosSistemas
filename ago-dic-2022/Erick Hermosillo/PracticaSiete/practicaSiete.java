
package parcialDos;

import java.util.Scanner;

public class practicaSiete {
     public void ordenarQuickSort(String[] array)
    {
        array = quicksort1(array);
    } 
    public String [] quicksort1 (String numeros[]){
        return quicksort2(numeros, 0, numeros.length-1);
    }
    public String[] quicksort2(String numeros[], int izq, int der){
        //a[indicea].compareTo(b[indiceb]
        if (izq >= der) {       
            return numeros;      
        }
        int i=izq;
        int d= der;
        if (izq!=der) {
            int pivote;
            String aux;
            pivote = izq;
            while(izq!=der){
                //a[indicea].compareTo(b[indiceb]
//                while(numeros[der]>=numeros[pivote] && izq<der){
                while(numeros[der].compareTo(numeros[pivote]) >= 0 && izq < der){
                    der--;
                }
//                while(numeros[izq]<numeros[pivote] && izq<der){
                while(numeros[izq].compareTo(numeros[der]) < 0 && izq<der){
                    izq--;
                }
                if (der!=izq) {
                    aux = numeros[der];
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;  
                }
                if (izq==der) {
                    quicksort2(numeros, i, izq-1);
                    quicksort2(numeros, izq+1, d);   
                }
            }
            
        }
        else{
        return numeros;
                    }
        return numeros;
    }
        public static int busquedaBinaria2(String arr[], int inicio, int fin, String buscando){
            if (inicio > fin) {
                return -1;
                
            }
    int mitad = (inicio+fin)/2;
            if (arr[mitad].equals(buscando)) {

                return mitad;      
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
        System.out.println("Ingrese el numero de videojuegos y la cantidad a busquedas que va a realizar");
        String datosEntrada = sc.nextLine();
        String datosEntradaSeparados[];
        datosEntradaSeparados = datosEntrada.split(" ");
        int numeroDeVideojuegos = Integer.parseInt(datosEntradaSeparados[0]);
        int numeroDeBusquedas = Integer.parseInt(datosEntradaSeparados[1]);
        String listaDeVideojuegos[] = new String[numeroDeVideojuegos];
        String listaDeBusquedas[] = new String[numeroDeBusquedas];
        System.out.println("\nIngrese cada uno de los " + numeroDeVideojuegos + " videojuegos separados por un espacio, ejemplo: CS:GO Minecraft RocketLeague");
        String videojuegos = sc.nextLine();
        listaDeVideojuegos = videojuegos.split(" ");
        System.out.println("Ingrese los titulos que desea saber en que lugar se encuentran");
         for (int i = 0; i < numeroDeBusquedas; i++) {
            listaDeBusquedas[i] = sc.nextLine();
        }
         

        

        practicaSiete qs = new practicaSiete();
        qs.ordenarQuickSort(listaDeVideojuegos);
        System.out.println("Lista de videojuegos ordenada:\n");
        for (int i = 0; i < listaDeVideojuegos.length; i++) {
            System.out.println(listaDeVideojuegos[i]);
        }
        System.out.println("\n");
                 for (int i = 0; i < numeroDeBusquedas; i++) {
                     System.out.println(busquedaBinaria2(listaDeVideojuegos, 0, listaDeVideojuegos.length, listaDeBusquedas[i]));
        }
        
        
    }
}
