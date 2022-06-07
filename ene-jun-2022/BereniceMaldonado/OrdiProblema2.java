package algoritmos;
import java.util.Scanner;

public class OrdiProblema2 { 
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingresa el numero de regalos ");
        int e = sc.nextInt();
        System.out.println("¿Que regalo quieres?");
        String regalo = sc.next();
        String []arr = {"TacosPastor","Teclado","Audifonos","NintendoSwitch","Iphone","LaptopLenovo"};
        String x = "Iphone";
        int result = binarySearch(arr,x);
        if(result == -1){
            System.out.println("-1");
        }
        else{
            System.out.println(result);
        }
    }
    
    static int binarySearch(String[] arr, String x){
        int l=0, r=arr.length-1;
        while(1 <= r){
            int m = l+(r-1)/2;
            int res = x.compareTo(arr[m]);
            if(res==0){
                return m;
            }
            if(res > 0){
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return -1;
    }
}