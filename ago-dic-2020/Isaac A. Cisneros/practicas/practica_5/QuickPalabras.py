def  quickSort ( arreglo ):
    si  len ( arreglo ) ==  0 :
        volver []

    izquierda  = []
    derecha  = []
    pivote  =  arreglo [ 0 ]

    para  elemento  en  arreglo [ 1 :]:
        si  elemento  <  pivote :
            a la izquierda . añadir ( elemento )
        otra cosa :
            bien . añadir ( elemento )

    return  quickSort ( izquierda ) + [ pivote ] +  quickSort ( derecha )


n  =  int ( entrada ())
línea  =  entrada (). dividir ()

si  n  ==  len ( línea ):
    imprimir ( quickSort ( línea ))
otra cosa :
    print ( 'Anota bien las palabras que ingresaras' )