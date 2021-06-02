import java.util.Scanner;
import java.util.Arrays;
	public class Exam {
		public static void main(String[] args){
			
			Scanner  lee=new Scanner(System.in);
	                                                              //int	[] arr={StarWars 2 1,Alien 1 57,ASpaceOdyssey 2 41,Matrix 2 30,BladeRunner 1 57};
			 int []arr;
			 
			    //  String []peliculas= request.getParametersValues("peliculas");
			 
			       //int[] valores = new int[peliculas.length];

			       // for(int i = 0; i < valores.length; i++){
			       //  valores[i] = Integer.parseInt(peliculas[i]);
			 //}
			 
			 
			 
			 
			 
			 
				System.out.print("Dime la cantidad de peliculas:");
			       int pelis=lee.nextInt();
			       
			        arr =new int[pelis]; // a arr le asignamos el # elementos o peliculas
			
				     for(int i=0;i<pelis;i++){
					    System.out.println("Escriba la pelicula"+" "+(i+1)+":");
				         arr[i]=lee.nextInt();
				     }
		arr=mergeSort(arr);
		for (int elementos:arr){
			System.out.print(elementos+" ");
		 }
}//main
		
		public static int [] mergeSort(int []arr){
			if(arr.length==1){
				return arr;	
			}
			int middle=arr.length/2;
			int []left=Arrays.copyOfRange(arr,0,middle);
			int []right=Arrays.copyOfRange(arr,middle,arr.length);
			
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