<?php
class grafo{
public $nNodos = 16;
public $Naristas = 20;
public $Ninfectados = 3;
    public $top=-1;//nos ayudara a saber el tamaño del arreglo
    
    public $e = array();//arreglo de las aristas
    //public $visitados = new pila();
    
    function llenaArreglo($valor,$valor2){
        //y asi crear nuestro arreglo de una dimencion 
        $this->top++;//avanzamos top para que empieze en 0
        $this->e[$this->top][0]=$valor;//metemos el primer valor en el valor de top y 0, por ejemplo 0,0
        $this->e[$this->top][1]=$valor2;//metemos el segundo valor en el valor de top y 1, por ejemplo 0,1
        
        // y asi ir formando nuestro arreglo de 2 dimenciones $e
        echo $valor.", ".$valor2."<br>";

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

}





    $uwu = new grafo();
$nNodos = 10;
$Naristas = 20;
$Ninfectados = 3;
$infectados = [5, 6, 15];
$uwu->llenaArreglo(0, 1);
$uwu->llenaArreglo(0, 2);
$uwu->llenaArreglo(0, 3);
$uwu->llenaArreglo(0, 7);
$uwu->llenaArreglo(0, 8);
$uwu->llenaArreglo(1, 15);
$uwu->llenaArreglo(2, 4);
$uwu->llenaArreglo(2, 5);
$uwu->llenaArreglo(2, 6);
$uwu->llenaArreglo(3, 7);
$uwu->llenaArreglo(3, 9);
$uwu->llenaArreglo(3, 10);
$uwu->llenaArreglo(3, 11);
$uwu->llenaArreglo(4, 13);
$uwu->llenaArreglo(4, 5);
$uwu->llenaArreglo(5, 14);
$uwu->llenaArreglo(6, 9);
$uwu->llenaArreglo(9, 11);
$uwu->llenaArreglo(9, 14);
$uwu->llenaArreglo(9, 12);
ECHO "infectados: ";
for($i = 0; $Ninfectados>$i; $i++){
    $value = $infectados[$i];
    $uwu->infectados($value);
}

//$uwu->V();
?>