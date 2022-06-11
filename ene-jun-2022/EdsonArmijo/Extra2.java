package Extra;
import java.util.Scanner;
public class Extra2 {
static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
     System.out.println("numero de palabras en lista: ");
        int n=Integer.parseInt(s.nextLine());
        String palabras[]=new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Palabra: ");
            palabras[i]=s.nextLine();
        }
        System.out.println("Palabra a buscar: ");
        String busqueda=s.nextLine();
        
        
        System.out.println(binarySearch(palabras, busqueda, 0, (n-1), 0));
    }
    
    public static int binarySearch(String[] x, String palabra, int min, int max, int anterior){
        int mid = (int)((max+min)/2);
        boolean temp = false;
        if(mid==anterior){
            mid++;
            temp=true;
        }
        if (palabra.compareToIgnoreCase(x[mid])==0){
            return mid;
        }
        else if((max - min == 1 && temp) || (max - min == 0)){
            return -1;
        }
        else{
            if(palabra.compareToIgnoreCase(x[mid])>0){
                return binarySearch(x, palabra, mid, max, mid);
            }
            else{
                return binarySearch(x, palabra, min, mid, mid);
            }
        }
    }
}