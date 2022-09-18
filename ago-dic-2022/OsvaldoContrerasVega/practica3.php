<?php
//practica pokemones

    /* $a = readline("ingrese cp de los pokemones");
     $b = readline("ingrese cp de los pokemones2");
   
    $suma = $a + $b;
    echo $suma; */
    class pokemon{
        public $a = array(1432, 230, 1980, 1689, 400);//cp pokemones
        
        //$n = readline("ingrese num pokemones capturados: ");
        
        function ordenar($n){
            //$this->a = readline("ingrese cp pokemones; ")
            //$t = sizeof($this->a); 
            for($i=0; $i<$n; $i++){
                for($j=0; $j<$n-$i-1; $j++){
                    if($this->a[$j]>$this->a[$j+1]){
                        $temp = $this->a[$j];
                        $this->a[$j] = $this->a[$j+1];
                        $this->a[$j+1] = $temp;
    
                    }
                }
            }

    }
    function print(){
        $t = sizeof($this->a);
        for($i = $t; $i >= 0; $i--){
            echo ",".$this->a[$i];
        }
        

    }


}
$hola = new pokemon();
$hola->ordenar(5);
$hola->print();


?>