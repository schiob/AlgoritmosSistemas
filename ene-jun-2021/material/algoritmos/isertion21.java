public class isertion21{
    public static void main(String[] args){
        int []arr = {3,5,6,4,2};

        // Inicio el insertion sort
        for(int i = 1; i < arr.length; i++){
            int actual = arr[i];
            
            int j = i-1;
            for(; j >= 0; j--){
                if(actual < arr[j]){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = actual;
        }

        for(int elem: arr){
            System.out.printf("%d ", elem);
        }
    }
}