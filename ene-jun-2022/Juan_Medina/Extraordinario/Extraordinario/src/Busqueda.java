package Extraordinario.src;
public class Busqueda {

public static void main(String[] args) {

        String palabras = "a a12 b2 text2 text2a text2a2 text2a12";
        String arr[] = palabras.split(" ");
        String buscar = "a1222";

        int buscar_posicion = Encuentra_palabra(arr,buscar);

        System.out.println("---- La posición de la palabra buscada es: --------");
        System.out.println(buscar_posicion  != -1 ? arr[buscar_posicion ] + "\n Posicion " + (buscar_posicion  + 1) : " -1 ");
    }

    public static int Encuentra_palabra (String[] a, String dato) {
        int inicio= 0;
        int fin = a.length - 1;
        int mitad;

        while (inicio <= fin) {
            mitad= (inicio+fin) / 2;

            if (a[mitad].compareTo(dato) < 0) {
                inicio = fin + 1;
            } else if (a[mitad].compareTo(dato) > 0) {
                fin = mitad - 1;
            } else {
                return mitad;
            }
        }
    return -1;
    }
    
}