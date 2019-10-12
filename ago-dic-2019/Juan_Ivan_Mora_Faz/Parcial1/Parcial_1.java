import java.util.Scanner;

public class Parcial_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        
        int numero_de_peliculas = 0;
        String nombre_peliculas = "";
        int horas_peliculas = 0;
        int minutos_peliculas = 0;
    
        // Numero de peliculas
        System.out.println(); // PRINT PARA EL NUMERO DE PELICULAS
        numero_de_peliculas = s.nextInt();
        int [] num = new int [numero_de_peliculas];
        
        //Darle nombre a cada pelicula
         System.out.println(); //PRINT PARA EL NOMBRE DE LA PELICULA
         //Darle la duracion
         System.out.println(); //PRINT PARA LA DURACION EN HORAS Y MINUTOS 
         //                      DE CADA PELICULA
         
         for (int i = 0; i < num.length; i++) 
        {
            nombre_peliculas = s.nextLine();
            num [i] = numero_de_peliculas; 
            int [][] duracion = new int [horas_peliculas][minutos_peliculas];
        }    
    }
}

// IMPLEMENTACION

public class IMPLEMENTACION {

    
    public static void main(String[] args) {

        AlgoritmoMerge mergeSort = new AlgoritmoMerge();
        int arr [] [] = {};
        int n = arr.length;

        System.out.println("");
        for (int value : arr) {
            System.out.print(value + "");
        }

        System.out.println();

        System.out.println("");
        mergeSort.mergeSort(arr,0,n-1);
        mergeSort.printArray(arr);
    }
}