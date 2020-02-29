
package algoritmos;
import java.util.Scanner;
public class Parcial_1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String pelis [] = new String[n];
        String pelisOrd;
        int h,m;
        int horas [] = new int[n];
        int minutos [] = new int[n];
        for (int i = 0; i < n; i++) {
            pelis[i]=in.next();
            horas[i] = in.nextInt();
            minutos[i] = in.nextInt();
        }
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (n-1); j++) {
            if(horas[j] > horas[j+1]){
                pelisOrd = pelis[j];
                h = horas[j];
                m = minutos[j];
                pelis[j] = pelis[j+1];
                pelis[j+1] = pelisOrd;
                horas[j] = horas[j+1];
                horas[j+1] = h;
                minutos[j] = minutos[j+1];
                minutos[j+1] = m;
            }
            else if (horas[j] == horas[j+1]) {
                if(minutos[j] > minutos[j+1]){
                    pelisOrd = pelis[j];
                    h = horas[j];
                    m = minutos[j];
                    pelis[j] = pelis[j+1];
                    pelis[j+1] = pelisOrd;
                    horas[j] = horas[j+1];
                    horas[j+1] = h;
                    minutos[j] = minutos[j+1];
                    minutos[j+1] = m;     
                }
            }
                else if (minutos[j] == minutos[j+1]) {
                    if(pelis[j].length() > pelis[j+1].length()){
                        pelisOrd = pelis[j];
                        pelis[j] = pelis[j+1];
                        pelis[j+1] = pelisOrd;
                    }
                }         
            }
        }        
        for (int k = 0; k < n; k++) {
            System.out.print(pelis[k]+" ");
        }
    }
}
