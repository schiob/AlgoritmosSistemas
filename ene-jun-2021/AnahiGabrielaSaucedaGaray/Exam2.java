import java.util.Scanner;
public class Exam2 {
   public static void main (String args[]){
	   Scanner lee=new Scanner(System.in);
	   boolean esta=false;
	   String buscando; 
	   
	   String [] arr={"Calculo2Deitel"," CalculoForDummies"," AlgebraLineal"," TeoríaDeNúmeros","TheMangaGuideToCalculus"};
	   
	   //pedir
	    System.out.print("dime el nombre del libro a bbuscar:");
	      buscando=lee.nextLine();
	      int i =1;                                              
	    //bbuscar   
	      for (;i<=arr.length;i++){
		        
	    	 if(arr[i].length()==buscando.length()){
	    	 // if(arr[i].equals(buscando)){
	    		  esta=true;
	    		  break;
	    	  }
	      }  
	    	
	   if(esta){                                                               
		      System.out.println("esta en "+i+"posicion");                                                        // System.out.println("Escriba el libro numero"+(i+1)+":");
	   }
	   else{
		   System.out.print("-1 ");
	   }
  
	    //bbuscar
	      
		 
			
		  
	   
	   
   }
}
//Calculo2Deitel CalculoForDummies AlgebraLineal TeoríaDeNúmeros TheMangaGuideToCalculus