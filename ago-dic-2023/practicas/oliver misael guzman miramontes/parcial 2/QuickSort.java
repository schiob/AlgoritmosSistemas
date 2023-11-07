import java.util.*;
public class QuickSort {
	static Scanner sc=new Scanner(System.in);
	public static void quickSort(String[] nom, int[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indicePivote = partition(nom, arr, izquierda, derecha);
            quickSort(nom, arr, izquierda, indicePivote - 1);
            quickSort(nom, arr, indicePivote + 1, derecha);
        }
    }

    public static int partition(String[] nom, int[] arr, int izquierda, int derecha) {
        int pivote = arr[derecha];
        int i = (izquierda - 1);

        for (int j = izquierda; j < derecha; j++) {
            if (arr[j] > pivote) { 
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                String tempNom = nom[i];
                nom[i] = nom[j];
                nom[j] = tempNom;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[derecha];
        arr[derecha] = temp;
        String tempNom = nom[i + 1];
        nom[i + 1] = nom[derecha];
        nom[derecha] = tempNom;

        return i + 1;
    }

    
    public static void imprime(String arr[],int n) {
    	for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void inserta(int arr[],String nom[],int n) {
    	for(int i=0;i<n;i++) {
    		nom[i]=sc.next();
    		arr[i]=sc.nextInt();
    	}
    }
    public static void main(String[] args) {
        /*String nom[] = {"Toyota Camry", "Ford Mustang", "Honda Civic", "Chevrolet Malibu","teslax","toyota","vochoxd"};
        int arr[] = {120000, 65000, 80000, 110000,90000,80000,500000};
        int n = arr.length;*/
    	System.out.println("cantidad");
    	int n=sc.nextInt();
    	String nom[]=new String [n];
    	int arr[]=new int [n];
    	
        
        inserta(arr,nom,n);
        quickSort(nom, arr, 0, n - 1);
        imprime(nom,n);
        
    }
}
