
import java.util.Scanner;



public class QuickSortO {

 
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        String [] datos;
        //numero de elementos
        int n = s.nextInt();
        //depuro la s
        s.nextLine();
        //defino mi arreglo de objetos
        Cartas ob [] = new Cartas[n];
        for (int i = 0; i < n; i++) {
            //le meto sus respectivos datos con un split
            datos = s.nextLine().split("\\s+");
            //respectivos parametros a mi objeto nombre en 0 entero en 1
        ob[i] = new Cartas(Integer.parseInt(datos[0]),datos[1]);
        }

        //Llamada Metodo de Ordenamiento QuickSort
        Quicksort(ob, 0, ob.length - 1);

        //Metodo para imprimir Vector Ordenado
        ImprimirVector(ob);
    }

    //Metodo de Ordenamiento QuickSort
    public static void Quicksort(Cartas numeros[], int izq, int der) {
        /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/

        //Se toma como pivote el primer valor
        int pivote = numeros[izq].getValor();

        //Se definen los dos lados y un auxiliar
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (numeros[i].valor <= pivote && i < j) {
                i++;
            }

            while (numeros[j].getValor() > pivote) {
                j--;
            }

            if (i < j) {
                aux = numeros[i].getValor();
                numeros[i] = numeros[j];
                numeros[j].setValor(aux);
            }
        }

        numeros[izq] = numeros[j];
        numeros[j].setValor(pivote);

        if (izq < j - 1) {
            Quicksort(numeros, izq, j - 1);
        }

        if (j + 1 < der) {
            Quicksort(numeros, j + 1, der);
        }
    }

    public static void ImprimirVector(Cartas arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
