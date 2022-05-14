import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class p2{

    public static void main (String[]args){
Scanner s = new Scanner(System.in);
int i;
int a = s.nextInt();
p2 obj = new p2();
int [] arr = new int [a]; 

for(i=0;i<arr.length;i++){ 
   arr[i]=s.nextInt();
}

  }
    public  void radix (int [] arreglo){
    int x,i,j;
    for(x=Integer.SIZE-1;x>=0;x--){ 
        int auxiliar []=new int [arreglo.length];
        j=0;
        for (i=0;i<arreglo.length;i++){ 
            boolean mover = arreglo [i]<<x>=0;


            if(x==0 ? ! mover:mover){
                auxiliar [j]= arreglo[i];
                                          
                j++;
            }
            else{
                arreglo [ i-j]=arreglo[i];
            }
        }
        for(i=j;i<auxiliar.length;i++){
            auxiliar [i]= arreglo[i-j];
        }
        arreglo=auxiliar; 
    }
    System.out.println("el orden es:");
    for(i=0;i<arreglo.length;i++){  
        System.out.println(arreglo[i]);
    }
}
}
