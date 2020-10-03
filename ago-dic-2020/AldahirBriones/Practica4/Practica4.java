import javax.swing.*;
public class Practica4 
{
    public static void main(String[] args) 
    {
        String c = new String(JOptionPane.showInputDialog("cadena")); /*atrapo la cadena como string*/
        /*declaro una variable stringbuffer para convertir el string ingresado a stribgbuffer*/
        StringBuffer cadena_a_buffer = new StringBuffer(c);
        StringBuffer na= cadena_a_buffer.reverse(); /*uso el metodo reverse para escribirla al reves*/

        StringBuffer sbuf = new StringBuffer(na); /*creo una variable para que la palabra al reves la pueda volver a string*/
        String cadreversaenstring = sbuf.toString(); /* la convierto a string*/

        System.out.println(c);
        System.out.println(cadreversaenstring);

        if(c.equals(cadreversaenstring)) { /*las comparo*/
            System.out.print("SI ES PALINDROME");
        }
        else {
            System.out.print("no es palindrome");
        }

    }
}

