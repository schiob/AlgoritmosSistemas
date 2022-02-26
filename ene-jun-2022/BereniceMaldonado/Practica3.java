package algoritmos;

public class Practica3 {

    public static void main(String[] args) {
        int []arr = {3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78};
        bubble(arr);
    }
    
    public static void bubble(int[] arr) {
        for(int i=0; i < arr.length; i++){
            for(int j=arr.length-1; j > i; j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];    
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Array ordenado de mayor a menor y en pares");
        for(int i=0; i<arr.length; i++){
            if(arr[i] %2 == 0){
                System.out.println("["+arr[i]+"]");
            }
        }
    } 
}
