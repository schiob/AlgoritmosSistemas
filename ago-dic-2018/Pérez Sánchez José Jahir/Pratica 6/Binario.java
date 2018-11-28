
package algoritmos;

import java.util.Scanner;

public class Binario {
    public static int Encuentra(String[]a,int inicio,int termina,String dato){
   int mid=(inicio+termina)/2;
        if(inicio==termina){
            if(a[inicio].compareToIgnoreCase(dato)== 0){
                return inicio;
            }else{
                return -1;
            }       
        }
        if(a[mid].compareToIgnoreCase(dato)== 0){
            return mid;
        }
       if(a[mid].compareToIgnoreCase(dato)>0){
           if(inicio==mid){
               return -1;
           }
           if(a[mid-1].compareToIgnoreCase(dato)== 0){
            return mid-1;
        }
           return Encuentra(a,inicio,mid-1,dato);
       }
       if(a[mid].compareToIgnoreCase(dato)<0){
           return Encuentra(a,mid+1,termina,dato);
       }
       return -1;
}

    public static void main(String[] args) {      
       Scanner sc = new Scanner(System.in); 
      String a[]={"a", "a12", "b2", "text2", "text2a", "text2a2"};
      String encu="";
      encu=sc.nextLine();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n");
        System.out.println(Encuentra(a,0,a.length,encu));
    }
    
}
