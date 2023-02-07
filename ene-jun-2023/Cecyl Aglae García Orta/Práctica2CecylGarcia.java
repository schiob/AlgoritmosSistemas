package algoritmos;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.IntStream;

/*@author cecyl*/
public class Práctica2 {

    public static void main(String[] args) {
    int[] arr = {3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78};
    System.out.println("Arreglo dado: " + Arrays.toString(arr));
    ArrayList <Integer> pares = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 != 1) {
        pares.add(arr[i]);
      }
    }
    Integer[] oddNumbersArray = pares.toArray(new Integer[0]);
    Arrays.sort(oddNumbersArray);
    int[] reverse = IntStream.rangeClosed(1, oddNumbersArray.length)
                            .map(i -> oddNumbersArray[oddNumbersArray.length-i])
                            .toArray();
    System.out.println("Arreglo Organizado de mayor a menor: " + Arrays.toString(reverse));
  }
}