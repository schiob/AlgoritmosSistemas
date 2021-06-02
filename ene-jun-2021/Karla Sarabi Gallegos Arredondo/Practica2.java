package AlgoritmosDeOrdenamiento;
public class Practica2 {

    public static void main(String[] args) {
        int []arr = {3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78};
        
        for (int i = 1; i < arr.length; i++) {
            int actual =  arr[i];
            
            int j = i-1;
            for (; j >= 0; j--) {
                if(actual > arr[j]){
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = actual;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
        }
    }
