package algoritmos;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el total de películas: ");
        int totalMovies = sc.nextInt();
        sc.nextLine();
        //Creo un arreglo para almacenar las películas y sus atributos
        Object[][] Movie = new Object[totalMovies - 1][2];
        
        for (int i = 0; i < Movie.length; i++) {
            System.out.print("Introduzca el nombre de la película " + (i + 1) + ": ");
            Movie[0][i] = sc.nextLine();    
        }
            
        for (int i = 0; i < Movie.length; i++) {
            System.out.print("Introduzca la duración en horas de la película " + (i + 1) + ": ");
            Movie[1][i] = sc.nextInt();    
        }
        
        for (int i = 0; i < Movie.length; i++) {
            System.out.print("Introduzca la duración en minutos de la película " + (i + 1) + ": ");
            Movie[2][i] = sc.nextInt();    
        }
        
    }
    
     public void Sort(int[] array, int left, int right){
        if(left < right){
            int middle = (left + right)/2;           
            Sort(array, left, middle);
            Sort(array, middle+1, right);
            
            Merge(array, left, middle, right);
        }
    }
    
    public void Merge(int[] array, int left, int middle, int right){
        int n1 = middle - left + 1;
        int n2 = right - middle;
        
        int leftArray[] = new int [n1];
        int rightArray[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + j + 1];
        }
        
        
        int i = 0, j = 0;

        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
       
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    
    public void PrintArray(int[] array){
        int n = array.length;
        for (int i=0; i<n; ++i) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    
}