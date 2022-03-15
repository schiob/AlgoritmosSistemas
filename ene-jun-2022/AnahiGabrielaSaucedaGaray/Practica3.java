import java.util.Scanner;
public class Practica3 {
	public static void main (String args[]){
		
	   Scanner lee=new Scanner(System.in);
	   int [] arr={3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78};
	          int i=0;
	        for(;i<arr.length;i++){
	        	for (int j=i+1;j<arr.length;j++){
	        		if (arr[i]%2==0)
	        		if(arr[i]<arr[j]){
	        			 int temp=arr[i];
	        			 arr[i]=arr[j];//posicion ,valor
	        			 arr[j]=temp;  //posicion , vallor
	        		}
	        		  
	        	}
	        }
	    	
	           
	             for(i=0;i<arr.length;i++){
	        	     if (arr[i]%2==0) {
	        	    	 System.out.print(arr[i]+" ");
	        	     }
	             }
	   }
	}

