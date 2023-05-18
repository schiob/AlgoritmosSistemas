<?php

class Practica3{
    function selection_sort($arr){
        for ($i=0; $i < count($arr); $i++) { 
            $menor = $i;
            for ($j=$i; $j < count($arr); $j++) {
                if(strlen($arr[$menor]) > strlen($arr[$j])){
                    $menor = $j;
                }
            }
            $x = $arr[$i];
            $arr[$i] = $arr[$menor];
            $arr[$menor] = $x;
        }
        return $arr;
    }

    function print($arr){
        for ($i = 0; $i < count($arr); $i++) { 
            echo $arr[$i] . ", ";
        }
    }
}

$arr = array("CANDESARTAN HIDROCLOROTIAZIDA ALTER", "CARBAMAZEPINA NORMON", "MATRIF", "ACICLOVIR SANDOZ", "MELOXICAM", "FENDIVIA", "SEBUMSELEN");
$class = new Practica3();
echo "Arreglo original:\n";
$class->print($arr);
echo "<br>";
$sortedArr = $class->selection_sort($arr);
echo "Arreglo ordenado:\n";
$class->print($sortedArr);