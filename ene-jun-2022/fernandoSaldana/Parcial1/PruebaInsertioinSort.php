<?php
class sortInseertion
{
    
    public $arreglo=array("Parasaurolophus", "Oviraptor", "Minmi", "Troodon", "Wannanosaurus");
    
    
    function insersion()
    {
        intval($this->arreglo);
        for($i=1;$i<count($this->arreglo);$i++)
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
        return $this->arreglo;
    }
    function imprimir()
    {
        //ksort($this->arreglo);
        //echo join(',',$this->arreglo);
        for ($i=count($this->arreglo)-1; $i>=0  ; $i--) 
        { 
            echo $this->arreglo[$i]. " ";
        }
    }    
}
$n=new sortInseertion();
echo "Insertion Sort";
$n->insersion();
echo '<br>';
$n->imprimir();

?>