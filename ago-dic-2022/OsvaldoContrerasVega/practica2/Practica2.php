<?php
class alumno{
    //$p = null;//problemas
    //$m = null;//minutos
    public $a = array();

    
    function add($valor){
        $i=0;
        $this->a[]=$valor;
        $i++;
    }
    
    function insertSort(){
        
        
        $t = sizeof($this->a); //sabemos tamaño del arreglo
        for($i = 0; $i < $t; $i++){//recorrido arreglo
            $temp = $this->a[$i];//dato queda uno adelante(1)
            $j = $i - 1;//justo detras de $temp posicion(0)
            while ($j >= 0 AND $temp < $this->a[$j]){
                $this->a[$j + 1] = $this->a[$j];//1 cabia por 0 
                $this->a[$j] = $temp;//0 cambia por 1 
                $j = $j - 1;

            }
        }
    }
    function print(){
        $t = sizeof($this->a);
        for($i = 0; $i < $t; $i++){
            echo $this->a[$i].",";
        }
    }

    function Contador($n, $m){//$n = problemas, $m = minutos
        $i = 0;
        $suma = 0;
       
        while($i < $n and $suma < $m ){ 
            $suma = $suma + $this->a[$i];
            $i = $i + 1;
        }
        echo "<br>"."el numero de problemas
        que puede hacer son ".$i.".";

    }
}
$hola = new alumno();
$hola->add(4);
$hola->add(2);
$hola->add(3);
$hola->add(7);
$hola->add(5);
$hola->add(1);
$hola->add(2);
$hola->add(1);
$hola->add(3);
$hola->add(2);
$hola->insertSort();     
$hola->print();
$hola->Contador(10, 6);


?>