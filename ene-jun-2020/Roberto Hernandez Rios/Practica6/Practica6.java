
package algoritmos;
import java.util.Scanner;
public class Practica6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int izq = 0,der;
        String dato[] = new String[q];
        String medicinas [] = new String[n];
        String res[] = new String[q];
        der = medicinas.length-1;
        int i;
        for (i = 0; i < n; i++) {
            medicinas[i] = in.next();
        }
        QuickSort(medicinas,0,n-1);
        for (int j = 0; j < q; j++) {
            dato[j] = in.next();
            BinarySearch(medicinas,dato[j],izq,der);
        }
        for (int j = 0; j < q; j++) {
            System.out.println(BinarySearch(medicinas,dato[j],izq,der));
        }
   }
    public static void QuickSort(String m[],int inferior,int superior){
        int izquierda,derecha;
        String mitad,x;
        izquierda = inferior;
        derecha = superior;
        mitad = m[(izquierda+derecha)/2];
        do{
            while(m[izquierda].compareTo(mitad)<0 && izquierda<superior){
                izquierda++;
            }
            while(mitad.compareTo(m[derecha])<0 && derecha>inferior){
                derecha--;
            }
            if (izquierda <= derecha) {
                x = m[izquierda];
                m[izquierda] = m[derecha];
                m[derecha] = x;
                izquierda++;
                derecha--;
            }
        }while(izquierda<=derecha);
        if (inferior < derecha) {
            QuickSort(m,inferior,derecha);
        }
        if (izquierda < superior) {
            QuickSort(m,izquierda,superior);
        }
    }
    public static int BinarySearch(String arr[],String busqueda,int left,int right){
        if (left > right) {
            return -1;
        }
        int indice = (int)Math.floor((left+right)/2);
        String elementoMedio = arr[indice];
        int resultComp = busqueda.compareTo(elementoMedio);
        if (resultComp == 0) {
            return indice;
        }
        if (resultComp < 0) {
            right = indice - 1;
            return BinarySearch(arr,busqueda,left,right);
        }else{
            left = indice + 1;
            return BinarySearch(arr,busqueda,left,right);
        }
    }
}

