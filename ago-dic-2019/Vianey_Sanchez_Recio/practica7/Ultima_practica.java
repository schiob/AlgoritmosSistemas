package ultima_practica;
import java.util.Arrays;
import java.util.Scanner;
public class Ultima_practica {

	private static String []arreglo;
  public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
          System.out.println(" Ingresa el numero total de medicinas"
                + " nombre de las medicinas que se tienen que  buscar ");
        int arreglo1=0;
        int  arreglo2=0;

          
         arreglo1 = Integer.parseInt(s.next());
        arreglo2= Integer.parseInt(s.next());
        
        
        String numero_medicina,xbusqueda;
        numero_medicina = s.nextLine();
        
         System.out.println("nombre de los medicinas");
        numero_medicina = s.nextLine();
        arreglo= numero_medicina.split(" ");
        String[] cAbuscar = new String[arreglo2];
        if(arreglo1== arreglo.length){
        
            sort();
            for (int i = 0; i < arreglo2; i++) {
                System.out.println("Que medicamento  buscas?");
                xbusqueda=s.next();
                cAbuscar[i]=xbusqueda;
            }
             System.out.println();

            for(String a:arreglo){
                System.out.print(a+" ");
            }
         System.out.println();
            for (int i = 0; i < arreglo2; i++) {
                System.out.println(busqueda(arreglo,cAbuscar[i]));
                
                
            }
            }else {
            System.out.println("El numero de medicamentos no coincide con los medicamentos ingresados");
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
          
//QuickSort(izquierda, derecha);
        private static void QuickSort(int izquierda,int derecha){
      if(izquierda >= derecha)
            return;
 
      String pivote = getMedian(izquierda, derecha);
        int partition = partition(izquierda, derecha, pivote);
           
        QuickSort(0, partition-1);
        QuickSort(partition+1, derecha);
        }
  private static int partition(int izquierda,int derecha,String pivote){
        int Cursorizquierda = izquierda-1;
        int Cursorderecha = derecha;
        while(Cursorizquierda < Cursorderecha){
        while(((Comparable<String>)arreglo[++Cursorizquierda]).compareTo(pivote) < 0);
        while(Cursorderecha > 0 && ((Comparable<String>)arreglo[--Cursorderecha]).compareTo(pivote) > 0);
            if(Cursorizquierda >= Cursorderecha){
                break;
            }else{
                swap(Cursorizquierda, Cursorderecha);
            }
        }
        swap(Cursorizquierda, derecha);
        return Cursorizquierda;
    }
   public static String getMedian(int izquierda,int derecha){
       int centro=(izquierda+derecha)/2;
      
        if(((Comparable<String>)arreglo[izquierda]).compareTo(arreglo[centro]) > 0)
            swap(izquierda,centro);
        
         if(((Comparable<String>)arreglo[izquierda]).compareTo(arreglo[derecha]) > 0)
            swap(izquierda, derecha);
         
         if(((Comparable<String>)arreglo[centro]).compareTo(arreglo[derecha]) > 0)
            swap(centro, derecha);
         
         
        swap(centro, derecha);
        return arreglo[derecha];
    }

    public static void swap(int izquierda,int derecha){
        String temp = arreglo[izquierda];
        arreglo[izquierda] = arreglo[derecha];
        arreglo[derecha] = temp;
    
    }//cierre de main
}// cierre de clase

    
    
        

      
   
    

