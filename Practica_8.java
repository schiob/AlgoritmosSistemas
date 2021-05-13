import java.util.Scanner;

public class Practica_8 {
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
        public static int BinarySearch(String VidOrd[],String busqueda,int left,int right){
        if (left > right) {
            return -1;
        }
        int indice = (int)Math.floor((left+right)/2);
        String elementoMedio = VidOrd[indice];
        int resultComp = busqueda.compareTo(elementoMedio);
        if (resultComp == 0) {
            return indice;
        }
        if (resultComp < 0) {
            right = indice - 1;
            return BinarySearch(VidOrd,busqueda,left,right);
        }else{
            left = indice + 1;
            return BinarySearch(VidOrd,busqueda,left,right);
        }
   }
        
       public static void main(String[]args){
        Scanner e = new Scanner(System.in);
        int cont=0;
        
        System.out.println("Ingrese el numero de videojuegos y el numero de peticiones: ");
        int n = e.nextInt();
        System.out.println("Ingrese el nombre de los videojuegos: ");
        int q = e.nextInt();
        int izq = 0,der;
        String dato[] = new String[q];
        String videojuegos [] = new String[n];
        der = videojuegos.length-1;
        for (int i = 0; i < n; i++) {
            videojuegos[i] = e.next();
           }
        QuickSort(videojuegos,0,n-1);
        String VidOrd[] =  videojuegos;
        for (int i = 0; i < n; i++) {
            System.out.print(videojuegos[i]+" ");
        }
        System.out.println("");
        int num[] = new int[q];
            for (int i = 0; i < VidOrd.length && i < num.length; i++){
 
            System.out.println("Nombre del videojuego " + cont +" a buscar:");
            cont ++;
            VidOrd[i]= e.next();
             BinarySearch(VidOrd,dato[i],izq,der);
        }
            
           for (int j = 0; j < q; j++) { 
               System.out.println(BinarySearch(VidOrd,dato[j],izq,der));
           }
     
    }
  }
