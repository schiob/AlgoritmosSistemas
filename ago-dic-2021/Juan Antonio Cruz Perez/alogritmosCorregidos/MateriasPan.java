
import java.util.Arrays;
import java.util.Scanner;


public class MateriasPan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] datos;
        //numero de elementos
        int n = s.nextInt();
        //depuro la s
        s.nextLine();
        //defino mi arreglo de objetos
        Materia ob [] = new Materia[n];
        for (int i = 0; i < n; i++) {
            //le meto sus respectivos datos con un split
            datos = s.nextLine().split("\\s+");
            //respectivos parametros a mi objeto nombre en 0 entero en 1
        ob[i] = new Materia(datos[0],Integer.parseInt(datos[1]));
        }
        Materia arrOrd[] = MergeSort(ob);
        for (int i = 0; i < ob.length; i++) {
            System.out.println(ob[i].getNombre());
        }
        System.out.println();
        for (int i = arrOrd.length-1; i >= 0; i--) {
            System.out.println(arrOrd[i].getNombre());
        }
        
//        for (int i = 0; i < n; i++) {
//            System.out.println(ob[i].getNombre());
//        }
    }
    
    public static Materia[] MergeSort(Materia arr[]) {
        if (arr.length == 1) {
            return arr;
        }
        int middle = arr.length / 2;
        Materia izq[] = Arrays.copyOfRange(arr, 0, middle);
        Materia der[] = Arrays.copyOfRange(arr, middle, arr.length);

        izq = MergeSort(izq);
        der = MergeSort(der);

        Materia res[] = Merge(izq, der);

        return res;

    }

    public static Materia[] Merge(Materia izq[], Materia der[]) {
        Materia res[] = new Materia[izq.length + der.length];

        int r = 0, i = 0, d = 0;
        for (; r < res.length && i < izq.length && d < der.length; r++) {
            if (izq[i].getNumero() < der[d].getNumero()) {
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
