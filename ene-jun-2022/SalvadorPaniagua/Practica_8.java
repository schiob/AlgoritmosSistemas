package algoritmos.pkg2022;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;

public class Practica_8 {
	private static String []arreglo;
	public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println(" numero de medicamentos a buscar");
        System.out.println("numero de medicinas a buscar (1 numero por parrafo)");
        System.out.println("(1 numero por parrafo)");

        int arreglo1=0,arreglo2=0;

        arreglo1 = Integer.parseInt(s.next());
        arreglo2= Integer.parseInt(s.next());
        String num,medicamento,cBuscar;
        num = s.nextLine();
        System.out.println("Medicamentos que necesitas");
        medicamento = s.nextLine();
        arreglo= medicamento.split(" ");
        String[] cAbuscar = new String[arreglo2];
        if(arreglo1== arreglo.length){

            sort();
            for (int i = 0; i < arreglo2; i++) {
                System.out.println("¿Que medicanto necesitas?");
                cBuscar=s.next();
                cAbuscar[i]=cBuscar;
            }

            System.out.println();

            for(String a:arreglo){
                System.out.print(a+" ");
            }
            System.out.println();
            for (int i = 0; i < arreglo2; i++) {
                System.out.println(busqueda(arreglo,cAbuscar[i]));
            }
        }
        else {
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
        int left = 0;
        int right = arreglo.length-1;

        quickSort(left, right);
    }

//Necesidad de un quiksort
    private static void quickSort(int left,int right){
        if(left >= right)
            return;


        String pivot = getMedian(left, right);
        int partition = partition(left, right, pivot);


        quickSort(0, partition-1);
        quickSort(partition+1, right);
    }


    private static int partition(int left,int right,String pivot){
        int leftCursor = left-1;
        int rightCursor = right;
        while(leftCursor < rightCursor){
        while(((Comparable<String>)arreglo[++leftCursor]).compareTo(pivot) < 0);
        while(rightCursor > 0 && ((Comparable<String>)arreglo[--rightCursor]).compareTo(pivot) > 0);
            if(leftCursor >= rightCursor){
                break;
            }else{
             swap(leftCursor, rightCursor);
            }
        }
        swap(leftCursor, right);
        return leftCursor;
    }

    public static String getMedian(int left,int right){
        int center = (left+right)/2;

                if(((Comparable<String>)arreglo[left]).compareTo(arreglo[center]) > 0)
            swap(left,center);

        if(((Comparable<String>)arreglo[left]).compareTo(arreglo[right]) > 0)
            swap(left, right);

        if(((Comparable<String>)arreglo[center]).compareTo(arreglo[right]) > 0)
            swap(center, right);

        swap(center, right);
        return arreglo[right];
    }


  public static void swap(int left,int right){
      String temp = arreglo[left];
      arreglo[left] = arreglo[right];
      arreglo[right] = temp;
    }
}


