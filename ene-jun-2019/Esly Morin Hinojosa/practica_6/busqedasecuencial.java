package proyectoesli;
import java.util.*;
public class busqedasecuencial 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	  int x[][][][];
	  int i=0,j=0,k=0,l=0;
	  int elemento;
	  int n,m,ñ,o;
	  System.out.println("====cuantas repisas===");
	  n=sc.nextInt();
	  System.out.println("====cuantos libros en cada repisas===");
	  m=sc.nextInt();
	  System.out.println("====cuantas paginas tiene cada libro===");
	  ñ=sc.nextInt();
	  System.out.println("====cuantas estampilas tiene cad pagina===");
	  o=sc.nextInt();
	  x=new int[n][m][ñ][o];
	  System.out.println("dame datos");
	  for(i=0;i<x.length;i++)
	  {
		  for( j=0;j<x[i].length;j++)
		  {
			  for(k=0;k<x[i][j].length;k++)
			  {
				  for(l=0;l<x[i][j][k].length;l++)
				  {
					  x[i][j][k][l]=(int)(Math.random()*750+1);
				  }
			  }
		  }
	  }
	  //imprimiendo datos
	  for(i=0;i<x.length;i++)
	  {
		  for( j=0;j<x[i].length;j++)
		  {
			  for(k=0;k<x[i][j].length;k++)
			  {
				  for(l=0;l<x[i][j][k].length;l++)
				  {
					  
					  System.out.print(x[i][j][k][l]+",");
					
				  }
				  System.out.print("\t");
			  }
			  System.out.print("\t");
		  }
		  System.out.println();
	  }
	  System.out.println("que elemento:");
	  elemento=sc.nextInt();
	 busqedasecuencial b=new busqedasecuencial();
	  b.busqueda(x, elemento);
	 System.out.println("posicion :" + b.busqueda(x, elemento));
	}
	public String busqueda(int x[][][][],int elemento)
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				for(int k=0;k<x[i][j].length;k++)
				{
					for(int l=0;l<x[i][j][k].length;l++)
					{
						if(x[i][j][k][l]==elemento)
						{
					        return( (i)+("\t")+(j)+("\t")+(k)+("\t")+(l));
						}
					}
				}
			}
			
		}
		return ("-1");
		
	}

}
