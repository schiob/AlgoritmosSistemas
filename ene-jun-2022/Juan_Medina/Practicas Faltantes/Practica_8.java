import java.util.Arrays;
public class Practica_8 {

    public static void main(String[] args) {
     String[] meds = {"naproxeno","paracetamol","rimantadina","azitromicina","ibuprofeno"};
        
      quicksort(meds, 0, meds.length - 1);
       System.out.println("Medicamentos Ordenados");
        System.out.println(Arrays.toString(meds));
    }

    private static int particion(String array[], int left, int right) {
      String pivote = array[left];
    
      while (true) {        
       while (array[left].compareTo(pivote) < 0) {
    	   left++;
       }            
            
       while (array[right].compareTo(pivote) > 0) {
    	   right--;
       }
            
       if (left >= right) { return right;
         } 
       
       else {
             String temp = array[left];
             array[left] = array[right];
             array[right] = temp;
             left++;
             right--;
          }
         }
        }

    private static void quicksort(String array[], int left, int right) {
        if (left < right) {
         int indxParticion = particion(array, left, right);
          quicksort(array, left, indxParticion);
          quicksort(array, indxParticion + 1, right);
       }
      }
     }