/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.suma;
import java.util.Scanner;
/**
 *
 * @author Warwin02
 */
public class Suma {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese dos números separados por un espacio: ");
        
        // Leer la entrada del usuario como una cadena de texto
        String entrada = scanner.nextLine();
        
        // Dividir la entrada en dos partes utilizando el espacio como separador
        String[] partes = entrada.split(" ");
        
        // Verificar si se ingresaron dos números
        if (partes.length != 2) {
            System.out.println("Debe ingresar exactamente dos números separados por un espacio.");
        } else {
            try {
                // Convertir las partes en números
                double numero1 = Double.parseDouble(partes[0]);
                double numero2 = Double.parseDouble(partes[1]);
                
                // Calcular la suma de los números
                double suma = numero1 + numero2;
                
                System.out.println("La suma de los números es: " + suma);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese dos números válidos separados por un espacio.");
            }
        }
        
        scanner.close();
    
    }
}
