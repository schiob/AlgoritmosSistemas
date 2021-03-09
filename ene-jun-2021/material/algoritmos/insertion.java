public class insertion{
    public static void main(String [] args) {
        char []arr = {'f', 'h', 'g', 'q', 'a', 'n', 'p'};


        // Insertion sort
        for(int i = 1 ; i < arr.length ; i++){
            char actual = arr[i];
            int j = i-1;
            for(; j >= 0 ; j--){
                if(arr[j] > actual){
                    break;
                } 
                arr[j+1] = arr[j];
            }

            arr[j+1] = actual;
        }

        // Print
        for(int val:arr){
            System.out.printf("%c ", val);
        }
    }
}