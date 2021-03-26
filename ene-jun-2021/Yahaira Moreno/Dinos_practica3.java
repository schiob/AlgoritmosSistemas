paquete  Algo;
import  java.util.Scanner ;
 clase  pública DinosPractica3 {

     Escáner estático s =  nuevo  escáner ( System . in);

    public  static  void  main ( String [] args ) {
        Sistema . fuera . print ( " Tamaño de la lista: " );   
        int n = s . nextInt ();

        Cadena arr [] =  nueva  Cadena [n];

        for ( int i =  0 ; i < arr . longitud; i ++ ) {
            arr [i] = s . próximo();
        }

        for ( int i =  0 ; i < arr . longitud - 1 ; i ++ ) {
            for ( int j = i + 1 ; j < arr . longitud; j ++ ) {
                if (arr [i] . longitud () > arr [j] . longitud ()) {
                    String temp = arr [i];
                    arr [i] = arr [j];
                    arr [j] = temp;
                }
            }
        }
        for ( int i =  0 ; i < arr . longitud; i ++ ) {
            Sistema . fuera . imprimir (arr [i] +  "  " );
        }
    }
}