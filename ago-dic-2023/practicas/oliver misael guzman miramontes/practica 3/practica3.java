import java.util.*;
public class practica3 {

	public static void main(String args []) {
	    Scanner s= new Scanner(System.in);
		int pokemones=0;
		
		
		System.out.println("ingrese la cantidad de pokemones y su poder de cada uno");
	    pokemones=s.nextInt();
	    
	    if(pokemones<1 || pokemones>30) {
	    	System.out.println("ingrese una cantidad de 1 a 30 pokemones");
		    pokemones=s.nextInt();
		    
	    }
	    
	    int arr[]= new int  [pokemones];
	    
	   for(int i=0;i<arr.length;i++) {
		    arr[i]=s.nextInt();
		    if(arr[i]<=1 ||arr[i]>= 2000) {
		    	System.out.print("ingrese un nivel de poder de 1 a 2000\t");
		    	arr[i]=s.nextInt();
		    }
		}
		
		for (int i=0; i<arr.length-1; i++) {  
            int guar = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[guar]){  
                    guar=j; 
                }  
            }  
            int menor= arr[guar];   
            arr[guar] = arr[i];  
            arr[i] = menor;  
        }  
		
		for(int i:arr) {
			System.out.print(i+"  ");
		}
	}
}