package CARLOS_SILVA;

public class InsertionSort {
    public static void main(String[] args) {
        int A[] = {5, 9 , 1 , 7 , 0 };
        
        for(int i = 1; i<A.length; i++) {
            int auxiliar = A[i];

            int j;
            for(j = i - 1; j>=0 && A[j] > auxiliar ; j--) {
                    A[j+1] = A[j];
            }
            A[j+1] = auxiliar;
        }

        System.out.println("Lista Ordenada");
        for(int i = 0; i<A.length; i++) {
            System.out.println(A[i]);
        }
    }
}