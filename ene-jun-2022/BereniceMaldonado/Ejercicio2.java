package algoritmos;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
// Tiempos = 210,157,241,230,157
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        System.out.println("¿Cuántas peliculas quieres ver?");
        p = sc.nextInt();
        
        int arr[] = new int [p];
        for(int i=0; i<arr.length; i++){
            System.out.println("Ingresa en el tiempo en minutos que dura cada una de las "+p+" peliculas");
            System.out.println("Ingresa el nombre de la pelicula");
            arr[i] = sc.nextInt();
        }
       
        arr = mergeSort(arr);
        for(int elem:arr){
            System.out.println(elem+" ");
        }
    }
    
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        
        int middle = arr.length/2;
        int []left = Arrays.copyOfRange(arr,0,middle);
        int []right = Arrays.copyOfRange(arr,middle,arr.length);
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        int []newArr = merge(left, right);
        return newArr;
    }
    
    public static int[] merge(int[] left,int[] right){
        int []resultado = new int[left.length+right.length];
        int i = 0, j = 0, k = 0;
        
        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                resultado[k] = left[i];
                i++;
            }
            else{
                resultado[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            resultado[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            resultado[k] = right[j];
            k++;
            j++;
        }
        return resultado;
    }    
}