import java.util.Scanner;
public class Practica1 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        String entrada = teclado.nextLine();
        String[] separacion = entrada.split(" ");


        System.out.println(Integer.parseInt(separacion[0])+Integer.parseInt(separacion[1]));
    }  
}
