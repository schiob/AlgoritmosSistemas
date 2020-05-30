
package algoritmos;
import java.util.Scanner;
public class Ordi_Prob1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String cajas[] = new String[n];
        int tiempo = 0,b=0;
        
        in.nextLine();
        for (int i = 0; i < n; i++) {
            cajas[i] = in.nextLine();
        }
        QuickSort(cajas,0,n-1);
        System.out.println("");
        for (int i = 0; i < n; i++) {
            String sub;
            String aux[] = cajas[i].split(" ");
            int segundos[] = new int[aux.length];
            
            for (int j = 0; j < aux.length; j++) {
                sub=aux[j].substring(0, aux[j].length()-2);             
                segundos[j] = Integer.valueOf(sub);                
            }
            
            QuickSort2(aux,segundos,0,aux.length-1);
            
            for (int j = 0; j < aux.length; j++) {
                if(aux[j].charAt(aux[j].length()-1) != 'B'){
                    tiempo += segundos[j];
                }
                else{
                   tiempo += segundos[j];
                   b=1;
                   break;
                }
            }
            if(b==1){
                break;
            }
        }
        System.out.println(tiempo);
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
    
        public static void QuickSort2(String m[],int seg[],int inferior,int superior){
        int izquierda,derecha;
        int mitad,a;
        String x;
        izquierda = inferior;
        derecha = superior;

            mitad = seg[(izquierda+derecha)/2];
            
        do{
            while(seg[izquierda] < mitad && izquierda<superior ){
                izquierda++;
            }
            while(mitad < seg[derecha] && derecha>inferior){
                derecha--;
            }
            if (izquierda <= derecha) {
                x = m[izquierda];
                m[izquierda] = m[derecha];
                m[derecha] = x;
                a = seg[izquierda];
                seg[izquierda] = seg[derecha];
                seg[derecha] = a;
                izquierda++;
                derecha--;
            }
        }while(izquierda <= derecha);
        if (inferior < derecha) {
            QuickSort2(m,seg,inferior,derecha);
        }
        if (izquierda < superior) {
            QuickSort2(m,seg,izquierda,superior);
        }
    }
}
