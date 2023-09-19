import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class practica2 {
    public static void main(String[] args) {
        //Entrada de cantidad probelmas y cantidad de tiempo
        String entrada = JOptionPane.showInputDialog(null,"Ingresa n/m (siendo / un espacio vacio)\n n = número de problemas\n m = tiempo","ENTRADA DE DATOS",JOptionPane.QUESTION_MESSAGE);
        String[] dividirEntrada = entrada.split(" ");
        int n = Integer.parseInt(dividirEntrada[0]);
        int m = Integer.parseInt(dividirEntrada[1]);

        //Entrada de los tiempos que se tarda cada problema
        String tiempo = JOptionPane.showInputDialog(null,"Ingresa el tiempo de solucion de los "+n+" problemas","ENTRADA DE DATOS",JOptionPane.QUESTION_MESSAGE);
        String[] dividirTiempo = tiempo.split(" ");
        //Transformarlos a enteros
        Integer[] t = new Integer[n];
        for (int i = 0; i< dividirTiempo.length;i++){
            t[i]=Integer.parseInt(dividirTiempo[i]);
        }

        //Ordenar los valores
        for (int j = 1; j < t.length; j++) {
            int temporal = t[j];
            int k;
            for (k = j - 1; k >= 0 && t[k] > temporal; k--) {
                t[k + 1] = t[k];
            }
            t[k + 1] = temporal;
        }

        int problemasResueltos=0;
        int tiempoAcumulado=0;
        for (int i = 0; i < t.length;i++){
            if (tiempoAcumulado + t[i]<=m){
               problemasResueltos++;
               tiempoAcumulado+=t[i];
            }else{
                break;
            }
        }

        JOptionPane.showMessageDialog(null, problemasResueltos, "Cantidad de Problemas Resuletos", JOptionPane.PLAIN_MESSAGE);
    }
}
