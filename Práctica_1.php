<?php
class Practica1{

    function suma($a, $b){
        $suma = $a + $b;
        return $suma;
    }
}

$class = new Practica1;
$x = $class->suma(2, 3);
echo $x;