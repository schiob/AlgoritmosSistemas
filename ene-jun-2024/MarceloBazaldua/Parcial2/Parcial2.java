

import java.util.Scanner;

public class Parcial2 {
    public int buscar(String arreglo[], String lib){
        boolean search = false;
        lib.trim();
        for(int i = 0; i < arreglo.length && search == false; i++){
            if (lib.equalsIgnoreCase(arreglo[i])) {
                search = true;
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parcial2 busc = new Parcial2();

        System.out.println("Numero de libros a ingresar:");
        int n = scanner.nextInt();
        scanner.nextLine();

        String arrlib[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nombre del libro " + (i + 1) + ":");
            arrlib[i] = scanner.nextLine();
        }

        System.out.println("¿Qué libro estás buscando?");
        String bl = scanner.nextLine();
        int x = busc.buscar(arrlib, bl);
        if(x != -1){
            System.out.println(bl + " se encuentra en la posición " + (x+1));
        } else {
            System.out.println("Ese libro no está en la lista");
        }
    }
}
