<?php

class Concursante {
    public $nombre;
    public $oro;
    public $plata;
    public $bronce;

    function __construct($nombre, $oro, $plata, $bronce) {
        $this->nombre = $nombre;
        $this->oro = $oro;
        $this->plata = $plata;
        $this->bronce = $bronce;
    }
}

function particion(&$arr, $left, $right) {
    $pivote = $arr[$right];
    $i = $left - 1;

    for ($j = $left; $j < $right; $j++) {
        if (compararConcursantes($arr[$j], $pivote) <= 0) {
            $i++;
            intercambiar($arr, $i, $j);
        }
    }
    intercambiar($arr, $i + 1, $right);
    return $i + 1;
}

function quicksort(&$arr, $left, $right) {
    if ($left < $right) {
        $pivote = particion($arr, $left, $right);
        quicksort($arr, $left, $pivote - 1);
        quicksort($arr, $pivote + 1, $right);
    }
}

function compararConcursantes($a, $b) {
    if ($a->oro > $b->oro) {
        return -1;
    } elseif ($a->oro < $b->oro) {
        return 1;
    }
    if ($a->plata > $b->plata) {
        return -1;
    } elseif ($a->plata < $b->plata) {
        return 1;
    }
    if ($a->bronce > $b->bronce) {
        return -1;
    } elseif ($a->bronce < $b->bronce) {
        return 1;
    }
    return strcmp($a->nombre, $b->nombre);
}

function intercambiar(&$arr, $i, $j) {
    $temp = $arr[$i];
    $arr[$i] = $arr[$j];
    $arr[$j] = $temp;
}

$n = 6;

$concursantes = [
    new Concursante("David", 10, 8, 0),
    new Concursante("Mario", 10, 7, 2),
    new Concursante("Saul", 12, 0, 4),
    new Concursante("Francisco", 10, 7, 0),
    new Concursante("Luis", 12, 0, 4),
    new Concursante("Karla", 15, 5, 0)
];

quicksort($concursantes, 0, $n - 1);

foreach ($concursantes as $concursante) {
    echo $concursante->nombre . "<br>";
}