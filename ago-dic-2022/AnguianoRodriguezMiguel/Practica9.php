<?php
class grafo{
public $nNodos = 12;
public $Naristas = 6;
public $Ninfectados = 3;
    public $top=-1;
    public $e = array();
    function llenaArreglo($valor,$valor2){
        $this->top++;
        $this->e[$this->top][0]=$valor;
        $this->e[$this->top][1]=$valor2;
        $this->e[$this->top][2]=0;
        echo $valor.", ".$valor2.", ".$this->e[$this->top][2]."<br>";
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

    function dfs($actual){
        $buscando = 0;
        echo "visitando el nodo : ".$actual."<br>";
        if($actual == $buscando){
            echo "camino encontrado a betsy"."<br>";
        }
        for( $i = 0; $i < $this->Naristas; $i++){
            if($this->e[$i][0] == $actual){
                if($this->e[$i][2] == 0){
                    $this->e[$i][2] = 1;
                    $this->dfs($this->e[$i][1]);
                } 
            }else{
                if($this->e[$i][1] == $actual){
                    if($this->e[$i][2] == 0){
                        $this->e[$i][2] = 1;
                        $this->dfs($this->e[$i][0]);
                    }
                }
            }
        }
    }
}

$graph = new grafo();
$nNodos = 12;
$Naristas = 6;
$infectados = [5, 6, 15];
$graph->llenaArreglo(0, 2);
$graph->llenaArreglo(0, 1);
$graph->llenaArreglo(3, 0);
$graph->llenaArreglo(1, 3);
$graph->llenaArreglo(2, 3);
$graph->llenaArreglo(3, 4);
$graph->dfs(3);
?>