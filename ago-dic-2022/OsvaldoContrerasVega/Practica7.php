<?php

function quicksort(&$Array, $left, $right) {
    if ($left < $right) { 
      $pivot = partition($Array, $left, $right);
      quicksort($Array, $left, $pivot-1);
      quicksort($Array, $pivot+1, $right);
    }
  }
   
  function partition(&$Array, $left, $right) {
    $i = $left;
    $pivot = $Array[$right];
    for($j = $left; $j <=$right; $j++) {
      if($Array[$j] < $pivot) {
        $temp = $Array[$i];
        $Array[$i] = $Array[$j];
        $Array[$j] = $temp;
        $i++;
      }
    }
  
    $temp = $Array[$right];
    $Array[$right] = $Array[$i];
    $Array[$i] = $temp;
    return $i;
  }
  
  // function to print array
  function PrintArray($Array, $n) { 
    for ($i = 0; $i < $n; $i++) 
      echo $Array[$i]." "; 
    echo "\n";
  }

  function binarySearch(Array $MyArray, $start, $end, $x){
    if ($end < $start)
        return -1. ;
   
    $mid = floor(($end + $start)/2);
    if ($MyArray[$mid] == $x) 
        return $mid;
        
  
    elseif ($MyArray[$mid] > $x) {
  
       
        return binarySearch($MyArray, $start, $mid - 1, $x);
    }
    else {
  
        return binarySearch($MyArray, $mid + 1, $end, $x);
    }
    
}
  

  
  
  $MyArray = array("TheLeyendOfZelda", "SuperMario64",
   "MegaMan3", "PokemonBlue", "MetalSlug2    ");
  $n = 5; //cuantas son
  $q = 3; // cuantos elementos a buscar
  $values = ["SuperMario64","PokemonBlue",
  "PokemonRed"]; //valores a buscar

  echo "Original Array "."<br>";
  PrintArray($MyArray, $n);
  
  quicksort($MyArray, 0, $n-1);
  echo "<br>"."\nSorted Array\n"."<br>";
  PrintArray($MyArray, $n);

  for($i = 0; $q>$i; $i++){
    $value = $values[$i];
  $a=binarySearch($MyArray, 0, count($MyArray) - 1, $value);
  echo "<br>"."el valor ".$value. " esta en la posicion ".$a ;
    
}


?>