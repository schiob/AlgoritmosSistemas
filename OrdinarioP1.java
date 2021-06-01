package ordinario;
import java.util.Scanner;
public class Ordenador {
   
public static void main(String[] args) {

Scanner UsrIn = new Scanner(System.in);
System.out.print("Cual es el numero de plumones? ");
int numeroelementos = UsrIn.nextInt();

if( (numeroelementos < 0) || (numeroelementos > 500)) {

System.out.print("Numero de plumones no soportado. Fin.");
System.exit(0);
}

//# de plumones - 3 columnas para cada entrada
String [][] Plumones = new String[numeroelementos][2];

String UnColor;
String [] Color;
System.out.print("Para cada color proporcione Nombre-Dilusion");
UsrIn.nextLine();
System.out.println("");

for (int i = 0; i < numeroelementos; i++) {
   System.out.print("Color [" + i + "] ");
   UnColor = UsrIn.nextLine();
   //System.out.println("Color ["  + UnColor + "]");
   Color = UnColor.split("-");
 
   Plumones[i][0] = Color[0];
   Plumones[i][1] = Color[1];
}

OrdenadorMerge Tarea = new OrdenadorMerge(Plumones);
Tarea.ordena(Plumones, 0,(Plumones.length)/2, Plumones.length - 1);
System.out.println("Resultado ["  + Tarea.print() + "]");
    }
} 
