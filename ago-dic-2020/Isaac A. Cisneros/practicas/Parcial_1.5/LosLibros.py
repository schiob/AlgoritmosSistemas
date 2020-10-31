def  MergeSort ( arr ):
    si  len ( arr ) >  1 :
        mid  =  len ( arr ) // 2
        I  =  arr [: mid ]
        D  =  arr [ mid :]

        MergeSort ( I )
        MergeSort ( D )

        i  =  j  =  k  =  0

        mientras que  i  <  len ( I ) y  j  <  len ( D ):
            si  int ( I [ i ] [ 1 ]) <  int ( D [ j ] [ 1 ]):
                arr [ k ] =  yo [ i ]
                i + = 1
            otra cosa :
                arr [ k ] =  D [ j ]
                j + = 1
            k + = 1

        mientras  yo  <  len ( I ):
            arr [ k ] =  yo [ i ]
            i + = 1
            k + = 1
        mientras que  j  <  len ( D ):
            arr [ k ] =  D [ j ]
            j + = 1
            k + = 1

ar  = []
n  =  int ( input ( "Cuantos libros Juanito ?:" ))
para  i  en el  rango ( n ):
    lbs  =  input ( "tituo del libro:" ). dividir ()
    ar . añadir ( lbs )
MergeSort ( ar )
porque  yo  en  ar :
    print ( '' . join ( i [ 0 ]), end = "" )