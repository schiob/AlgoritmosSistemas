<?php
class grafo{
public $nNodos = 12;
public $aristas = 6;
public $infectados = 3;
    public $top=-1;
    
    public $e = array();
    
    function llenarArreglo($val1,$val2){
         
        $this->top++;
        $this->e[$this->top][0]=$val1; 
        $this->e[$this->top][1]=$val2;
        $this->e[$this->top][2]=0;
        
        echo $val1.", ".$val2.", ".$this->e[$this->top][2]."<br>";

        
        
    }

    function Ver(){
        print_r($this->e);
        
    }
    function infectados($buscando){
        for($i = 0; $i < $this->aristas; $i++){
            if($this->e[$i][0] == $buscando){
                echo " ".$this->e[$i][1];
            }else{
                if($this->e[$i][1] == $buscando){
                    echo " ".$this->e[$i][0];
                }
                
            }

        }
    }
    function dfs($act){
        $buscando = 0;
     
      
        echo "visitando el nodo : ".$act."<br>";
        if($act == $buscando){
            echo "camino encontrado a betsy"."<br>";
        }
        
     
        for( $i = 0; $i < $this->aristas; $i++){
            
            if($this->e[$i][0] == $act){
                if($this->e[$i][2] == 0){
                    $this->e[$i][2] = 1;
                    $this->dfs($this->e[$i][1]);

                
                }

                
            }else{
                if($this->e[$i][1] == $act){
                    if($this->e[$i][2] == 0){
                        $this->e[$i][2] = 1;
                        $this->dfs($this->e[$i][0]);
                        
                    }
                }
                
            }

        }
    }
    
    function bfs($inicial){
        
    }

}





    $uwu = new grafo();
$nNodos = 12;
$Naristas = 6;
//$Ninfectados = 3;
$infectados = [5, 6, 15];
$uwu->llenaArreglo(0, 2);
$uwu->llenaArreglo(0, 1);
$uwu->llenaArreglo(3, 0);
$uwu->llenaArreglo(1, 3);
$uwu->llenaArreglo(2, 3);
$uwu->llenaArreglo(3, 4);


$uwu->dfs(3);

?>