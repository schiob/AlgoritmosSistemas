<?php
    class arreglo{
        public $a = array(
        ' 1080     David',
        ' 1072     Mario',
        ' 1204      Saul',
        ' 1070 Francisco',
        ' 1204      Luis',
        ' 1550     Karla');
        
        function ordenar($n){
            for($i=0; $i<$n; $i++){
                for($j=0; $j<$n-$i-1; $j++){
                    if(intval($this->a[$j])>intval($this->a[$j+1])){
                        $temp = $this->a[$j];
                       $this->a[$j] = $this->a[$j+1];
                       $this->a[$j+1] = $temp;
    
                    }
                }
            }
    }
    function print(){
        $o=6;
        $t = sizeof($this->a);
        for($i = $t-1; $i >= 0; $i--){
            
            echo ",".(substr($this->a[$i], -9,9));
        }
    }
}
$hola = new arreglo();
 $a = array(
    '10 8 0 David',
    '10 7 2 Mario',
    '12 0 4 Saul',
    '10 7 0 Francisco',
    '12 0 4 Luis',
    '15 5 0 Karla');
$hola->ordenar(6);
$hola->print();
?>