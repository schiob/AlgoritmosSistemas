<?php
class grafo{
public $nNodos = 12;
public $Naristas = 6;
public $Ninfectados = 3;
    public $top=-1;//nos ayudara a saber el tamaño del arreglo
    
    public $e = array();//arreglo de las aristas
    //public $visitados = new pila();
    
    function llenaArreglo($valor,$valor2){
        //y asi crear nuestro arreglo de una dimencion 
        $this->top++;//avanzamos top para que empieze en 0
        $this->e[$this->top][0]=$valor;//metemos el primer valor en el valor de top y 0, por ejemplo 0,0
        $this->e[$this->top][1]=$valor2;//metemos el segundo valor en el valor de top y 1, por ejemplo 0,1
        $this->e[$this->top][2]=0;//visitados
        // y asi ir formando nuestro arreglo de 2 dimenciones $e
        echo $valor.", ".$valor2.", ".$this->e[$this->top][2]."<br>";

        //vamos imprimiendo nuestro arrgelo de dos dimenciones $e
        
    }

    function V(){
        print_r($this->e);
        //imprimimos nuestro arrgelo de una dimencion de las $v para ver que todo este correcto
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

/*ECHO "infectados: ";
for($i = 0; $Ninfectados>$i; $i++){
    $value = $infectados[$i];
    $uwu->infectados($value);
}*/
$uwu->dfs(3);

//$uwu->V();
?>