<?php
class Practica4{
    public $arr = array(1432, 230, 1980, 1689, 400);

    function pokimones(){
        $x = $this->selection_sort($this->arr);
        echo "Entrada: ";
        for ($i=0; $i < count($this->arr); $i++) { 
            echo $this->arr[$i] . " ";
        }
        echo "<br>" . "Salida: ";
        for ($i=0; $i < count($x); $i++) { 
            echo $x[$i] . " ";
        }
    }

    private function selection_sort($arr){
        for ($i=0; $i < count($arr); $i++) { 
            $mayor = $i;
            for ($j=$i; $j < count($arr); $j++) {
                if($arr[$mayor] < $arr[$j]){
                    $mayor = $j;
                }
            }
            $x = $arr[$i];
            $arr[$i] = $arr[$mayor];
            $arr[$mayor] = $x;
        }
        return $arr;
    }
}

$class = new Practica4;
$class->pokimones();