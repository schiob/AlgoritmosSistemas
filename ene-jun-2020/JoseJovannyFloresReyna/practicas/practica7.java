package practicas;

public class practica7 {
    
    int sort(int arr[]) 
    { 
        int n = arr.length; 
  
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            for (int i = gap; i < n; i += 1) 
            { 
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
                arr[j] = temp; 
            } 
        } 
        return 0; 
    } 
  
    public static void main(String args[]) 
    { 
        int coloresID[] = {213,67,45,34,578,9,7,4,90,56,734,23}; 
       
  
        practica7 ob = new practica7(); 
        ob.sort(coloresID); 
  
        for(int i=0; i<coloresID.length; i++) {
        	System.out.print(coloresID[i]+" ");
        }
    } 
}  