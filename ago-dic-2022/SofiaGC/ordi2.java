/*En este problema lo que se busca es encontrar el articulo que Panchito quiere
 * lo que se puede lograr a traves de la busqueda binaria ya que la lista de 
 * articulos ya esta ordenada. Lo que hara la busqueda binaria es partir la lista en 2
 * y buscara primero el articulo en la mitad, si no ira a la mitad derecha o a la izquierda 
 * dependiendo que tan grande sea el articulo dentro de la lista
 */

import java.util.Scanner;
public class ordi2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el numero de articulos que hay en la lista ");
        int numArticulos = teclado.nextInt();
        System.out.println();
        
        teclado.nextLine();

        System.out.println(" Escribe el nombre del articulo que busca Panchito ");
        String panchito = teclado.nextLine();
        System.out.println();

        System.out.println("Escribe la lista de los articulos junto con su precio ");
        String listaArticulos[] = new String[numArticulos];
        String entrada = teclado.nextLine();
        for (int i = 0; i < numArticulos; i++) {
            listaArticulos[i] = teclado.nextLine();
        } 
        System.out.println();

        int a = binarySearch(listaArticulos, panchito);
        System.out.println("El articulo se encuentra en la posicion " + a + " de la lista de articulos");
    }
    static int binarySearch(String[] arr, String x){
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
 
            // Revisa si el articulo esta en la mitad
            if (res == 0)
                return m;
 
            // Si el articulo es mayor se ignora la mitad izquierda
            if (res > 0)
                l = m + 1;
 
            // Si el articulo es menor se ignora la mitad derecha
            else
                r = m - 1;
        }
 
        return -1;
    }
}
