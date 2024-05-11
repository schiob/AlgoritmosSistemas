import java.util.Scanner;

public class P6Intento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
  
        String[] medicinas = scanner.nextLine().split(" ");

    
        quickSort(medicinas, 0, medicinas.length - 1);

   
        for (String medicina : medicinas) {
            System.out.print(medicina + " ");
        }
        System.out.println();
        
        
        scanner.close();
    }


    private static void quickSort(String[] array, int bajo, int alto) {
        if (bajo < alto) {
            int pi = particion(array, bajo, alto);
            quickSort(array, bajo, pi - 1);
            quickSort(array, pi + 1, alto);
        }
   
    }

    private static int particion(String[] array, int bajo, int alto) {
        String pivote = array[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (array[j].compareTo(pivote) < 0) {
                i++;
                String temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        String temp = array[i + 1];
        array[i + 1] = array[alto];
        array[alto] = temp;
        return i + 1;
    }
}