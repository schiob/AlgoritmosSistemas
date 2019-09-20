package practica3;
import java.util.Scanner;

public class practica3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner s=new Scanner(System.in);
		

		  String []nombre= {"parasaurolophus","oviraptor","minimi","troodon","wannanosaurus"};
		  
		  int i;
		  
		  for(i=0; i<nombre.length; i++)
		  {//for 2 imprime los dinosaurios y su tamaño de palabra
			  System.out.print("  "    +   nombre[i] +"     " +"  tamaño de palabra  "+ nombre[i].length()+"  "+"\n");
		   }//for2
		  	System.out.println("\n"+"nombres ordenados");
			 
		  for( i=1;i<nombre.length;i++)
		  {//for3
			  String temp=nombre[i];
		   
		  for(int j=i-1;j>=0;j--)
		  {//for4
			  if(nombre[j].length()>temp.length())
		  {
			   nombre[j+1]=nombre[j];
			   nombre[j]=temp;
		   }//if
			  else {
				  break;
			  }//else14
		  	}//for 4
		  }//for3
		  for(i=0;i<nombre.length;i++)
		  {//for 5 imprime 
			  System.out.print("  "+ nombre[i]+"  ");
		  }//for5
		

}
}