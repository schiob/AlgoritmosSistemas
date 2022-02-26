
public class SelectionSort {
	public static void main (String[]args) {
		int[] arr={3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78};
        System.out.println("Antes del intercambio:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        
        for(int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for(int j = k + 1; j < arr.length; j++){
                if(arr[j] < arr[k]){
                    k = j; 
                }
            }
           
            if(i != k){  
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        System.out.println("Después del intercambio:");
       int im=0;
    
       for(int num:arr){
        	if(num%2==0) {
        		System.out.print(num+" ");
        	}
    }
        }
       
	}

