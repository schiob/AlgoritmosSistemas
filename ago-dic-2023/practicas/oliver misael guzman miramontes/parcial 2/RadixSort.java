import java.util.Scanner;

public class RadixSort {
    public static void radixSort(int[] arr) {
        int max = maxvalor(arr);
        int exp = 1;

        while (max / exp > 0) {
            contardigi(arr, exp);
            exp *= 10;
        }
    }

    public static void contardigi(int[] arr, int exp) {
        int n = arr.length;
        int[] entrada = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        int total = 0;
        for (int i = 0; i < 10; i++) {
            int oldCount = count[i];
            count[i] = total;
            total += oldCount;
        }

        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            entrada[count[digit]] = arr[i];
            count[digit]++;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = entrada[i];
        }
    }

    public static int maxvalor(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int contarDigitos(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cantidad");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
        	arr[i] = scanner.nextInt();
        }    

        radixSort(arr);

       
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
