import java.util.Scanner;

	public class libros {
		public static void main(String Args[]) {
			Scanner sc = new Scanner(System.in);
			int n, auxb;
			String nompeli, aux;
			
			System.out.println("Numero de libros que tiene");
			n = sc.nextInt();
			
			String a[] = new String [n];
			int b[] = new int [n];
			
			for(int i=0; i<a.length; i++) {
				System.out.print("Nombre del libro");
				System.out.println(" y numero de paginas");
				a[i]=sc.next();
				b[i]=sc.nextInt();
			}
			
			for(int i=0; i<(a.length-1); i++) {
				for(int j=0; j<(a.length-1); j++) {
					if(b[j] > b[j+1]) {
						auxb = b[j];
						aux = a[j];
						b[j] = b[j+1];
						a[j] = a[j+1];
						b[j+1]=auxb;
						a[j+1]=aux;
					}
				}
			}
			
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i]+" ");
			}
		}

}
