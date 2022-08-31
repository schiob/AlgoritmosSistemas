<?php
class suma{
    public $num1 = "";
    public $num2 = "";

    function suma1($num1, $num2){
        $suma = 0;
        $suma = $num1 + $num2;
        return "<br>"."la suma total es ".$suma."<br>";

    }
}
$sumar = new suma();
$s = $sumar->suma1("1", "2");
echo $s;

?>