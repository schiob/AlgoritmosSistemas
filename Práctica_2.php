<?php
class Practica2{
    public $arr = array(3, 43, 2, 5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78);

    function rem_impar(){
        echo "Entrada: ";
        for ($i=0; $i < count($this->arr); $i++) { 
            echo $this->arr[$i] . " ";
        }
        for ($i=0; $i < count($this->arr); $i++) { 
            if(($this->arr[$i] % 2) != 0){
                $this->arr[$i] = null;
            }
        }
        echo "<br>" . "Salida: ";
        $a = $this->ordenar($this->arr);
        for ($i=0; $i < count($a); $i++) { 
            echo $a[$i] . " ";
        }
    }

    function ordenar($arr){
        array_multisort($arr, SORT_DESC);
        return $arr;
    }
}

$class = new Practica2();
$class->rem_impar();