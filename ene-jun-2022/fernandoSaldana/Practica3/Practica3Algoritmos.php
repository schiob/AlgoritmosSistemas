<?php

class insertionSort
{
    public $top = -1;
    public $arreglo =array();
    #ENTRADA DE DATOS
    function push($x)
    {
        $this->top++;
        $this->arreglo[$this->top]=$x;
    }

    function insert_sort()
    {
        for ($i=0; $i <count($this->arreglo) ; $i++) 
        { 
            $x=$this->arreglo[$i];
            $y=$i-1;
            while ($y >= 0 && $this->arreglo[$y] > $x) 
            {
                $this->arreglo[$y+1]=$this->arreglo[$y];
                $y--;
            }
            $this->arreglo[$y+1]=$x;
            
            
        }
        
        
    }
    function imprimir()
    {
        for($i=$this->top; $i>=0; $i--)
        {
        //echo $this->arreglo[$i]." ";
        if($this->arreglo[$i]%2==0)
            {
                //echo "x";
                //return $this->arreglo[$i];
                echo $this->arreglo[$i]." ";
            }
        }
    }
    
}

$M = new insertionSort();
#INGRESAMOS DATOS A LA PILA
$M->push(4);
$M->push(324);
$M->push(345);
$M->push(1);
$M->push(3564);
$M->push(3437);
$M->push(3);
$M->push(45);
$M->push(32);
$M->push(34);
$M->push(2);
$M->insert_sort();
echo "Insertion Sort";
echo '<br>';
$M->imprimir();
echo '<br>';

?>