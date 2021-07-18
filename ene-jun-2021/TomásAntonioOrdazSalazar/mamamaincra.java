package algoritmos;

import java.util.Scanner;

public class mamamaincra {
	public static void main(String Args[]) {
		Scanner sc= new Scanner(System.in);
		boolean s = false;
		int n, objs,pos,aux;
		String po,au;
		do { //cantidad de objetos
			System.out.println("escriba el numero de objetos que tiene  1 <= n <= 50 ");
			n = sc.nextInt();
			if(n>=1 && n<=50) {
				s = true;
			}
			else {
				s = false;
			}
		}while(s!=true);
		s=false;
		String a[] = new String [n];
		int b[] = new int[n];
		
		for(int i=0; i<a.length; i++) { //pedir objetos
			System.out.print("nombre del objeto "+(i+1)+": ");
			a[i]=sc.next();
			do{
			System.out.print("cantidad de objeto "+(i+1)+": ");
			objs=sc.nextInt();
			if(objs>=1 && objs <=100) {
			b[i]=objs;
			s=true;
			}
			else {
				s=false;
			}
			}while(s!=true);
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++){//ordenar objetos mayor, menor
			 pos=i;
			 au=a[i];
			 aux=b[i];
			 while(pos>0 && b[pos-1]<aux) {
				 a[pos]=a[pos-1];
				 b[pos]=b[pos-1];
				 pos--;
			 }
			 a[pos]=au;
			 b[pos]=aux;
		 }
		for(String j:a) {//imprimir en orden
			System.out.print(j+" ");
		 }
		
	}
}
