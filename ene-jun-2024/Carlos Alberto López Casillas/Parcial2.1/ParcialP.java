import java.util.Scanner;

public class ParcialP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); 
        int Q = scanner.nextInt(); 
        
        String[] Canciones = new String[N];
        for (int i = 0; i < N; i++) {
            Canciones [i] = scanner.next();
        }
        
        quickSort(Canciones, 0, N - 1);
        
    
        for (String cancion : Canciones) {
            System.out.print("\n"+cancion+" ");
        }
        System.out.println(); 
        
        
        
        
        for (int i = 0; i < Q; i++) {
            String cancionBuscar = scanner.next();
            int indice = busquedaBinaria(Canciones, cancionBuscar);
            System.out.println(indice);
        }
        
        scanner.close();
    }
    
   
    private static void quickSort(String[] arr, int bajo, int alto) {
        if (bajo < alto) {
            int pi = particion(arr, bajo, alto);
            quickSort(arr, bajo, pi - 1);
            quickSort(arr, pi + 1, alto);
        }
    }
    
    private static int particion(String[] arr, int bajo, int alto) {
        String pivote = arr[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (arr[j].compareTo(pivote) < 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;
        return i + 1;
    }
    

    private static int busquedaBinaria(String[] arr, String Buscada) {
        int bajo = 0;
        int alto = arr.length - 1;
        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;
            int resultado = arr[medio].compareTo(Buscada);
            if (resultado == 0) {
                return medio; 
            } else if (resultado < 0) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
        }
        return -1; 
    }
}
