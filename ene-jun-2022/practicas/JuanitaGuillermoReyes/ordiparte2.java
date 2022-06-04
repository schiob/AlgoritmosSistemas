import java.util.Arrays;
import java.util.Scanner;
//Ejercicio 1 ordinario - intente hacer otra implementacion 
//colores
public class ordiparte2 {
	public static void main (String [] args){
		 Scanner sc=new Scanner(System.in);

		 String []arreglo={"Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"};

       arreglo=mergeSort(arreglo);
	for (String elementos:arreglo){
		System.out.print(elementos+" ");
	 }
}

	public static String [] mergeSort(String []arry){
		if(arry.length==1){
			return arry;	
		}
		String middle=arry.length/2;
		String []left=Arrays.copyOfRange(arry,0,middle);
		String  []right=Arrays.copyOfRange(arry,middle,arry.length);

		left=mergeSort(left);
		right=mergeSort(right);
                int[] newArreglo=Mergesort(left,right);
		return arry;
	}
	    public static int[]merge (int []left, int[]right){
	    	int []resu=new int [left.length+right.length];
              int i=0;int f=0;int k=0;

	    	    while(i<left.length && f< right [f]){
	    	    	if(left[i]<=right [f]){
	    	    		resu[k]=left[i];
	    	    		 i++;

	    	    	}
	    	    	else{
	    	    		resu[k]=right[f];
	    	    		f++;
	    	    	}
	    	    	k++;
	    	    }
		                  while(i<left.length){
		            	   resu[k]=left[i];
		            	     k++;
		            	     i++;
		                  }
		                      while(f<right.length){
		                    	resu[k]=right[f];
		                    	k++;
		                    	f++;
		                    }
		                      return resu;
	}
}