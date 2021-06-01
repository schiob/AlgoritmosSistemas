paquete  ALGO ;
 clase  pública lista_numeros {

    public  static  void  main ( String [] args ) {
        int [] arr = { 3 , 43 , 2 , 5 , 4 , 6 , 5 , 4 , 334 , 45 , 23 , 123 , 323 , 45 , 34 , 23 , 43 , 5 , 46 , 78 };

        para ( int i =  1 ; i < arr . longitud; i ++ ) {
            int actual =   arr [i];

            int j = i - 1 ;
            para (; j > =  0 ; j - ) {
                if (actual > arr [j]) {
                    arr [j + 1 ] = arr [j];
                }
                else {
                    romper ;
                }
            }
            arr [j + 1 ] = actual;
        }
        para ( int i =  0 ; i < arr . longitud; i ++ ) {
            si (arr [i] % 2 == 0 ) {
                Sistema . fuera . imprimir (arr [i] + "  " );
            }
        }
        }
    }