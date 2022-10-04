<?php 
class mergeS {
    function mergeSort(&$arr){
        
        if(count($arr) > 1) {
            $mid = (count($arr)/2);// sustitui el n por count
                                   //n era el numero de elementos 
            
            $left = array_slice($arr, 0, $mid);
            $right = array_slice($arr, $mid);
            

            $this->mergeSort($left);
            $this->mergeSort($right);

            // ordenamos izq y derecha
            $i = 0;
            $j = 0;
            $k = 0;
            while(($i < count($left)) && ($j < count($right))) {
                if($left[$i] < $right[$j]) {
                    $arr[$k] = $left[$i];
                    $i++;
                } else {
                    $arr[$k] = $right[$j];
                    $j++;
                }
                $k++;
            }

            while($i < count($left)) {
                $arr[$k] = $left[$i];
                $i++;
                $k++;
            }

            while($j < count($right)) {
                $arr[$k] = $right[$j];
                $j++;
                $k++;
            }
        }
    }
}

$s = new mergeS();
//$tmp = [3,2,5,7,8,1,0,5];
$tmp = ["naproxeno", "paracetamol", "rimantadina", "azitromicina", "ibuprofeno"];//elementos a ordenar
$s->mergeSort($tmp, 5);
print_r($tmp);

//text2a, text2, text2a12, a, a12, text2a2, b2]
?>