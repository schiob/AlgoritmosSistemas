
package algoritmos;

import java.util.Scanner;

public class prueba {
public static void Ordena(Libro arreglo[]){
    Libro [] x = new Libro[arreglo.length]; 
    mergeSort(arreglo, x, 0, arreglo.length-1);
}
    
private static void mergeSort(Libro[] a, Libro[] x,int izq, int der){
    if(izq < der){
        int centro = (izq + der)/2;
        mergeSort(a, x, izq, centro);
        mergeSort(a, x, centro+1, der);
        merge(a, x, izq, centro+1, der);
    }
}
private static void merge(Libro [] a, Libro [] x, int izq, int der, int p){
    int h = der-1;
    int j = izq;
    int w = izq;
  
    while(izq <= h && der <= p){
         if(a[izq].getPages() < a[der].getPages()){
               x[j++] = a[izq++];
         }else{
               x[j++] = a[der++];
         }
    }
    while(izq <= h){
         x[j++] = a[izq++];
    }
    while(der <= p){
         x[j++] = a[der++];
    }
    for(j = w; j <= p; j++){
         a[j] = x[j];
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n=Integer.parseInt(sc.nextLine());
        Libro[] LL=new Libro[n];
        for (int i = 0; i < n; i++) {
            String name;
            int pages;
            String [] line=sc.nextLine().split(" ");
            //+Integer.parseInt(line[2]/60.0
            name=line[0];
            pages=Integer.parseInt(line[1]);         
            //Libro L=new Libro(name,pages);
            LL[i]=new Libro(name,pages);
        } 
      Ordena(LL);
        for (int i = 0; i < n; i++) {
            System.out.print(LL[i].getName()+"\t");
        }
    }
    
}
