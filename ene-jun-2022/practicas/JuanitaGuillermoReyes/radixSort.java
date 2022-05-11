import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class radixSort{

    public static void main (String[]args){
Scanner s = new Scanner(System.in);
int i;//variable que se usará
int a = s.nextInt();//tamaño que tendra el arreglo o numero de numeros que ingresaremos para ordenar
radixSort obj = new radixSort();
int [] arr = new int [a];//arreglo donde se guardaran 

for(i=0;i<arr.length;i++){ // se guardan los numeros que queremos ordenar 
   arr[i]=s.nextInt();
}

  obj.radix(arr);//se manda a llamar el metodo 


}
    public  void radix (int [] arreglo){
    int x,i,j;// variables que se va a utilizar en el metodo
    for(x=Integer.SIZE-1;x>=0;x--){ //este for ordena como el metodo radix por unidades,decenas,centenas..
        int auxiliar []=new int [arreglo.length];//auxiliar que ordena
        j=0;
        for (i=0;i<arreglo.length;i++){ //este funciona para checar la condicion que le marca
            boolean mover = arreglo [i]<<x>=0;//de x mayor o igual a cero se guarda en una variable booleana


            if(x==0 ? ! mover:mover){//si la variable booleana es falsa ...
                auxiliar [j]= arreglo[i];// el auxiliar  debe ser igual a el arreglo "el 
                                          //auxiliar es el que se esta acomodando, el arreglo el que ya debe de estar acomodado"
                j++;
            }
            else{
                arreglo [ i-j]=arreglo[i];//en caso de que la variable sea verdadera "i-j" entoces se intercambia
            }
        }
        for(i=j;i<auxiliar.length;i++){//se hace intercambios
            auxiliar [i]= arreglo[i-j];
        }
        arreglo=auxiliar; // al final el que ya ets acomodado se intercambia por el que se estaba comodando
                         //en caso de que aun no este acomodado se sigue acomodando (en decenas,centenas,unidades)
    }
    System.out.println("el arreglo ordenado es:");
    for(i=0;i<arreglo.length;i++){  // aqui ya se imprime el arreglo guardado y que ya esta acomodado
        System.out.println(arreglo[i]);
    }
}
}
