package Ordinario.src;



import java.util.Scanner;
public class Ordinario {
    static Scanner s = new Scanner(System.in);
    
    public static String[] quickSort(String[] x){
        if(x.length == 1 || x.length == 0){
            return x;
        }
        else{

            int izq = 0, der = 0;
            String nombre[] = new String[x.length];
            String[] izquierdo, derecho;
            String colores = "Rojo, Anaranjado, Amarillo, Verde, Indigo, Violeta, Azul";

            //Dilución de los colores.

            int dilucion[] = new int[x.length];
            
            for (int i = 0; i < x.length; i++) {

                //Función Split que separa por guión

                String a[] = x[i].split("-");
                nombre[i] = a[0];
                dilucion[i] = Integer.parseInt(a[1]);
            }
            

            //Se declara pivote y le asignamos el valor a la dilución

            String pivote_Nombre = nombre[0];

            int pivote_Dilucion = dilucion[0];
            
            for (int i = 1; i < x.length; i++) {
                if(colores.indexOf(nombre[i]) < colores.indexOf(pivote_Nombre)){
                    izq++;
                }
                else if(colores.indexOf(nombre[i]) == colores.indexOf(pivote_Nombre) && dilucion[i] < pivote_Dilucion){
                    izq++;
                }
                else{
                    der++;
                }
            }
            
            izquierdo = new String[izq];
            derecho = new String[der];
            izq = 0; der = 0;
            
            for (int i = 1; i < x.length; i++) {
                if(colores.indexOf(nombre[i]) < colores.indexOf(pivote_Nombre)){
                    izquierdo[izq] = nombre[i] + "-" + dilucion[i];
                    izq++;
                }
                else if(colores.indexOf(nombre[i]) == colores.indexOf(pivote_Nombre) && dilucion[i] < pivote_Dilucion){
                    izquierdo[izq] = nombre[i] + "-" + dilucion[i];
                    izq++;
                }
                else{
                    derecho[der] = nombre[i] + "-" + dilucion[i];
                    der++;
                }
            }
            

            //Se acomodan por el metodo ambas partes
            
            String y[] = quickSort(izquierdo);
            String z[] = quickSort(derecho);
            int c = 0;
            for (int i = 0; i < y.length; i++) {
                x[c] = y[i];
                c++;
            }
            x[c] = pivote_Nombre + "-" + pivote_Dilucion;
            c++;
            for (int i = 0; i < z.length; i++) {
                x[c] = z[i];
                c++;
            }
            return x;
        }
    }

    //Metodo Main
    
    public static void main(String[] args) {
        String entrada[];
        int n = Integer.parseInt(s.nextLine());
        entrada = new String[n];
        for (int i = 0; i < n; i++) {
            entrada[i] = s.nextLine();
        }
        
        String x[] = quickSort(entrada);
        
        System.out.println();
        for (int i = 0; i < entrada.length; i++) {
            System.out.println(x[i]);
        }
    }
    
}