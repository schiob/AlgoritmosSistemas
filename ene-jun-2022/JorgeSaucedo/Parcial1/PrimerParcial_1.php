<?php
$Datos='Parasaurolophus Oviraptor Minmi Troodon Wannanosaurus';
$o=str_word_count ($Datos, 1);

for ($i=0; $i < count($o) ; $i++) { 
    echo $o[$i].' ';
}

echo '<br>';



for ($i=0; $i <count($o) ; $i++){ 
    $p=str_word_count ($o[$i], 0);
    $x=$o[$i];
    $y=$i-1;
    while ($y >= 0 && $o[$y] < $x) 
    {
        $o[$y+1]=$o[$y];
        $y--;
    }
    $o[$y+1]=$x;
}
for($i=0; $i<count($o); $i++)
{
    echo $o[$i]." ";
}   