
package algoritmos;
import java.util.Scanner;
public class Ordi_Prob1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String cajas[] = new String[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            cajas[i] = in.nextLine();
        }
        QuickSort(cajas,0,n-1);
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.println(cajas[i]);
        }
    }
    public static void QuickSort(String m[],int inferior,int superior){
        int izquierda,derecha;
        String mitad,x;
        izquierda = inferior;
        derecha = superior;
        mitad = m[(izquierda+derecha)/2];
        do{
            while(m[izquierda].length() < mitad.length() && izquierda<superior ){
                izquierda++;
            }
            while(mitad.length() < m[derecha].length() && derecha>inferior){
                derecha--;
            }
            if (izquierda <= derecha) {
                x = m[izquierda];
                m[izquierda] = m[derecha];
                m[derecha] = x;
                izquierda++;
                derecha--;
            }
        }while(izquierda <= derecha);
        if (inferior < derecha) {
            QuickSort(m,inferior,derecha);
        }
        if (izquierda < superior) {
            QuickSort(m,izquierda,superior);
        }
    }
}
