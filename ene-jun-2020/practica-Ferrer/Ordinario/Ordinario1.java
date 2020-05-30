import java.util.*;

public class Ordinario1 {
	public static void main(String args[]) {
		
		Scanner consola = new Scanner(System.in);
		Ordinario1 metodo = new Ordinario1();
		
		int n= consola.nextInt(); //personas
		
		String m [] = new String [n+1];
		String aux [] = new String [n];
		int tamaños [] = new int [n]; 
		
		
		for(int i=0;i<m.length;i++) {
			
			m[i]=consola.nextLine();
					
		}
		
		for(int i=0;i<aux.length;i++) {
		String []espacios= m[i+1].split(" ");
		
		aux[i]=metodo.reducir(espacios);//este metodo es para limpiar el string,quitar las "x " 
										//y giones, dejar solo numeros
		}
		
		
		
		aux=metodo.merge_sort_String(aux);// este metodo ordena las cajas de menor a mayor
											//en cuanto a cantidad de dulces
		
		
		for(int i=0;i<aux.length;i++) {
		System.out.println(aux[i]);
		}
		
		
		///Sacar la suma de el tiempo
		boolean cerrar=false;
		int suma =0;
		
		for(int i=0;i<aux.length;i++) {
			
		String []espacios= aux[i].split(" ");
		
			for(int j=0;j<espacios.length;j++) {
			
				String []guiones = espacios[j].split("-");
			
					if(guiones[1].equalsIgnoreCase("X")==true) {
						suma+=Integer.valueOf(guiones[0]);
						
					}
					else {
						suma+=Integer.valueOf(guiones[0]);
						System.out.println("\n" + suma);
						cerrar=true;
						break;
					}
			}
				if(cerrar==true) {
					break;
				}
		}	
		
		
		
	}//end_main
	
	public String reducir (String[] a){
		String b="";
		int []limpio = new int[a.length];//guarda solo el valor numerico
		boolean status = false;//para saber cuando encontramos el boleto y no perder su "B"
		int aux=0;//saber cual tiene el boleto
		
		for(int i=0;i<a.length;i++) {
		String []guiones = a[i].split("-");
		limpio[i]=Integer.valueOf(guiones[0]);
		
				if(guiones[1].equalsIgnoreCase("B")==true) {
					aux=limpio[i];
				}
		}
		
		limpio=merge_sort(limpio);//decidi para ahorrar codigo primero ordenar cada dulde de menor a mayor
									//por su tiempo
		
		
		for(int i=0;i<a.length;i++) {
			if (limpio[i]==aux && status!=true) {
				b+=String.valueOf(limpio[i]+ "-B ");
				status=true;
			}
			
			else {
				b+=String.valueOf(limpio[i]+ "-X ");
			}
		}
			return b;
	}
	
	public int [] merge_sort(int []a) {
		if(a.length>1) {
		int tamaño = a.length/2;
		int izq [] = new int [tamaño];
		int der []= new int [a.length-tamaño];
		int ciclo=0;
		
		
		for(int i=0;i<izq.length;i++) {
			izq[i]=a[ciclo];
		ciclo+=1;
		}
		for(int i=0;i<der.length;i++) {
			der[i]=a[ciclo];
		ciclo+=1;
		}
		
		izq=merge_sort(izq);
		der=merge_sort(der);		
		
		int j=0,k=0;
		ciclo=0;
		
		while(izq.length!=j && der.length!=k) {
			
			if(izq[j]<der[k]) {
				a[ciclo]=izq[j];
				j++;
				ciclo++;
			}
			else {
				a[ciclo]=der[k];
				k++;
				ciclo++;
			}
		}//while
		
		while(izq.length!=j) {
			a[ciclo]=izq[j];
			j++;
			ciclo++;
		}
		while(der.length!=k) {
			a[ciclo]=der[k];
			k++;
			ciclo++;
		}
		
		}//if
		return a;
	}
	
	public String []merge_sort_String(String []a) {
		if(a.length>1) {
			int tamaño = a.length/2;
			String izq [] = new String [tamaño];
			String der []= new String [a.length-tamaño];
			int ciclo=0;
			
			
			for(int i=0;i<izq.length;i++) {
				izq[i]=a[ciclo];
			ciclo+=1;
			}
			for(int i=0;i<der.length;i++) {
				der[i]=a[ciclo];
			ciclo+=1;
			}
			
			izq=merge_sort_String(izq);
			der=merge_sort_String(der);		
			
			int j=0,k=0;
			ciclo=0;
			
			while(izq.length!=j && der.length!=k) {
				
				if(izq[j].length()<der[k].length()) {
					a[ciclo]=izq[j];
					j++;
					ciclo++;
				}
				else {
					a[ciclo]=der[k];
					k++;
					ciclo++;
				}
			}//while
			
			while(izq.length!=j) {
				a[ciclo]=izq[j];
				j++;
				ciclo++;
			}
			while(der.length!=k) {
				a[ciclo]=der[k];
				k++;
				ciclo++;
			}
			
			}//if

		return a;
	}

}//end_class
