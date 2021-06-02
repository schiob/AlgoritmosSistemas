import java.util.Arrays;
import java.util.Scanner;
public class ExamOrdi {
	public static void main (String [] args){
		 Scanner lee=new Scanner(System.in);
		 
		 String []arr={"Rojo", "Anaranjado", "Amarillo", "Verde", "Indigo", "Violeta", "Azul"};
		 
		  
		       
		        
		arr=mergeSort(arr);
	for (String elementos:arr){
		System.out.print(elementos+" ");
	 }
}//main
	
	public static String [] mergeSort(String []arr){
		if(arr.length==1){
			return arr;	
		}
		String middle=arr.length/2;
		String []left=Arrays.copyOfRange(arr,0,middle);
		String  []right=Arrays.copyOfRange(arr,middle,arr.length);
		
		left=mergeSort(left);
		right=mergeSort(right);
		
		int[] newArr=merge(left,right);
		return newArr;
	}
	    public static int[]merge (int []left, int[]right){
	    	int []resultado=new int [left.length+right.length];
	    	
	    	  int i=0;
	    	  int j=0;
	    	  int k=0;
	    	  
	    	    while(i<left.length && j< right [j]){
	    	    	if(left[i]<=right [j]){
	    	    		resultado[k]=left[i];
	    	    		 i++;
	    	    		 
	    	    	}
	    	    	else{
	    	    		resultado[k]=right[j];
	    	    		j++;
	    	    	}
	    	    	k++;
	    	    }
		                  while(i<left.length){
		            	   resultado[k]=left[i];
		            	     k++;
		            	     i++;
		                  }
		                      while(j<right.length){
		                    	resultado[k]=right[j];
		                    	k++;
		                    	j++;
		                    }
		                      return resultado;
	}

	
	
	
	
	
	
	

}
