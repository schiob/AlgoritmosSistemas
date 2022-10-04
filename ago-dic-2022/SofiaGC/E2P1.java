public class E2P1 {
        void merge(int arr[], int l, int m, int r){
            // Subarrays (mitades)
            int n1 = m - l + 1; //primer mitad
            int n2 = r - m; // segunda mitad
     
            int L[] = new int[n1];
            int R[] = new int[n2];
               
            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];
     
            int i = 0, j = 0;   
         
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }
          
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
            
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
        void sort(int arr[], int l, int r){
            if (l < r) {

                int m = l + (r - l) / 2;

                sort(arr, l, m);
                sort(arr, m + 1, r);
     
                merge(arr, l, m, r);
            }
        }
     
        static void imprimir(int arr[]){
            int n = arr.length;
            for (int i = 0; i < n; ++i){
                if(arr[i] == 96){
                    System.out.print("Flatland ");
                }
                if(arr[i] == 245){
                    System.out.print("HarryPotter ");
                }
                if(arr[i] == 541){
                    System.out.print("Mistborn ");
                }
                if(arr[i] == 777){
                    System.out.print("CleanCode");
                }
            }
        }
     
        public static void main(String args[]){
            int arr[] = {245,777,96,541,469};
     
            MergeSort ob = new MergeSort();
            ob.sort(arr, 0, arr.length - 1);
            imprimir(arr);
        }
}
