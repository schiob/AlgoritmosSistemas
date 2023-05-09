package Pruebas;

public class Busqueda_Sec {
	 public static void main(String[] args) {
	        String[] libros = {"Calculo2Deitel", "CalculoForDummies", "AlgebraLineal", "TeoríaDeNúmeros", "TheMangaGuideToCalculus"};
	        String libroBuscado = "CalculoForDummies";
	        int indiceLibro = busquedaSecuencial(libros, libroBuscado);
	        if (indiceLibro == -1) {
	            System.out.println(indiceLibro);
	        } else {
	            System.out.println(indiceLibro + 1);
	        }
	    }

	    public static int busquedaSecuencial(String[] array, String elemento) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i].equals(elemento)) {
	                return i;
	            }
	        } 
	        return -1;
	    }
}
