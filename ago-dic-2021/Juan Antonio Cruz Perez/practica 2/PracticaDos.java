package practicas;

import java.util.Scanner;

public class PracticaDos {

    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        Scanner sw = new Scanner (System.in);
        String s ="";
//ingresar numeros a la lista separados por espacio
                s = sw.nextLine();
        String num[] = s.split("\\s+");
             //total de probleas
        for (int i = 0; i < num.length; i++) {
            lista.preppend(Integer.parseInt(num[i]));
        }
        
        System.out.println("--------------------- ");
        
        lista.imprimir();

        System.out.println("--------------------");
        lista.quitaInPares();
        lista.imprimir();

    }
}
