import java.util.Scanner;
public class Practica_9 {
public static void main(String[] args) {
        Scanner e =new Scanner(System.in);
        String [][][][] repisa = new String [3][5][10][5];

        System.out.println("Ingrese el numero de las  repisas, la cantidad de libros y el total de sus paginas");
        boolean estamp = true;
        String val;
        int var = 1;
        int var2 = 1;
        int var3 = 1;
        int var4 = 1;


        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 5; j++)
            {
                val = e.nextLine();
                String [] espacio = val.split(" ");

                for (int k = 0; k < 10; k++)
                {
                   repisa [i][j][k] = espacio[k].split(",");
                }
            }
            val = e.nextLine();
        }  

        String numero = e.nextLine();

        for (int i = 0; i < 3; i++)
        { for (int j = 0; j < 5; j++)
            {for (int k = 0; k < 10; k++)
                {for (int l = 0; l < 5; l++)
                    {if (numero.compareTo(repisa[i][j][k][l]) == 0)
                        {estamp = false;
                            var+=i;
                            var2+=j;
                            var3+=k;
                            var4+=l;
                        }
                    }   
                }   
            }
        }

        if (estamp)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println( var + " " + var2 +" "+ var3 + " "+ var4 + "" );
                  
        }
    }
}