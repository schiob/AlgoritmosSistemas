import java.util.Scanner;

class Practica1 {
    Scanner sc = new Scanner(System.in);

    public void suma() {
        System.out.println("Introduce 2 números para sumarlos (Separalos con un espacio)");
        String a = sc.nextLine();
        String [] partes = a.split(" ");
        int x = Integer.parseInt(partes[0]);
        int y = Integer.parseInt(partes[1]);
        int suma = x + y;
        System.out.println("La suma de: " + x + " + " + y + " es igual a: " + suma);

    }
    public static void main (String [] args){
       Practica1 o = new Practica1();
       o.suma();
    }
}