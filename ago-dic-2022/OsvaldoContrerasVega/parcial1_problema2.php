<?php 
class mergeS {
    function mergeSort(&$arr){
        
        
        if(count($arr) > 1) {
            $mid = (count($arr)/2);// sustitui el $numerodelibros n por count
                                   //n era el numero de elementos 
            $mid = round($mid);
            $left = array_slice($arr, 0, $mid);
            $right = array_slice($arr, $mid);
            

            
            $this->mergeSort($right);
            $this->mergeSort($left);
            

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
$numeroLibros = 5;
$tmp = [ '777 GodelEscherBach ', '541 Mistborn', '469 CleanCode', '96 Flatland ','245 HarryPotter'];//elementos a ordenar
$s->mergeSort($tmp, 5);
//


print_r($tmp);

//HarryPotter 245, GodelEscherBach 777, Flatland 96,  541,CleanCode 469
//text2a, text2, text2a12, a, a12, text2a2, b2]
?>