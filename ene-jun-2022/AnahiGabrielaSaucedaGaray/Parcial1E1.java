import java.util.Scanner;
public class Parcial1E1 {
public static void main (String args[]){
	Scanner lee=new Scanner(System.in);
	
	
	
	String arr[]={"Parasaurolophus","Oviraptor","Minmi","Troodon","Wannanosaurus"};
	//pedir
      				/**System.out.print("Cuantos dinos va a ordenar:");
	  					int cantidad=lee.nextInt();
					 arr =new String [cantidad];
	   
	      for (int i =0;i<=arr.length;i++){
		         arr[0]=lee.nextLine();            
		         System.out.print("Escriba el dino numero"+(i+1)+":");
		         
          } **/
	      
	      //ordenamiento
	      for(int i=1;i<arr.length;i++){
	   	   String actual=arr[i];
	   	     int j=i-1;
	   	         for(;j>=0;j--){  //los i y los j son los indices
	   		        if(arr[j].length()<actual.length()){
	   			      
	   		        	break;
	   		        }
	   		arr[j+1]=arr[j];
	   	        }
	   	   arr[j+1]=actual;
	      }
	      

	      
   for(String elem:arr){
	   System.out.print(elem+" ");
   }
	
}
}
 

//Parasaurolophus Oviraptor Minmi Troodon Wannanosaurus   ENTRADA 
//Minmi Troodon Oviraptor Wannanosaurus Parasaurolophus   SALIDA


