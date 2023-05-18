<?php

class Practica7{
    function quicksort(&$arr, $left, $right){
        if($left < $right){
            $pivote = $this->part($arr, $left, $right);
            $this->quicksort($arr, $left, $pivote-1);
            $this->quicksort($arr, $pivote+1, $right);
        }
    }

    private function part(&$arr, $left, $right){
        $p = $arr[$right];
        $i = $left;

        for ($j = $left; $j <= $right; $j++) { 
            if($arr[$j] < $p){
                $x = $arr[$i];
                $arr[$i] = $arr[$j];
                $arr[$j] = $x;
                $i++;
            }
        }
        $y = $arr[$right];
        $arr[$right] = $arr[$i];
        $arr[$i] = $y;
        return $i; 
    }

    function print($arr){
        for ($i = 0; $i < count($arr); $i++) { 
            echo $arr[$i] . ", ";
        }
    }

    function binarysearch(&$arreglo, $dato, $left, $right){
        if ($left > $right) {
            return -1;
        }

        $mid_idx = floor(($left + $right) / 2);
        $mid = $arreglo[$mid_idx];
 
        if ($dato === $mid) {
            return $mid_idx;
        }else{
            if($dato > $mid){
                $left = $mid_idx + 1;
                return $this->binarysearch($arreglo, $dato, $left, $right);
            }else{
                $right = $mid_idx - 1;
                return $this->binarysearch($arreglo, $dato, $left, $right);
            }
        }
    }
}

$arr = array("naproxeno", "paracetamol", "rimantadina", "azitromicina", "ibuprofeno");
$class = new Practica7();
echo "Arreglo original:\n";
$class->print($arr);
$class->quicksort($arr, 0, count($arr) - 1);
echo "<br>";
echo "Arrreglo ordenado:\n";
$class->print($arr);
echo "<br>";
$idx = $class->binarysearch($arr, "azitromicina", 0, count($arr) - 1);
echo $idx . "<br>";
$idx = $class->binarysearch($arr, "ibuprofeno", 0, count($arr) - 1);
echo $idx . "<br>";
$idx = $class->binarysearch($arr, "aspirina", 0, count($arr) - 1);
echo $idx;