package practica4;


import java.util.Scanner;


public class PRACTICA4 {

    
   private Scanner teclado;
    private String[] nombres;
    int n;

    public void leerDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Dame el numero de nombres a ingresar:\n");
        n = entrada.nextInt();

        teclado = new Scanner(System.in);
        nombres = new String[n];
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre:");
            nombres[i] = teclado.next();
        }
    }

    public void ordenar() {
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4 - j; i++) {
                if (nombres[i].compareTo(nombres[i + 1]) > 0) {
                    String aux;
                    aux = nombres[i];
                    nombres[i] = nombres[i + 1];
                    nombres[i + 1] = aux;
                }
            }
        }
    }

    public void imprimirInfo() {
        System.out.println("NOMBRES ORDENADOS DE A - Z:"); 
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
    
}