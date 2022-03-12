<?php
//Parasaurolophus Oviraptor Minmi Troodon Wannanosaurus
//Parasaurolophus Wannanosaurus Oviraptor Troodon Minmi
$dinos = ["Parasaurolophus", "Oviraptor", "Minmi", "Troodon", "Wannanosaurus"];
 
sort($dinos);
echo "nombres de los dinos : \n";
foreach($dinos as $element) {
    echo str_pad($element, 5)." ";
}

 
function palabras_acomodadas($palabra_a, $palabra_b) {
    if (strlen($palabra_a) > strlen($palabra_b)) {
        return -1;
    }
    if (strlen($palabra_a) == strlen($palabra_b)) {
        return strcmp($palabra_a, $palabra_b);
    }
    if (strlen($palabra_a) < strlen($palabra_b)) {
        return 1;
    }
}
 
usort($dinos, "palabras_acomodadas");
echo "\npalabras_acomodadas : \n";
foreach($dinos as $element) {
    echo str_pad($element, 5)." ";
}



?>
