<?php

    class pokemon{
        
        
        //$n = readline(" ingrese numero de atletas");
        
        function mergeSort(&$arr){
        
            if(count($arr) > 1) {
                $mid = (count($arr)/2);// sustitui el n/2 por count
                                       //n era el numero de elementos 
                
                $left = array_slice($arr, 0, $mid);
                $right = array_slice($arr, $mid);
                
    
                $this->mergeSort($left);
                $this->mergeSort($right);
    
                // ordenamos izq y derecha
                $i = 0;
                $j = 0;
                $k = 0;
                while(($i < count($left)) && ($j < count($right))) {
                    if(intval($left[$i]) < intval($right[$j])) {
                        $arr[$k] = $left[$i];
                        $i++;
                    } else {
                        $arr[$k] = $right[$j];
                        $j++;
                    }
                    $k++;
                }
    
                while($i < count($left)) {
                    $arr[$k] = $left[$i];
                    $i++;
                    $k++;
                }
    
                while($j < count($right)) {
                    $arr[$k] = $right[$j];
                    $j++;
                    $k++;
                }
            }
        }

    function print($tmp){
        $o=5;
        $t = 5;
        for($i = $t-1; $i >= 0; $i--){
            
            echo "- ".(substr($tmp[$i], -28,28))."<br>";
        }
    }



}
$hola = new pokemon();
$tmp = [        
' 64               EstudiarParaAlgoritmos',
' 54               CompletarTareasPendientes',
' 80               RezarPorLosParciales',
' 90       ComprarLasBotellasDeSobornos',
' 20                  LlorarEnUnRincón'];//elementos a ordenar
$hola->mergeSort($tmp, 5);
//$hola->ordenar(5);
$hola->print($tmp);









?>