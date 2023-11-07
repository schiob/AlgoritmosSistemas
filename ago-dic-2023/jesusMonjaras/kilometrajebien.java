import java.util.Scanner;

public class kilometrajebien {

    public static void quickSort(String[][] autos, int menor, int mayor) {
        if (menor < mayor) {
            int pi = particion(autos, menor, mayor);

            quickSort(autos, menor, pi - 1);
            quickSort(autos, pi + 1, mayor);
        }
    }

    private static int particion(String[][] autos, int menor, int mayor) {
        int pivote = Integer.parseInt(autos[mayor][1]);
        int i = (menor - 1);

        for (int j = menor; j < mayor; j++) {
            int kmActual = Integer.parseInt(autos[j][1]);
            if (kmActual >= pivote) {
                i++;
                String[] temp = autos[i];
                autos[i] = autos[j];
                autos[j] = temp;
            }
        }

        String[] temp = autos[i + 1];
        autos[i + 1] = autos[mayor];
        autos[mayor] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Numero de autos:");
        int numAutos = Integer.parseInt(scn.nextLine());

        String[][] autos = new String[numAutos][2];

        System.out.println("Ingresa modelo y km de auto separado por espacio:");
        for (int i = 0; i < numAutos; i++) {
            String entrada = scn.nextLine();
            autos[i] = entrada.split(" ");
        }

        quickSort(autos, 0, autos.length - 1);

        for (String[] auto : autos) {
            System.out.print(auto[0] + " ");
        }

        scn.close();
    }
}

