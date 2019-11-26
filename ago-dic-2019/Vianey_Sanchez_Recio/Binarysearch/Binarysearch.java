package binarysearch;
import java.util.Scanner;
public class Binarysearch {
    
    	private static String []arreglo;
  public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
          System.out.println(" Ingresa el numero total de articulos"
                + " nombre del articulo que deseas buscar ");
        int numero_de_articulos=0;
        int  precio=0;


         numero_de_articulos = Integer.parseInt(s.next());
        precio= Integer.parseInt(s.next());


        String numero_de_articulos,xbusqueda;
       numero_de_articulos = s.nextLine();

         System.out.println("nombre de los articulos");
       numero_de_articulos = s.nextLine();
        arreglo= numero_de_articulos.split(" ");
        String[] cAbuscar = new String[precio];
        if(numero_de_articulos== arreglo.length){

            sort();
            for (int i = 0; i < precio; i++) {
                System.out.println("Que medicamento  buscas?");
                xbusqueda=s.next();
                cAbuscar[i]=xbusqueda;
            }
             System.out.println();

            for(String a:arreglo){
                System.out.print(a+" ");
            }
         System.out.println();
            for (int i = 0; i < precio; i++) {
                System.out.println(busqueda(arreglo,cAbuscar[i]));


            }
            }else {
            System.out.println("El numero de ariculos no coincide con los articulos ingresados");
        }
        }
	public static int busqueda(String[] x,String y){
        int indice=0;
        while(indice<x.length){
            if (x[indice].compareTo(y)==0) {
               return indice;
            }
            indice++;
        }
        return -1;
    }
	public static void sort(){
        int izquierda = 0;
        int derecha = arreglo.length-1;
    }
}// cierre de clase