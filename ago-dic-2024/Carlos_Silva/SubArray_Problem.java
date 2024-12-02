public class SubArray_Problem {
    public static void main(String[] args) {
        int arr[] = {-2, -1, 7, -2, 5, -10};

        subArray(arr);

    }

    //METODO KADANE´S ALGORITHM
    public static void subArray(int[] arr) {
        if (arr.length == 1) {
            System.out.println("Solo hay un elemento: " + arr[0]);
            return;
        }

        float maxsum = -100000000f;
        float partialSum = -100000000f;

        for (int num : arr) {
            maxsum = Math.max(num, num + maxsum);
            partialSum = Math.max(partialSum, maxsum);
            if (partialSum < 0) {
                partialSum = 0;
            }
        }

        System.out.print("The SubArray is: " + partialSum);
    }

    //SOLUCION UNO
    public static void subArray2(int[] arr) {
        //int arr[] = {-2, -1, 7, -2, 5, -10};

        if (arr.length == 1) {
            System.out.println("Solo hay un elemento: " + arr[0]);
            return;
        }

        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int partialSum = 0;
                for(int k = i; k <= j; k++) {
                    partialSum += arr[k];
                    if (partialSum > maxSum) {
                        maxSum = partialSum;
                    }
                }
            }
        }
        System.out.println("The subArray is: " + maxSum);
    }
}
