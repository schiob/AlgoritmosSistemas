package algoritmos;
import java.util.Arrays;

public class Practica9 {
//IMPLEMENTANDO EL RADIX SORT
   
    public static void main(String [] args){
        int arr[] = {77,133,97,335,487,99,103};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void radixSort(int [] arr){
        int [][] bucket = new int [10][arr.length];
        int [] bucketOfElement = new int[10];
        int max=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        int maxLength = (max+"").length();
        for(int m=0,n=1; m<maxLength; m++,n*=10){
            for(int i=0; i<arr.length; i++){
                int digit = arr[i]/n%10;
                bucket[digit][bucketOfElement[digit]] = arr[i];
                bucketOfElement[digit]++;
            }
         
        int index = 0;
        for(int j=0; j<10; j++){
            for(int k=0; k<bucketOfElement[j]; k++){
                arr[index] = bucket[j][k];
                index++;
            }
            bucketOfElement[j]=0;
        }
        }
    }
}
