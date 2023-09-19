
import javax.swing.*;
import java.util.Scanner;
public class Practica2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String primeraEntrada = JOptionPane.showInputDialog(null,"Ingresar problemas a resolver y tiempo disponible ");

        //n = el número de problemas que le encargaron de tarea
        //m = el número de minutos que tiene disponible David para hacer la tarea
        String [] nm = primeraEntrada.split(" ");
        int minDisponibles = Integer.parseInt(nm[1]);
        String segundaEntrada =JOptionPane.showInputDialog(null,"Minutos que tarda David para realizar los ejercicios ");
        String [] minsXProblema = segundaEntrada.split(" "); //Cada uno de los minutos que le toma a David realizar dicho problema

        for (int j = 1; j < minsXProblema.length; j++) {
            int actual = Integer.parseInt(minsXProblema[j]);
            int i = j-1;
            while (i >= 0 && Integer.parseInt(minsXProblema[i]) > actual) {
                minsXProblema[i+1] = minsXProblema[i];
                i--;
            }
            minsXProblema[i+1] = String.valueOf(actual);
        }
        int mayorCantidad = 0; //Mayor cantidad de problemas que puede resolver
        for (String minuto : minsXProblema) {
            if(minDisponibles > 0) {
                minDisponibles -= Integer.parseInt(minuto);
                mayorCantidad++;
            }
        }
        scn.close();
        String resultado = mayorCantidad == 0 ? "0" : String.valueOf(mayorCantidad);
        JOptionPane.showMessageDialog(null, resultado);
        //Practica lista

    }
    

}

