<?php
function binarySearch(Array $arr, $start, $end, $x){
    if ($end < $start)
        return false;
   
    $mid = floor(($end + $start)/2);
    if ($arr[$mid] == $x) 
        return $mid;
        
  
    elseif ($arr[$mid] > $x) {
  
        // call binarySearch on [start, mid - 1]
        return binarySearch($arr, $start, $mid - 1, $x);
    }
    else {
  
        // call binarySearch on [mid + 1, end]
        return binarySearch($arr, $mid + 1, $end, $x);
    }
}
  
// Driver code
$arr = array('TacosPastor', 'Teclado', 'Audifonos', 'NintendoSwitch', 'Iphone');
$value = 'NintendoSwitch';
$a=binarySearch($arr, 0, count($arr) - 1, $value) + 1;
echo "<br>"."el valor ".$value. " esta en la posicion ".$a ;

?>