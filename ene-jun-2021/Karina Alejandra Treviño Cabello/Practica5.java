import java.util.Arrays;
import java.util.Scanner;


public class mergesorttt{

  
    public static void main(String[] args) {
             Scanner entrada =new Scanner(System.in);
        String []arr;
        int n;
        int i;
         System.out.println("Cantidad de OBjetos");
        n=entrada.nextInt();
         arr=new String [n];
       for( i=0; i<n; i++){
           System.out.println("Objeto:");   
            arr[i]=entrada.next();
       }
                    
        arr=mergeSort(arr);
      for(String elem:arr){
          System.out.println(elem+" ");
      
      }
       
    }
    
    public static String[] mergeSort (String[]arr) {   
    
    if(arr.length==1){
    return arr;
                     }

int middle = arr.length/2;
        String[] left= Arrays.copyOfRange(arr,0,middle);
        String [] right=Arrays.copyOfRange(arr,middle, arr.length);
        
       left =mergeSort(left);
        right=mergeSort(right);

    String[]newArr= merge(left, right);
    return newArr; 
          
    }
public static String [] merge(String[] left, String[] right){
	//generar mi arreglo resultado 
	String resultado[]=new String[left.length+right.length];
	//recorro los dos arreglos, left and right
	//declaro 2 variables en donde i y j seran mis apuntadores
	int i=0; 
	int j=0; 
        int k=0;
while(i<left.length && j<right.length){
	//voy a comparar
    if(j>=right.length || (i<left.length && left[i].compareToIgnoreCase(right[j])<0)){
  		resultado[k]=left[i];
		i++;
} else {
	resultado[k]=right[j]; 
	j++;
	}
	k++;
}
	while(i<left.length){
	 resultado[k]=left[i];
	k++;
	i++;

} while(j<right.length){
	resultado[k]= right[j];
	k++;
	j++;
}

	return resultado;
   	}
}