import java.util.Scanner;
public class parcialDos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Cuántos libros tienes en total? y ¿Qué libro buscas?");
        String entrada = teclado.nextLine();
        String[] separacion = entrada.split(" ");
        int totalLibros = Integer.parseInt(separacion[0]);
        String libro = separacion[1];

         System.out.println("Escribe la lista de libros ");
        String entrada2 = teclado.nextLine();
        String[] books = entrada2.split(" ");

        String arr[] = new String[totalLibros];

        System.out.println("*********************************");
        System.out.println("Estos son los libros en la repisa ");

        for (int a = 0; a < totalLibros; a++) {
            arr[a] = books[a];
            System.out.print(arr[a] + " ");
        }
        System.out.println();

        //busqueda lineal que ignora el if por alguna razon.
        for(int b = 0; b < totalLibros; b++){
            //System.out.println("hola " + " " +arr[b]+ " " + libro);
            if(arr[b] == libro){
                System.out.println(arr[b]);
            }else{
                System.out.println(-1);
            }
        }
    }
}

