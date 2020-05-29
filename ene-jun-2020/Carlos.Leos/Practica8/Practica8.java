package Clase;
import java.util.Scanner;
public class Practica8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String [][][][] num_repisa = new String [3][5][10][5];

        boolean estampilla = true;

        System.out.println("ingresa  el numero de las  repisas, la cantidad de libros y el total de sus paginas");
        String valores;

        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 5; j++)
            {
                valores = s.nextLine();
                String [] espacios = valores.split(" ");

                for (int k = 0; k < 10; k++)
                {
                   num_repisa [i][j][k] = espacios[k].split(",");
                }
            }
            valores = s.nextLine();
        }

        int temporal1 = 1;
        int temporal2 = 1;
        int temporal3 = 1;
        int temporal4 = 1;

        String numero = s.nextLine();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                for (int k = 0; k < 10; k++)
                {
                    for (int l = 0; l < 5; l++)
                    {
                        if (numero.compareTo(num_repisa[i][j][k][l]) == 0)
                        {
                            estampilla = false;

                            temporal1+=i;
                            temporal2+=j;
                            temporal3+=k;
                            temporal4+=l;
                        }
                    }   
                }   
            }
        }

        if (estampilla)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println("Se encuentra en la repisa numero: " + temporal1 + 
                    ", el libro: " + temporal2 + ", la pagina: " + temporal3 + ", y la posición: " + temporal4);
        }

    }
}