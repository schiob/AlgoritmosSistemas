package practicas;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaSecuencial {
	public static void main(String[]args) {
		Scanner s= new Scanner(System.in);
		int i=0,j=0,k=0,l=0;
		System.out.println("INGRESA NUMERO DE REPISAS, LIBROS, PAGINAS Y ESTAMPILLAS:");
		  int tam = s.nextInt();
		  int tam2=s.nextInt();
		  int tam3=s.nextInt();
		  int tam4=s.nextInt();
		  
		  
      
        int[][][][]busqueda= new int  [tam][tam2][tam3][tam4];
        
        boolean existe=true;
        
        System.out.println("INGRESA LOS NUMEROS: ");
        for( i=0; i<busqueda.length; i++) 
        {     
        	for( j=0; j<busqueda[i].length;j++)
        	{    
        		for( k=0; k<busqueda[i][j].length; k++)
        		{  
        			for( l=0; l<busqueda[i][j][k].length; l++)
        			{ 
        				busqueda[i][j][k][l] = s.nextInt();
        				
        		}
        	}
        		System.out.println("");
        }
    }
        
        ///
        	for( i=0; i<busqueda.length; i++) 
            {     
            	for( j=0; j<busqueda[i].length;j++)
            	{    
            		for( k=0; k<busqueda[i][j].length; k++)
            		{  
            			for( l=0; l<busqueda[i][j][k].length; l++)
            			{ 
            				System.out.print("");
            				System.out.print(  busqueda[i][j][k][l]+ ",");
            		}
            			System.out.print("\t");
            	}
               System.out.println();
            }
            	System.out.println();
            }

        
        	int pos1=0, pos2=0, pos3=0,pos4=0;
        	System.out.println("estampilla a buscar:");
        	int numBusc=s.nextInt();
        	System.out.println("");
        	
        	for( i=0; i<busqueda.length; i++) 
            {     
            	for( j=0; j<busqueda[i].length;j++)
            	{    
            		for( k=0; k<busqueda[i][j].length; k++)
            		{  
            			for( l=0; l<busqueda[i][j][k].length; l++)
            			{ 
            				if(numBusc==(busqueda[i][j][k][l])) {
            					existe=false;
            					pos1=i+1;
            					pos2=j+1;
            					pos3=k+1;
            					pos4=l+1;
            				}
            				
            			}		
            		}
            	}
            }
        	System.out.println("");
         	if(existe) {
         		System.out.println("[-1] el numero no existe");
         	}
         	else
         	{
         		System.out.println( "repisa:"+ pos1+ ","+ " el libro:"+ pos2+ "," +"pagina"+ pos3 + "," + "posicionde la estampilla" + pos4);
         	}
        	

        	
	}
}

        	
 