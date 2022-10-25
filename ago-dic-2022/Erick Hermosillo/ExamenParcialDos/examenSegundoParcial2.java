package parcialDos;

import java.util.Scanner;

public class examenSegundoParcial2 {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];


        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

       
            if (arr[j] < pivot) {


                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar las canciones que tiene y el numero de busquedas ");
        String datosEntrada = sc.nextLine();
        String datosEntradaSeparados[];
        datosEntradaSeparados = datosEntrada.split(" ");
        int numeroDeCanciones = Integer.parseInt(datosEntradaSeparados[0]);
        int numeroDeBusquedas = Integer.parseInt(datosEntradaSeparados[1]);
        String listaDeCanciones[] = new String[numeroDeCanciones];
        String listaDeBusquedas[] = new String[numeroDeBusquedas];

        System.out.println("\nIngrese cada uno de los " + numeroDeCanciones + " libros, con su titulo y numero de paginas separadas por un espacio\nEjemplo: hungerGames 290");
        String cancionesString = sc.nextLine();
        listaDeCanciones = cancionesString.split(" ");
        for (int i = 0; i < numeroDeBusquedas; i++) {
            listaDeBusquedas[i] = sc.nextLine();
        }
        for (int i = 0; i < numeroDeBusquedas; i++) {
            busquedaBinaria2(listaDeCanciones, 0, listaDeCanciones.length, listaDeBusquedas[i]);
        }
        
    }
//Me faltó acoplar el algoritmo y la busqueda :/
    
     
        
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

    }

