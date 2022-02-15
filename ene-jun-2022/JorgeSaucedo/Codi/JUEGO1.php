<?php

//$n=random_int(1,35);
$n=2;
$r=0;
for ($i=0; $i <= ($n-1); $i++) { 
    $j=pow($n,$i);
    $r=$r+$j;
}
echo$r;