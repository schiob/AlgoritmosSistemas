package parcial_1;
import java.util.Scanner;

//Ernesto Burciaga Aguirre 17528944 Programa 1

public class Parcial2Problema1 {

	public static int busqueda(String []arreglo, String dato){
		 int posicion = -1;
		 
		 for(int i = 0; i < arreglo.length; i++) {
			 if(arreglo[i].compareTo(dato) == 0){
				 posicion = i;
		    break;
		   }
		 }
		 return posicion;
		}
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Scanner n1 = new Scanner(System.in);
		
		System.out.print("Numero de libros total y el libro que quieres buscar: \n");
		int size = n.nextInt();
		String dato = n1.nextLine();
		
		String []arr = new String[size];
		System.out.print("\nNombre de los libros: ");
		
		for(int i = 0; i<size; i++) {
			arr[i] = n1.next();
		}
		int result = busqueda(arr,dato);
		
		  
        if (result == -1)
            System.out.println("El libro no se encuentra");
        else
            System.out.println("Se encontró en la posicion: " + (result + 1));
		
		

	}

}
