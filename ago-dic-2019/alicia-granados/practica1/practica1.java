import java.util.Scanner;
public class practica1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		int nnumero=20;
		int  numero []=new  int [nnumero] ;
	        int i=0;


          for( i=0;i<nnumero;i++) 
          {
          System.out.println("agrega el numero");
          numero[i] = reader.nextInt();
	  }
	  for(i=0; i<numero.length; i++)
          {
          System.out.print("  "    +   numero[i] +"   ");
          }
	  System.out.println(" impresion al reves ");
	  for (i = numero.length - 1; i >= 0 ; i--)
          {
          System.out.print("   "+ numero[i]+" ");
	  }
				
				
           practica1.esPar(numero);
           }//main
	
	   public static void   esPar(int numero[]) {
	   for (int i = numero.length - 1; i >= 0 ; i--)
	   {
	   if(numero[i]% 2 == 0)
	   {
	   System.out.print("  \n");
	   System.out.print("  "+ numero[i]+"  ");
	   
	   
	   {
	   //System.out.println(numero[i]+" es impar");
           }
           }
	   }//metodo
	   }//class

}
