
import java.util.Arrays;
import java.util.Scanner;


public class PelisMerge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] datos;
        //numero de elementos
        int n = s.nextInt();
        //depuro la s
        s.nextLine();
        //defino mi arreglo de objetos
        Pelis ob [] = new Pelis[n];
        for (int i = 0; i < n; i++) {
            //le meto sus respectivos datos con un split
            datos = s.nextLine().split("\\s+");
            //respectivos parametros a mi objeto nombre en 0 entero en 1
        ob[i] = new Pelis (datos[0],Integer.parseInt(datos[1]),Integer.parseInt(datos[2]));
        }
        Pelis arrOrd[] = MergeSort(ob);
        for (int i = 0; i < ob.length; i++) {
            System.out.println(ob[i].getNombre());
        }
        System.out.println();
        for (int i = 0; i < arrOrd.length; i++) {
            System.out.println(arrOrd[i].getNombre());
        }
        
//        for (int i = 0; i < n; i++) {
//            System.out.println(ob[i].getNombre());
//        }
    }
    
    public static Pelis[] MergeSort(Pelis arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int middle = arr.length / 2;
        Pelis izq[] = Arrays.copyOfRange(arr, 0, middle);
        Pelis der[] = Arrays.copyOfRange(arr, middle, arr.length);

        izq = MergeSort(izq);
        der = MergeSort(der);

        Pelis res[] = Merge(izq, der);

        return res;

    }

    public static Pelis[] Merge(Pelis izq[], Pelis der[]) {
        Pelis res[] = new Pelis[izq.length + der.length];

        int r = 0, i = 0, d = 0;
        for (; r < res.length && i < izq.length && d < der.length; r++) {
            if (izq[i].getDura() < der[d].getDura()) {
                res[r] = izq[i];
                i++;
            } else {
                res[r] = der[d];
                d++;
            }
        }

        for (; i < izq.length; i++) {
            res[r] = izq[i];
            r++;
        }

        for (; d < der.length; d++) {
            res[r] = der[d];
            r++;
        }
        return res;
    }
}
