import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa las tareas que te encargaron y minutos que tienes para hacerlo");
        String entrada = teclado.nextLine();

        // Separo los numeros con espacios entre ellos
        String[] separacion = entrada.split(" ");
        int numTareas = Integer.parseInt(separacion[0]);
        int minTot = Integer.parseInt(separacion[1]);

        System.out.println("Ingresar los minutos por tarea ");
        String entrada2 = teclado.nextLine();
        String[] minutosXtareas = entrada2.split(" ");

        int arr[] = new int[numTareas];

        for (int a = 0; a < numTareas; a++) {
            arr[a] = Integer.parseInt(minutosXtareas[a]);
        }

        //Acomodo el arreglo
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Reviso cuantas tareas podra hacer
        int Tarea = 0;
        int sum = 0;
        int u = arr.length;

        for (int x = 0; x < u; x++) {
            sum = sum + arr[x];
            if (sum <= minTot) {
                Tarea++;
            }
        }
        System.out.println("***********************************************");
        System.out.println("Podrás hacer " + Tarea + " tareas en " + minTot + " minutos");
        System.out.println("***********************************************");
    }
    
    //Insertion Sort :p
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int temp = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > temp)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = temp;
        }
    }

}
