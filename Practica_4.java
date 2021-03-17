package practicas_;
import java.util.Scanner;

public class Practica_4 {
        public static void main(String[] args) {
        int Objetos;
        int cont = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos objetos son?");
        Objetos = entrada.nextInt();

            String material[] = new String[Objetos];
            int num[] = new int[Objetos];
            for (int i = 0; i < material.length && i < num.length; i++){

            System.out.println("Nombre del objeto: " + cont);
            material[i] = entrada.next();

            System.out.println("Cantidad de esta objeto en el almacen: ");
            num[i] = entrada.nextInt();

            if (num[i] < 1 || num[i] > 100) {
            }
            cont++;
        }
        int var;
        String var2 = "";

        for (int i = 1; i < num.length; i++)
        {  var = num[i];
            var2 = material[i];
           
            int j = 0;

            for ( j = i-1; j > -1 && num[j] < var  ; j--) 
            {  num[j+1] = num[j];
                material[j+1] = material[j];
              }
            num[j+1] = var;
            material[j+1] = var2;
           }
        
             System.out.println(cont);
             for (int i = 0; i < material.length; i++) {
             System.out.print(material[i] + " ");          
        }

     }
  }

    