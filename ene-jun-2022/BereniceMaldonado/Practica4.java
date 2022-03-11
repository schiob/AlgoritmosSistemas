package algoritmos;

public class Practica4 {

    public static void main(String[] args) {
        String arr[]={"CANSARTAN HIDROCLOROTIAZIDA ALTER","CARBAMAZEPINA NORMON","MATRIF","ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].length() > arr[j].length()){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (String arr1 : arr) {
            System.out.println(arr1);
            System.out.println();
        }        
    }
}
