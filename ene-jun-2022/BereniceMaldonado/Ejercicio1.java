package algoritmos;

public class Ejercicio1 {

    private static int[] arr1;

    public static void main(String[] args) {
        String arr[]={"Parasaurolophus","Oviraptor","Minmi","Troodon","Wannanosaurus"};
        bubble(arr);
    }
    
    public static void bubble(String[] arr) {
        for(int i=0; i < arr.length; i++){
            for(int j=arr.length-1; j > i; j--){
                if(arr[j].length() > arr[j-1].length()){
                    String temp = arr[j];    
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Ordena Dinos");
        for (String arr1 : arr) {
            System.out.print(arr1+" ");
        } 
    }
}