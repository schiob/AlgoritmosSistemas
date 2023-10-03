import javax.swing.*;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner guardar = new Scanner(System.in);
        JOptionPane.showMessageDialog(null,"Ingresa dos numeros separados");
        String entrada=guardar.nextLine();
        String[] numeros = entrada.split(" ");
        JOptionPane.showMessageDialog(null,"La suma es ");
        System.out.println(Integer.parseInt(numeros[0])+Integer.parseInt(numeros[1]));
    }
}



