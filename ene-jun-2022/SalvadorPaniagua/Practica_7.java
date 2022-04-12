
package algoritmos.pkg2022;

import java.util.Scanner;
public class Practica_7 {

    
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
		String lista,palabras="";

System.out.println("Por favor separa la eleccion de caracteres con un espacio:");
lista=sc.nextLine();

		String h[]= lista.split(" ");

for(int i=0;i<h.length;i++)
		 {
		for(int j=0;i<h.length && i!=j;j++)
			 {
				 if(h[i].compareToIgnoreCase(h[j])<0)
                                   {
					 String aux=h[i];
					 h[i]=h[j];
				h[j]=aux;
				 }


		 }
                 }
		for(int i=0;i<h.length;i++)
		{
			if(h[i]!=null)	
				palabras+=""+h[i]+" ";
		}

		System.out.println("Datos ordenados por orden alfabetico:"+"\n"+palabras);

	}
}