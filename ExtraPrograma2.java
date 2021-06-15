import java.util.Scanner;
public class Palabras {
    static int binarySearch(String[] arr, String x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            int res = x.compareTo(arr[m]);

            if (res == 0)
                return m;

            if (res > 0)
                l = m + 1;

            else
                r = m - 1;
        }
 
        return -1;
    }
 

     public static void main(String[] args) {
    Scanner entrada =  new Scanner(System.in);
      String[] busqueda, info, palabra;
      String s= "";
      int num, j=0;

      System.out.println("Ingrese el numero de palabras en la lista y la palabra a buscar: ");
      s = entrada.nextLine();

      info = s.split(" ", 0);
      num = Integer.valueOf(info[0]);

      System.out.println("Ingrese las palabras de la lista: ");
      palabra = entrada.nextLine().split(" ", 0);
      busqueda = palabra;
      
        String x =info[1] ;
        int result = binarySearch(busqueda, x);
 
        if (result == -1)
            System.out.println("La palabra no se encuentra en la lista");
        else
            System.out.println("Palabra encontrada en " + (result+1));
    }


            }
