import java.util.Scanner;
public class NumerosPar {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
  // int arr[]= {3,43,2,5,4,6,5,4,334,45,23,123,323,45,34,23,43,5,46,78};
   int arr2[]=new int[20];
   
   System.out.print("cantidad de numeros a introducir: ");
   int num=s.nextInt();
   int arr[]= new int[num];
   for(int j=0;j<num;j++) 
   {
	 System.out.print("Escribe los numeros: ");
	  int n=s.nextInt();
	  arr[j]=n;
	   System.out.print(arr[j]);
   }
   
   System.out.println("");
   System.out.println("Los Numeros Pares son: ");
   for(int i=0;i<arr.length;i++) 
   {
	if(arr[i]%2==0) 
	{
		
		
	arr2[i]=arr[i];
		System.out.print(arr2[i]+",");
	}
   }//cierre del for
   System.out.println("");
   System.out.println("numeros inversos: ");
   for(int i=arr2.length-1;i>=0;i--)
   {
	   if(arr2[i]!=0)
	   {
		   System.out.print(arr2[i]+",");
	   }
	   
	   
   }//cierre del segundo for

   
	}//cierre del main
}//cierre de clase