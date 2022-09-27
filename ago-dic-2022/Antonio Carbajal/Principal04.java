package Actividades;

public class Principal04 {
	/*NOTA:Como pude ver tengo unos errores dentro del metodo merge y además no está con los parametros que usted quiere 
	 * para la insersión de valores de entrada por ende el lunes le entrego algunos programas hechos en java ya
	 * corregidos a cómo está en la rubrica de valuación el día lunes 3 de Octubre que es el día del examen parcial
	 * muchas gracias por su comprensión.*/
	public static void main(String[] args) {

		Tarea04_MergeSort mergeSort = new Tarea04_MergeSort();
        String arr [] = {"text2aS","text2","tect2a12","a","a12","text2a2","b2"};
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
