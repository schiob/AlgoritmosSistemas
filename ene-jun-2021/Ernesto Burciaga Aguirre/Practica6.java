package parcial_1;
import java.util.*; 
public class Practica6 {
	
public static void quicksort(String arr[], int izq,int der) {
		
		String pivote = arr[izq];
		int i = izq;
		int j = der;
		String aux = " ";
		
		while(i < j){                          
		     while(arr[i].compareTo(pivote) <= 0 && i < j) i++; 
		     while(arr[j].compareTo(pivote) > 0) j--;           
		     if (i < j) {                                             
		         aux = arr[i];                      
		         arr[i]=arr[j];
		         arr[j]=aux;
		       	
		     }
		   }
			
		 arr[izq]=arr[j];     
		 arr[j]=pivote;
			   
		 if(izq < j-1)
		      quicksort(arr,izq,j-1);          
		 if(j+1 < der)
		      quicksort(arr,j+1,der);
		}

		
	
		
	public static void main(String args[])
	{
		Scanner n = new Scanner(System.in);
		System.out.print("Cantidad de medicina: ");
		int size = n.nextInt();
		
		String arr[] = new String[size];
		
		for(int i = 0; i<size; i++) {
			System.out.print("\nNombre de la medicina: ");
			arr[i] = n.next();
		}
		
		quicksort(arr,0,size - 1);
		for(int j = 0; j < size; j++) {
        System.out.println(arr[j]);
		}
	}
}
