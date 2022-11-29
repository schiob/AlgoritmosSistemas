<?php
class grafo{
public $nNodos = 16;
public $Naristas = 20;
public $Ninfectados = 3;
    public $top=-1;
    public $e = array();
    
    function llenaArreglo($valor1,$valor2){
        $this->top++;
        $this->e[$this->top][0]=$valor1;
        $this->e[$this->top][1]=$valor2;
        echo $valor1.", ".$valor2."<br>";
    }

    function V(){
        print_r($this->e);
    }
    function infectados($buscando){
        for($i = 0; $i < $this->Naristas; $i++){
            if($this->e[$i][0] == $buscando){
                echo " ".$this->e[$i][1];
            }else{
                if($this->e[$i][1] == $buscando){
                    echo " ".$this->e[$i][0];
                }
                
            }

        }
    }

}

$graph = new grafo();
$nNodos = 10;
$Naristas = 20;
$Ninfectados = 3;
$infectados = [5, 6, 15];
$graph->llenaArreglo(0,1);
$graph->llenaArreglo(0,2);
$graph->llenaArreglo(0,3);
$graph->llenaArreglo(0,7);
$graph->llenaArreglo(0,8);
$graph->llenaArreglo(1,15);
$graph->llenaArreglo(2,4);
$graph->llenaArreglo(2,5);
$graph->llenaArreglo(2,6);
$graph->llenaArreglo(3,7);
$graph->llenaArreglo(3,9);
$graph->llenaArreglo(3,10);
$graph->llenaArreglo(3,11);
$graph->llenaArreglo(4,13);
$graph->llenaArreglo(4,5);
$graph->llenaArreglo(5,14);
$graph->llenaArreglo(6,9);
$graph->llenaArreglo(9,11);
$graph->llenaArreglo(9,14);
$graph->llenaArreglo(9,12);
echo "Infectados: ";
for($i = 0; $Ninfectados>$i; $i++){
    $value = $infectados[$i];
    $graph->infectados($value);
}
?>