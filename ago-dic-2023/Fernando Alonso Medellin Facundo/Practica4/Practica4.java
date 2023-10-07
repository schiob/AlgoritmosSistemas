import java.util.Arrays;
import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Ingresa n");
        int n= scn.nextInt();
        scn.nextLine();
        System.out.println("Ingresa valores con espacio");
        String[]arr =scn.nextLine().split(" ");
        for(int j=1; j< arr.length; j++){
            String actual= arr[j];
            int i=j-1;
            while(i>=0 && arr[i].compareTo(actual)>0){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=actual;
        }
        System.out.println("Estes es tu arreglo");
        System.out.println(Arrays.toString(arr));

    }
}
