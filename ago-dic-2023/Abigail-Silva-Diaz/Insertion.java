public class Insertion {
    public static void main (String []args){

        int [ ] arreglo={2,34,3,886,4,7,5,1};

        for (int elem:arreglo){
            System.out.printf("%d",elem);
        }

        for (int i =1; i<arreglo.length;i++){
            int actual=arreglo[i];

            int j=i-1;

            while (j >=0 ){
                if(actual <arreglo[j]){ //Si cambio el signo a ">" imprime de mayor a menor
                    arreglo[j+1]=arreglo[j];
                }
                else{
                   break;
                }
                j--;
            }//Fin While
            arreglo[j+1]=actual;
        }//Fin ciclo for
        System.out.println();
        for(int elem:arreglo){
            System.out.printf("%d",elem);
        }
    }//Fin Main
}//Fin clase
