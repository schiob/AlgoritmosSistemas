import java.util.Scanner;

public class pract3 {
	
		public static void main(String args[]) {
			Scanner consola = new Scanner(System.in);
			
			int n=0;	
			int aux=0;
			String aux2=" ";
			int recorridos=0;		
			System.out.println("N medicinas");
			
			if(1>n && n<100) {
			n = consola.nextInt();
			}
			//arreglos_num/letras
			String []words = new String [n];
			int []num = new int[n];
			
			//ingresar_medicinas
			for(int i=0;i<words.length;i++) {
				
				System.out.println("Medicina "+i);
				words[i]= consola.next();
				 	//numero_de_letras
					num[i]=words[i].length();
				
			}
			
			for(int i=1; i<num.length;i++) {
				int j=0;
				int h=1;
				while(h!=num.length) {
					
					if(num[h]<num[j]) {
						aux=num[h];
							aux2=words[h];
						num[h]=num[j];
							words[h]=words[j];
						num[j]=aux;
							words[j]=aux2;
					}
					else {
						
					}
						j++;
						h++;
				}//while
							 
				}//for
					
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}	
			
		}//cierre de main
}//cierre de clase
