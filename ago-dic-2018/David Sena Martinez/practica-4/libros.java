
package algoritmos;

import java.util.Scanner;
public class libros {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        Libro[] LL=new Libro[n];
    
        for (int i = 0; i <n; i++) {
            String nombre_libro="";
            int num_paginas=0;
            String [] line=sc.nextLine().split(" ");
            nombre_libro=line[0];
            num_paginas=Integer.parseInt(line[1]);
            
            LL[i]=new Libro(nombre_libro,num_paginas);
        }
        Ordena(LL);
        for (int i = 0; i < n; i++) {
            System.out.println(LL[i].getNombre_libro()+"\t");
        }
    }

        public static void Ordena(Libro  arreglo[]){
        Libro [] x= new Libro[arreglo.length];
        mergesort(arreglo,x,0,arreglo.length-1);
        }
    
        public static void mergesort(Libro[] a, Libro[] x, int izq, int der){
        if(izq<der){
         int centro=(izq+der)/2;
            mergesort(a,x,izq,centro);
            mergesort(a,x,centro+1,der);
            merge(a,x,izq,centro+1,der);
          }
        }
        public static void merge(Libro[]a,Libro[]x,int izq, int der, int p){
        int h=der-1;
        int j=izq;
        int w=izq;

            while(izq<=h && der<=p){
              if(a[izq].getNum_paginas()< a[der].getNum_paginas()){
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
    

