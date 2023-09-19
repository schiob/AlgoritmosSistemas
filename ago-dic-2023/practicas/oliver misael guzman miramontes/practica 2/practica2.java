import java.util.*;
import javax.swing.*;
public class practica2 {

	 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	System.out.print("ingrese cantidad de problemas y \nde tiempo separado por un espacio");	
	int pro=s.nextInt();
	int tiem=s.nextInt();
	int i=0;
	int arr[]=new int [pro];
		
		for( i=0;i<arr.length;i++) {
			System.out.print("ingresa el tiempo del problema "+i);
			arr[i]=s.nextInt();
		}
		
		 for (int j= 0;j<arr.length; j++) {
			 int val=arr[j];
			  int a=j-1;
			  while(a>=0 && val<arr[a]) {
				  arr[a+1]=arr[a];
				  a--;
			  }
			  
			  arr[a+1]=val;
		  }
		 
	       int can=0; 
	       int canti=0;
	       
		 for(i=0;i<arr.length;i++) {
			 if(canti+arr[i]<=tiem) {
				 canti=+arr[i];
				 can++;
			 }else {
				 break;
			 }
		 }
		 
		 System.out.println("la cantidad maxima de problemas \n que puede hacer es: "+can);
 }
}