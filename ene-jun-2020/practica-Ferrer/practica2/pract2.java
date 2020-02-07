import java.util.Scanner;
public class pract2 {
	public static void main(String args[]) {
		
		Scanner consola = new Scanner (System.in);
		
		String datos="3 43 2 5 4 6 5 4 334 45 23 123 323 45 34 23 43 5 46 78";
		String[] nuevo =datos.split("\\s+");
		int aux=0, j=0;
		int[]a = new int[20];
		
		//Pasar datos String a int y almacenar en arreglo
		for(int i=0;i<nuevo.length;i++) {
			int num=Integer.valueOf(nuevo[i]);
			
			if(num%2==0) {
				a[i]=num;	
			}
			else {
				
			}
		}
		
		for(int i=1;i<nuevo.length;i++) {
			aux=a[i];
			j=i;
			while(j>0 && aux>a[j-1]){
				
				a[j]=a[j-1];
				j--;
			}
			a[j]=aux;
		}
		for(int i=0;a[i]>0;i++){
		System.out.print(" " + a[i]);
		}
	}//cierre de main
}//cierre de class
