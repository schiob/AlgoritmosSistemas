import java.util.Scanner;
public class Practica2 {
	public static void main (String args[]){
		int sum=0;
			Scanner lee=new Scanner(System.in);

		    int []arr={4,2,3,7,5,1,2,1,3,2};
		    
		    for(int i=1;i<arr.length;i++){
		    	int actual=arr[i];
		    	int j=i-1;
		    	for(;j>=0;j--){
		    		if(arr[j]<actual){
		    		   break;
		    		   
		    		}
		    		arr[j+1]=arr[j];
		         }
		    	arr[j+1]=actual;
		    	//sum=sum+arr[i];;
		    }
		    
		    //declaramos y construimos un nuevo arreglo con el same tamaño que el anterior
	        int[] arrcopia;
	        arrcopia = new int[arr.length];
	 
	        //copiamos el contenido del primer arreglo en el segundo arreglo
	        System.arraycopy(arr, 0, arrcopia, 0, arr.length);
	        
	 
	        System.out.print("Dame tiempo:");
	           int tiempo=lee.nextInt();
	        int i=0;
	        for (; i< arrcopia.length && sum<tiempo ; i++) {
	        	
	        
	        	sum +=  arrcopia[i];
	        	
	        }
	            System.out.print(i);
	        	
}
}
