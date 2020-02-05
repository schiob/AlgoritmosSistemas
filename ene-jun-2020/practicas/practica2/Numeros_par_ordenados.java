import java.util.*;
public class Numeros_par_ordenados {

	public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int arr[] = {3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78};
   
   for(int i =0; i < arr.length;i++) 
   {
	   System.out.print(arr[i]+", ");
   }
   
   int cont = 0;
   for(int i =0;i<arr.length;i++)
   {
	   if(arr[i]%2==0)
	   {
		   cont+=1;
	   }
   }
	System.out.println("....");

   int arr2[] = new int[cont];
   
   cont =0;
		
		System.out.println("......numeros pares......");
		
		for(int i =0;i<arr.length;i++)
		   {
			   if(arr[i]%2==0)
			   {
				   System.out.print(arr[i]+", ");
				   arr2[cont] = arr[i];
				   cont +=1;
			   }
		   }
		
		
		for(int i=0;i<arr2.length-1;i++)
		{
		int aux = i;//se_asigna_laPosicion_del _primer_for
		for(int j=i+1;j < arr2.length;j++)
		{
			if(arr2[j]<arr2[aux])
			{
				aux=j;      //si_la_la_posicion_"J"_es_menor_que_la_posicion_"i"
			}              // aux_toma_la_posicion_"j"
			
		}//primer ciclo
		
		   int tempo = arr2[i];
		   arr2[i] = arr2[aux];
		   arr2[aux] = tempo;
		
		}//segundo ciclo
		
		
		
		
		
		
		
		
		
		System.out.println("......numeros ordenados........");
		for(int i =0;i<arr2.length;i++)
		   {
			   System.out.print(arr2[i]+", ");
		   }
		
		
		
	}//cierre del main(

}
