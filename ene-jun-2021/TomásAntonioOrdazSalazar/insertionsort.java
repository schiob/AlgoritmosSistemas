package algoritmos;

import java.util.Scanner;

public class insertionsort {
 public static void main (String Args[]) {
	 Scanner sc = new Scanner(System.in);
	 int a[] = new int [20],n,x,aux,i,par,imp;
	 System.out.println("digite su arreglo");
	 for(i=0;i<a.length;i++) {
		 System.out.println("digite el numero "+(i+1)+" de su arreglo: ");
		 a[i]=sc.nextInt();
	 }
	 for(i=0;i<a.length;i++){
		 x=i;
		 aux=a[i];
		 while(x>0 && a[x-1]<aux) {
			 a[x]=a[x-1];
			 x--;
		 }
		 a[x]=aux;
	 }
	 System.out.println();
	 for(i=0; i<a.length;i++) {
		 if((a[i]%2)==0) {
			 System.out.print(a[i]+" ");
		 }
	 }
	 //for(int j:a) {
		// System.out.print(j+" ");
	 //}
	 }
 }

