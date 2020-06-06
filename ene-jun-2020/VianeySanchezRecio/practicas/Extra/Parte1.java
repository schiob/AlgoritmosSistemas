package parte1;
import java.util.Scanner;
public class Parte1 {
//Funciones para extraer el nombre y páginas de los libros
    public static Object getName(String text){
       int i = 0;
       String name = "";
        while(text.charAt(i) != ' '){
            name += text.charAt(i);
            i++;
       }
        return name;
    }
    public static int getPages(String text){    
        int aux = 0;
        for (int i = text.length()-1; text.charAt(i) != ' '; i--) {
            aux = i;
        }

        int pages = Integer.parseInt(text.substring(aux, text.length()));


        return pages;
    }

    public static void Merge(Object[][]arr, int l, int middle, int r){

        //Tamaño de los subarreglos (left and right pointer)
        int l_p = middle - l + 1;
        int r_p = r - middle;

        //Creo los dos sub arreglos vacíos(Left and Right)
        Object L[][] = new Object[l_p][2];
        Object R[][] = new Object[r_p][2];

        //Copio los datos del arreglo original (books) a los arreglos temporales 

        //Aquí copio los nombres de los libros
        for (int i = 0; i < l_p; i++) {
            L[i][0] = arr[l + i][0];
        }
        for (int i = 0; i < r_p; i++) {
            R[i][0] = arr[middle + 1 + i][0];
        }

        //Aquí copio el número de páginas
        for (int j = 0; j < l_p; j++) {
            L[j][1] = arr[l + j][1];
        }
        for (int j = 0; j < r_p; j++) {
            R[j][1] = arr[middle + 1 + j][1];
        }

        //índices de los subarreglos
        int i = 0, j = 0, k = l;

        while(i < l_p && j < r_p){
            if ((int)L[i][1] <= (int)R[j][1]) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];
                i++;
            }else{
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        while(i < l_p){
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        while(j < r_p){
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];
            j++;
            k++;
        }
    }

    public static void Sort(Object[][]arr, int l, int r){
        if (l < r) {
            int middle = (l + r)/2;

            Sort(arr, l, middle);
            Sort(arr, middle + 1, r);

            Merge(arr, l, middle, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el total de libros: ");
        int numMovies = sc.nextInt();
        sc.nextLine();  
        Object[][] books = new Object[numMovies][2];

        for (int i = 0; i < numMovies; i++) {
            String aux = sc.nextLine();
            books[i][0] = getName(aux);
            books[i][1] = (int)getPages(aux);
        }

          Parte1 ob = new Parte1(); 
          ob.Sort(books, 0, books.length-1);

          System.out.println("Los libros ordenados qudarían de la sig. manera: ");
          for (int i = 0; i < books.length; i++) {
              System.out.print(books[i][0] + " ");
        }
    }
} 