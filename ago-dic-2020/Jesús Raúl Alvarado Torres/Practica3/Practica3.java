import java.util.*;
public class Practica3{
public static void main(String[]args){
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
int NP;
NP = sc.nextInt();// NP = Numero de Pokemons
    int[] arr=new int[NP];
    for(int i=0;i<arr.length;i++){
        int CP = sc.nextInt();// CP = Combat Points = Puntos de combate
        arr[i]=CP;
}//Cierre for
    for(int i=1;i<arr.length;i++){
        int actual=arr[i];
        int j=i-1;
            for(;j>=0;j--){
            if(arr[j]>actual){
                break;
}//Cierre if
            arr[j+1]= arr[j];
}//Cierre for
            arr[j+1]= actual;
}//Cierre for   
for(int i=0; i<arr.length;i++){
    System.out.print(arr[i]+" ");
}//Cierre for
}//Cierre main
}//Cierre class