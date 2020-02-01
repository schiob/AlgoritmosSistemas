import java.util.Scanner;
public class pract1 {

	public static void main (String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		String datos = "";
		///opcional
		System.out.println("Teclea 2 numeros separados por espacio");
		//////
		datos= teclado.nextLine();
		String[] nuevo = datos.split("\\s+");
		int suma=0;
		
		
		for(int a=0;a<nuevo.length;a++) {
			
			double num=Integer.valueOf(nuevo[a]);
			suma +=num;

		}
		
		
		System.out.print(suma);
		
	}//cierre de main
	
}//cierre de clase