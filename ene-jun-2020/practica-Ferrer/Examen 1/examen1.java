import java.util.Scanner;

public class examen1 {

		public static void main(String args[]) {
		
			Scanner consola = new Scanner(System.in);
		
		
		int n=0;
		n=consola.nextInt();
		
		String[]nombre = new String[n];
		int[]hora = new int[n];
		int[]min = new int [n];
		
		int ah=0;
		int am=0;
		String an="";
		
		///for_para_datos
		for(int i=0;i<hora.length;i++) {
			nombre[i]=consola.next();
			int suphora=consola.nextInt();
			if(0<=suphora && suphora<=4) {
				hora[i]=suphora;
			}
			int supmin=consola.nextInt();
			if(0<=supmin && supmin<=59) {
			min[i]=supmin;
			}
		}
		////////
		//bouble_sort
		
		 for(int i=1; i<hora.length;i++) {
	            int j=0;
	            int h=1;
	            while(h!=hora.length) {
	                
	                if(hora[h]<hora[j]){
	                	ah=hora[h];
	                		am=min[h];
	                			an=nombre[h];
	                	 
	                	hora[h]=hora[j];
	                		min[h]=min[j];
	                			nombre[h]=nombre[j];
	                		
	                	hora[j]=ah;
	                		min[j]=am;
	                			nombre[j]=an;
	                }//if_hora
	                else {
	                	if(hora[h]==hora[j]){
	                		if(min[h]<min[j]) {
	                		am=min[h];
	                			an=nombre[h];
	                	 
	                		min[h]=min[j];
	                			nombre[h]=nombre[j];
	                		
	                		min[j]=am;
	                			nombre[j]=an;
	                		}
	                	}
	                	else {
	                		if(min[h]==min[j]) {
	                			
	                			if(nombre[j].compareTo(nombre[h])>0) {	
		                			an=nombre[h];

		                			nombre[h]=nombre[j];
		               
		                			nombre[j]=an;
	                			}
	                			else {
	                				
	                			}
	                		}
	                		
	                	}
	                }
	                   h++;
	                   j++;
	            }
	         
		 }//fin_boubble-man
		 
		 for(int i=0;i<hora.length;i++) {
			 System.out.print(nombre[i]+" ");
		 }
	}//cierre_public
		
		
	          
}//cierre_main
