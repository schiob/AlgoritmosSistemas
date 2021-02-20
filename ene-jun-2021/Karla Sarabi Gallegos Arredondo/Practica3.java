package AlgoritmosDeOrdenamiento;
import java.util.Scanner;
public class Practica3 {
    
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Tamaño de la lista: ");   
        int n = s.nextInt();
        
        String arr[] = new String [n]; 
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.next();
        }
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].length()>arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
