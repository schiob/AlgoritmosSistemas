import java.util.*;
public class Ordinario2 {

	public static void main(String args[]) {
		Scanner consola = new Scanner(System.in);
		Ordinario2 metodo = new Ordinario2();
		
		
		int n=consola.nextInt();
		String busqueda=consola.next();
		
		String[] mercancia = new String [n];
		int[] precios = new int [n];
		int $buscado=0;
		
		for(int i=0;i<mercancia.length;i++) {
			
			mercancia[i]= consola.next();
			precios[i]=consola.nextInt();
			
			if (busqueda.equalsIgnoreCase(mercancia[i])){
				$buscado=precios[i];
			
				}
			}
		
		 metodo.binary_search(mercancia,precios,$buscado, busqueda);
		
	}//cierre main
	
	
	public void binary_search(String []articulo,int []precios,int $buscado,String busqueda) {
		
		int a=articulo.length;
	
		int b=0,t=a-1,mi=0;
		
		boolean localizado =false;
	
			while(b<=t && localizado ==false)	{
				
					mi=(b+t)/2;
			
				if(busqueda.equalsIgnoreCase(articulo[mi])==true ){
					System.out.print(mi+1);
					localizado=true;
				}
				else if($buscado<precios[mi]) {
					t =mi-1;
				}
				else {
					b=mi+1;
				}
			}//end_while
			

}//cierre clase

}
