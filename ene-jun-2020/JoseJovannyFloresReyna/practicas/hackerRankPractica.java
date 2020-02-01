package parcial1;

import java.util.Scanner;


public class hackerRankPractica {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		int [] a={3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78};
		
		for(int i=0; i<a.length; i++){
			int pos = i;
			int aux = a[i];
			while((pos>0) && (a[pos-1]>aux)){
				a[pos]=a[pos-1];
				pos--;
			}
			a[pos]=aux;
		}
			
		for(int i=(a.length-1); i>=0; i--){
			if(a[i]%2==0){
			System.out.print(a[i]+" ");
			}
		}		 

	}

}
