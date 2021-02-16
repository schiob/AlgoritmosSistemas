
public class search {
    public static void main(String args[]) {
        int []arr = {1, 2, 3, 4, 5, 6, 7, 19, 45, 56, 72, 73, 74, 453};

        int buscar = 57;

        System.out.println(binarySearch(arr, 0, arr.length-1, buscar));
    }

    public static int binarySearch(int[] arr, int inicio, int fin, int buscando){
        int middle = (inicio+fin)/2;
        if (arr[middle] == buscando){
            return middle;
        }
        if (inicio == fin){
            return -1;
        }

        if (arr[middle] < buscando){
            return binarySearch(arr, middle+1, fin, buscando);
        }
        else{
            return binarySearch(arr, inicio, middle-1, buscando);
        }
    }

}