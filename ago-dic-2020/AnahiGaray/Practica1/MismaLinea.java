import java.util.Scanner;
public class MismaLinea {
public static void main (String args[]){

	
	Scanner lector=new Scanner(System.in);
	
	int a=lector.nextInt();
	int b=lector.nextInt();
	
	lector.close();
	int suma=a+b;
	System.out.print("la suma es:"+suma); 
}
}
 