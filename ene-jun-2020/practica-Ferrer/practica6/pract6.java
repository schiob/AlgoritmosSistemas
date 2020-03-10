package parcial2;
import java.util.*;
public class pract6 {
			Scanner externo = new Scanner (System.in);
	
	public static void main(String args[]) {
			
		pract6 metodo = new pract6();
			
		Scanner consola = new Scanner(System.in);
		int n=consola.nextInt();//numero de medicinas
		int q=consola.nextInt();//numero de peticiones
		
		String[]stock = new String [n];
		String[]receta = new String [q];
		
		//Guardar_stock

		for(int i=0;i<stock.length;i++) {
			stock[i]=consola.next();
		}
		//Guardar_receta
		for(int i=0;i<receta.length;i++) {
			receta[i]=consola.next();
		}
		
		//orden		
		stock=metodo.orden(stock);
		
		//comparacion

			//impresiones
		metodo.imprimir(stock,receta);
	}//cierre_main
	
	public String[]orden (String []words){
		
		 ///ordenar por boublesort
        for(int i=0; i<words.length;i++) {
            int j=0;
            int h=1;
            String aux2="";
            
            while(h!=words.length) {
                        if(words[j].compareTo(words[h])>0) {
                            aux2=words[h];
                            words[h]=words[j];
                            words[j]=aux2;
                        }
                    j++;
                    h++;
            }//while
                         
            }//for
            return words;    
	}

	public void imprimir(String []stock,String []receta) {
		
		for(int i=0;i<receta.length;i++) {
			int h=0;
			int j=0;
			while(j<stock.length) {
				if(receta[i].equalsIgnoreCase(stock[j])) {
					System.out.println(i);
					h+=1;
				}
				j++;
			}
				if(h==0) {
					System.out.println("-1");
				}
		}	
	}//void

	
}//cierre_clase
