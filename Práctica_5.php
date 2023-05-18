<?php

class Practica5{
function merge($arr1, $arr2) {
    $result = [];
    $i = $j = 0;
    while ($i < count($arr1) && $j < count($arr2)) {
        $value1 = $this->getValue($arr1[$i]);
        $value2 = $this->getValue($arr2[$j]);

        if ($value1 < $value2) {
            $result[] = $arr1[$i];
            $i++;
        } elseif ($value1 > $value2) {
            $result[] = $arr2[$j];
            $j++;
        } else {
            $suit1 = $this->getSuit($arr1[$i]);
            $suit2 = $this->getSuit($arr2[$j]);

            if ($suit1 < $suit2) {
                $result[] = $arr1[$i];
                $i++;
            } else {
                $result[] = $arr2[$j];
                $j++;
            }
        }
    }
    while ($i < count($arr1)) {
        $result[] = $arr1[$i];
        $i++;
    }
    while ($j < count($arr2)) {
        $result[] = $arr2[$j];
        $j++;
    }
    return $result;
}

function sortHand($hand) {
    return $this->mergeSort($hand);
}

function mergeSort($arr) {
    $length = count($arr);
    if ($length <= 1) {
        return $arr;
    }
    $mid = (int) ($length / 2);
    $left = array_slice($arr, 0, $mid);
    $right = array_slice($arr, $mid);

    $left = $this->mergeSort($left);
    $right = $this->mergeSort($right);

    return $this->merge($left, $right);
}

function getValue($card) {
    $valueMap = [
        'A' => 1,
        '2' => 2,
        '3' => 3,
        '4' => 4,
        '5' => 5,
        '6' => 6,
        '7' => 7,
        '8' => 8,
        '9' => 9,
        'T' => 10,
        'J' => 11,
        'Q' => 12,
        'K' => 13
    ];
    $value = substr($card, 0, 1);
    return $valueMap[$value];
}

function getSuit($card) {
    $suit = substr($card, 1, 1);
    return $suit;
}
}

$numManos = 2;
$class = new Practica5();
$manos = [
    ['AT', '2C', '3E', '4D'],
    ['3T', '3C', 'TE', '3D', '2D'],
    ['TE', 'AE']
];
$manosOrdenadas = [];
foreach ($manos as $mano) {
    $manoOrdenada = $class->sortHand($mano);
    $manosOrdenadas[] = $manoOrdenada;
}
foreach ($manosOrdenadas as $mano) {
    echo implode(' ', $mano) . "<br>";
}