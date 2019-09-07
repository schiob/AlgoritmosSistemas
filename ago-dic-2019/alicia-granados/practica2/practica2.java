package practica2;
import java.util.Scanner;
public class practica2 {
	
          public static void main (String args[]){
	 
	  Scanner s=new Scanner(System.in);
	 
	 
	  System.out.print("cantidad de problemas");
	 
	  int problema=s.nextInt();
	 
	  System.out.print("cantidad de minutos que tiene para resolver los problemas");
	  int min=s.nextInt();

	  int  numero []=new  int [problema] ;
	 
	  int i=0;
	  int cantidad=0;
	 
	  for( i=0;i<problema;i++)
	  {
	   System.out.println("cantidad de tiempo de cada problema");
	   numero[i] = s.nextInt();
	  }//for1
	 
	  for(i=0; i<numero.length; i++)
	  {
	  System.out.print("  "    +   numero[i] +"   ");
	  }//for2
	     
	  System.out.println("\n"+"\numeros ordenados");
	 
	  for( i=1;i<numero.length;i++)
	  {
	  int temp=numero[i];
	  for(int j=i-1;j>=0;j--)
	  {
	  if(numero[j]>temp)
	  {
	  numero[j+1]=numero[j];
	  numero[j]=temp;
	  }//if
	  else
          {
	  break;
	  }//else14
	  }//for 4
	  }//for3
	  for(i=0;i<numero.length;i++)
	  {
	  System.out.print("  "+ numero[i]+"  ");
	  }//for5

	  System.out.println("");

	  for(i=0; i < numero.length; i++)
          {
	  cantidad += numero[i];
	  if(cantidad > min) {
	  cantidad = i;
	  break;
	  }
	  System.out.print("  "+ numero[i]+"  ");
	  }//for6

	  System.out.println("");
	  if(cantidad == 0)
	  System.out.println("No contesto ninguno");
	  else
	  System.out.println("pudo resolver   "+ cantidad);
	 
	  }//end main
	}//end class

