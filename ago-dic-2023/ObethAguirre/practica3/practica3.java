import java.util.Arrays;
import java.util.Scanner;
public class practica3 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        //ENTRADA
        int n;
        System.out.println("Cantidad de pokemones\n (1 <= n <= 50)");
        n=s.nextInt();
        s.nextLine();
        Integer[] ni = new Integer[n];
        System.out.println("Poderes de los "+n+" pokemones\n (1 <= ni <= 2000)");
        String[] poderes = s.nextLine().split(" ");

        //PROCESO
        for (int i=0; i<n; i++){
            ni[i]=Integer.parseInt(poderes[i]);
        }

        //ORDENAR DE MAYOR A MENOR
        for (int j = 1; j < ni.length; j++) {
            int temporal = ni[j];
            int k;
            for (k = j - 1; k >= 0 && ni[k] < temporal; k--) {
                ni[k + 1] = ni[k];
            }
            ni[k + 1] = temporal;
        }

        //RESULTADO
        System.out.println("Poderes de los pokemones\n"+Arrays.toString(ni));

    }
}
