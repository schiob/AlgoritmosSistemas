<?php
function busquedaa(&$Array, $i, $b){
    for( $i>-1; $i--;){
        if($Array[$i] == $b){
            echo $b." encontrado en ".($i + 1)." wuuuu";

        }else{
          
           
            
        }
    }
}
      // test the code
 $MyArray = array('Calculo2Deitel', 'CalculoForDummies', 'AlgebraLineal', 'T0eoríaDeNúmeros', 'TheMangaGuideToCalculus');
 $n = 5; 
 $busqueda = 'CalculoForDummies';
 echo " "."<br>";
 busquedaa($MyArray, $n, $busqueda);
 




?>