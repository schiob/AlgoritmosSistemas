import java.util.*;
public class parcial2 { 
		
	public static void main(String args[]) {

		//no funciona:((((((((((((((((((((
		//llevo desde las 6 hasta ahora ,son las 2:19 am
			Scanner consola = new Scanner(System.in);
			parcial2 metodo = new parcial2();
		
		int n=consola.nextInt();//n canciones de la lista
		int q=consola.nextInt(); //q canciones que desea encontrar
		
		String [] N= new String[n];
		String Q [] = new String [q];
		
		for(int i=0;i<n;i++) {
			N[i]=consola.next();
		}
		 
		for(int i=0;i<q;i++) {
			Q[i]=consola.next();
		}
		String pivote=N[0];
		String extremo=N[n-1];
		
		N=metodo.merge_sort(N);
		
		for(int i=0;i<N.length;i++) {
			System.out.print(N[i]+" ");
		}
		/////////////////Binary_search
		int a=N.length;
			String bot=N[0];
			String mid=N[a/2];
			String top=N[a-1];
				
		for(int i=0;i<Q.length;i++) {
	
			metodo.binary_search(N,Q[i]);
		}
	}//Main_end
	
	//menos de 10 min haciendolo en merge_sort:(///////////////////////////////////////
	
	
	
	///metodo quick pero no funciona_se acepta ayudaaa
	public String[] quick_sort(String[]canciones,String pivote,String extremo) {
		
		if(canciones.length>1){
			int i=0,j=canciones.length-1,iAux=0;		
			int indice=0;
			while(pivote!=extremo && i<8 && j<8) {
			
					if(canciones[i].compareTo(canciones[j])>0) {			
						canciones[i]=canciones[j];
						canciones[j]=pivote;
						indice=j;
						extremo=canciones[i];					
						iAux=i;
						i=j;
						j=iAux;
					}							
					else if(canciones[j].compareTo(canciones[i])>0) {					
						canciones[j]=canciones[i];
						canciones[i]=pivote;
						indice=i;
						extremo=canciones[j];
						iAux=i;
						i=j;
						j=iAux;	
					}
					if(i>j) {
						j++;
					}
					else {
						j--;
					}
			}//while
			
			if(pivote!=canciones[0] && indice>1) {
				quick_sort(canciones,canciones[0],canciones[i-1]);
			}
			if(pivote!=canciones[j] && indice>1) {
				quick_sort(canciones,canciones[i-1],canciones[j]);
			}
			
		}//if
		return canciones;
	}

	public String[] merge_sort(String[]canciones) {
		
		if(canciones.length>1) {
		int i=0,j=0,h=0,o=0;
		int a=canciones.length/2;
		String []izq = new String [a];
		String []der = new String [canciones.length-a];
		
		for(i=0;i<izq.length;i++) {	
			izq[i]=canciones[o];
			o++;
		}
		
		for(i=0;i<der.length;i++) {
			der[i]=canciones[o];
			o++;
		}
		
		izq=merge_sort(izq);
		der=merge_sort(der);
		o=0;
		
		while(izq.length !=j && der.length!= h) {
			
				if(izq[j].compareTo(der[h])<0) {			
			
					canciones[o]=izq[j];
					j++;
					o++;
				}		
				
				else {					
					canciones[o]=der[h];
					h++;
					o++;
				}	
			}//while
		
			while(izq.length!=j) {
				canciones[o]=izq[j];
				j++;
				o++;
			}
			while(der.length!=h) {
				canciones[o]=der[h];
				h++;
				o++;
			}
		}
		return canciones;
	}

	public void binary_search(String []canciones,String busqueda) {
	
			int a=canciones.length;
			int m=a/2;

			String bot=canciones[0];
			String mid=canciones[m];
			String top=canciones[a-1];
			int b=0,t=a-1,mi=0;
			boolean reggister =false;
		
				while(b<=t && reggister ==false)	{
					
				mi=(b+t)/2;
				
				if(busqueda.compareTo(canciones[mi])==0 ){
					mid=busqueda;
					System.out.print("\n"+mi);
					reggister=true;
				}
				else if(busqueda.compareTo(canciones[mi])<0) {
					t =mi-1;
					
					}
				else {
					b=mi+1;
				}
			}
				if(reggister!=true) {
					System.out.print("\n-1");
				}

	}

}//Class_end
