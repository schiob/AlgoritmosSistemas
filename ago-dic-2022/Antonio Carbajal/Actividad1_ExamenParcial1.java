package Examen_1Parcial;

public class Actividad1_ExamenParcial1 {
	public static void main(String[] args) {

		MergeSort mergeSort = new MergeSort();
        String arr [] = {"naproxeno", "paracetamol", "rimantadina", "azitromicina", "ibuprofeno"};
        int n = arr.length;

        System.out.println("Array original:");
        for (String value : arr) {
            System.out.print(value + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        mergeSort.sort(arr,0,n-1);
        mergeSort.ArregloImpreso(arr);
    }
	

}
