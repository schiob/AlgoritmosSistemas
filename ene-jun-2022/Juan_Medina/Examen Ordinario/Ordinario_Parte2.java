import java.util.Scanner;
public class Ordinario_Parte2 {
    static Scanner s = new Scanner(System.in);
    
    public static int binarySearch(String[] x, int[] y, String nombre, int dilucion, int min, int max, int anterior){
        int mitad = (int)((max + min)/2);
        boolean temp = false;
        String colores = "Rojo, Anaranjado, Amarillo, Verde, Indigo, Violeta, Azul";
        if(mitad==anterior){
            mitad++;
            temp=true;
        }
        if (colores.indexOf(x[mitad]) == colores.indexOf(nombre) && y[mitad] == dilucion){
            return mitad;
        }
        else if((max - min == 1 && temp) || (max - min == 0)){
            return -1;
        }
        else{
            if(colores.indexOf(x[mitad]) < colores.indexOf(nombre)){
                return binarySearch(x, y, nombre, dilucion, mitad, max, mitad);
            }
            else if (colores.indexOf(x[mitad]) == colores.indexOf(nombre) && dilucion < y[mitad]){
                return binarySearch(x, y, nombre, dilucion, mitad, max, mitad);
            }
            else{
                return binarySearch(x, y, nombre, dilucion, min, mitad, mitad);
            }
        }
    }
    
    public static void main(String[] args) {
        String entrada[] = s.nextLine().split(" ");
        int n = Integer.parseInt(entrada[0]);
        String nombreBusqueda = entrada[1].split("-")[0];
        int dilucionBusqueda = Integer.parseInt(entrada[1].split("-")[1]);
        
        String nombre[] = new String[n];
        int dilucion[] = new int[n];
        for (int i = 0; i < n; i++) {
            entrada = s.nextLine().split("-");
            nombre[i] = entrada[0];
            dilucion[i] = Integer.parseInt(entrada[1]);
        }
        
        
        
        System.out.println(binarySearch(nombre, dilucion, nombreBusqueda, dilucionBusqueda, 0, nombre.length-1, 0));
    }
    
}