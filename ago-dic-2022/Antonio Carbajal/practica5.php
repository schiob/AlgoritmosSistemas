<?php
class alumno{
    //$p = null;//problemas
    //$m = null;//minutos
    public $a = array("Parasaurolophus", "Oviraptor", "Minmi", "Troodon", "Wannanosaurus");

    
    function add($valor){
        $i=0;
        $this->a[]=$valor;
        $i++;
    }
    //t(n) = 2T(n/2) + O(n)promedio 
    //t(n) = T(n-1) + O(n)al cuadrado, peor de los casos
    function insertSort(){
        
        
        $t = sizeof($this->a); //sabemos tamaño del arreglo
        for($i = 0; $i < $t; $i++){//recorrido arreglo
            $temp = $this->a[$i];//dato queda uno adelante(1)
            $j = $i - 1;//justo detras de $temp posicion(0)
            //$xd = $this->a[$j];
            while ($j >= 0 AND strlen($temp) < strlen($this->a[$j])){
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
$tmp = ["Parasaurolophus", "Oviraptor", "Minmi", "Troodon", "Wannanosaurus"];//elementos a ordenar

$hola->insertSort($tmp);     
$hola->print();
//$hola->Contador(10, 6);


?>








