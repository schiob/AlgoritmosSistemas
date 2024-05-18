import java.util.Scanner;
public class Practica2 {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 números: \n-El primer número será la cantidad de problemas que tienes que hacer." +
        "\n-El segundo número el tiempo en minutos que dispones para hacerlos." +
         "\n -----------------------------------------------------------------");
        String a = sc.nextLine();
        String [] partes = a.split(" ");
        int problemas = Integer.parseInt(partes[0]);
        @SuppressWarnings("unused")
        int tiempo = Integer.parseInt(partes[1]);
        int ord[] = new int [problemas];

        System.out.println("Ahora introduce el tiempo en minutos que te toma cada problema separado por espacios:");
        a = sc.nextLine();
        String [] minutos = a.split(" ");

        ord[0] = Integer.parseInt(minutos[0]);
        for (int y = 1; y < problemas; y++) {
            int temp = Integer.parseInt(minutos[y]);
            int x = y - 1;
        
            while (x >= 0 && ord[x] > temp) {
                ord[x + 1] = ord[x];
                x--;
            }
            ord[x + 1] = temp;
        }

        int i = 0;
        int total = 0;
        while (total < problemas) {
        total = total + ord[i];
        i++;
        }
        if (total > problemas) {
        System.out.println("Puedes realizar un total de: " + i + " problemas.");
        } else {System.out.println("Puedes realizar exactamente " + problemas + " problemas.");}
        sc.close();

    }
}
