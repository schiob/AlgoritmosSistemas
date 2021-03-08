import java.util.Arrays;

public class suma {
    public static void main(String args[]) {
        int []arr = {4, 6, 7, 4, 5, 2};
        //      Suma{4, 6, 7, 4, 5, 2};
        //      4+Suma{6, 7, 4, 5, 2};
        //      Suma{4} + Suma{6, 7}+Suma{4, 5, 2};

        int total = sumar(arr);
        int total2 = sumarRecur(arr);
        int total3 = sumarRecur2(arr);

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }

    public static int sumar(int[] arr){
        int total = 0;

        for(int elem : arr){
            total += elem;
        }
        return total;
    }

    public static int sumarRecur(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }

        int middle = arr.length / 2;
        int elemExtra = 0;
        if (arr.length % 2 != 0){
            elemExtra = 1;
        }
        int []arrIzq = new int[middle];
        int []arrDer = new int[middle + elemExtra];

        for(int i = 0 ; i < middle ; i++){
            arrIzq[i] = arr[i];
        }
        for(int i = middle; i < arr.length; i++){
            arrDer[i-middle] = arr[i];
        }

        return sumarRecur(arrIzq) + sumarRecur(arrDer);
    }

    public static int sumarRecur2(int[] arr){
        if(arr.length == 1){
            return arr[0];
        }

        int[] subArr = Arrays.copyOfRange(arr, 1, arr.length);
        return arr[0] + sumarRecur(subArr);
    }
}
