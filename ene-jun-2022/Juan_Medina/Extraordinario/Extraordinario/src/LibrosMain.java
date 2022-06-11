package Extraordinario.src;

import java.util.Scanner;
public class LibrosMain {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Entrada de datos por consola
        int n = Integer.parseInt(sc.nextLine());
        Libros[] arrLibros = new Libros[n];
        
        for (int i = 0; i <n; i++) { //O(n)
            //nombre_Libro sera al que se le almacenen datos. 
            String nombre_libro = " ";
            //Iniciamos el contador de paginas en cero.
            int num_paginas = 0;
           //Funcion split para separar por espacios

            String [] line = sc.nextLine().split(" ");

            nombre_libro=line[0];

            num_paginas=Integer.parseInt(line[1]);
            
            arrLibros[i] = new Libros(nombre_libro,num_paginas);
        }
        //Llamamos el metodo Merge para que ordene nuestro arreglo.
        Merge(arrLibros);
        System.out.println("\n----- Los libros ordenados por páginas son: ----");
        //Generamos ciclo para mostrar los libros. 
        for (int i = 0; i < n; i++) { //O(n)
            System.out.print(arrLibros[i].getTitulo() + " ");
        }
    }

        //Aplicamos  metodo mergeSort para ordenar
        public static void Merge(Libros  arreglo[]){

        Libros [] x= new Libros[arreglo.length];

        mergesort(arreglo,x,0,arreglo.length - 1);
        }
    
        public static void mergesort(Libros[] a, Libros[] x, int izq, int der){
        if(izq<der){

            //Encontramos un punto medio para de ahí empezar a ordenar.

         int medio = (izq + der)/2;

            mergesort(a, x, izq, medio);
            mergesort(a , x, medio + 1, der);
            merge(a, x, izq, medio + 1, der);
          }
        }
        //Variables que recibira el metodo Merge 
        public static void merge(Libros[]a, Libros[]x, int izq, int der, int p){
        int h = der-1;  
        int j = izq;
        int w = izq;
//Aplicamos Recursión
            while(izq <= h && der <= p){
                //Creamos condición dentro del ciclo
              if(a[izq].getPages() < a[der].getPages()){
                  x[j++]=a[izq++];
                }
              else {
                  x[j++] = a[der++];
                }
            } 

            while(izq<=h){
              x[j++] = a[izq++];
            }
            while(der<=p){
              x[j++] = a[der++];
            }
            for ( j = w; j <= p; j++) {
              a[j]=x[j];
            }
    }
}    