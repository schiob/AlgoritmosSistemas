//PRIMER EXAMEN PARCIAL | ALGORITMOS DE ORDENAMIENTO Y BUSQUEDA
//MERCEDES A MENDOZA 

package Parcial1.Examenparcial;

import java.util.Scanner;


class Pelicula {
    private String nombre;
    private int duracion; 

    public Pelicula(String nombre, int horas, int minutos) {
        this.nombre = nombre;
        this.duracion = horas * 60 + minutos; // convierte horas a minutos y obtiene total de minutos
    }

    
    //getters nos devuelve el dato
    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }


    
    public int compareTo(Pelicula otra) {
        return Integer.compare(this.duracion, otra.duracion);
    }
}


public class OrdenarPeliculasMergeSort {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Ingresa num de peliculas:");
        int n = s.nextInt();
        s.nextLine(); 
        Pelicula[] peliculas = new Pelicula[n];

        System.out.println("Ingresa nombre y duracion de la pelicula en hr y min separado x espacio:");
        for (int i = 0; i < n; i++) {
           
            String[] pelis = s.nextLine().split(" ");
            String nombre = pelis[0];
            int horas = Integer.parseInt(pelis[1]);
            int minutos = Integer.parseInt(pelis[2]);
           
            peliculas[i] = new Pelicula(nombre, horas, minutos);
        }


        mergeSort(peliculas, 0, n - 1);

            //imprime la lista ordenada dd peliculas
        for (int i = 0; i < n; i++) {
            System.out.print(peliculas[i].getNombre() + " ");
        }

   
    }

    public static void mergeSort(Pelicula[] array, int izq, int der) {
        if (izq < der) {
            int mitad = (izq + der) / 2;

            mergeSort(array, izq, mitad);
            mergeSort(array, mitad + 1, der);
            Ordenar(array, izq, mitad, der);
        }
    }

    public static void Ordenar(Pelicula[] array, int izq, int mitad, int der) {
      
        int n1 = mitad - izq + 1;
        int n2 = der - mitad;

        Pelicula[] izqArray = new Pelicula[n1];
        Pelicula[] derArray = new Pelicula[n2];//creamos 2 arreglos para dividir los datos a la mitad


        //copia en arrays temporales
        for (int i = 0; i < n1; i++) {
            izqArray[i] = array[izq + i];
                        }
        for (int j = 0; j < n2; j++) {
            derArray[j] = array[mitad + 1 + j];
                    }

                    

            //combina las mitades
        int i = 0, j = 0;
        int ms = izq;

        while (i < n1 && j < n2) {
            if (izqArray[i].compareTo(derArray[j]) <= 0) {
                array[ms] = izqArray[i];
                i++;
            } 
            else 
            {
                array[ms] = derArray[j];
                j++;
            }
            ms++;
        }

        // copia los eelemento restantes de ambos arrays (izq,derecha)
        while (i < n1) {
            array[ms] = izqArray[i];
            i++;
            ms++;
        }
         
        while (j < n2) 
         {
            array[ms] = derArray[j];
            j++;
            ms++;
     }
 }
}

