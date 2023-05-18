<?php

class Grafo{
    function bfs($matriz, $inicio, $destino) {
        $num_nodos = count($matriz);
        $visitados = array_fill(0, $num_nodos, false);
        $cola = new SplQueue();
        $visitados[$inicio] = true;
        $ruta_inicial = array($inicio);
        $cola->enqueue($ruta_inicial);
        while (!$cola->isEmpty()) {
            $ruta_actual = $cola->dequeue();
            $nodo_actual = end($ruta_actual);
            if ($nodo_actual === $destino) {
                return $ruta_actual;
            }
            for ($nodo_adyacente = 0; $nodo_adyacente < $num_nodos; $nodo_adyacente++) {
                if (!$visitados[$nodo_adyacente] && $matriz[$nodo_actual][$nodo_adyacente] == 1) {
                    $visitados[$nodo_adyacente] = true;
                    $ruta_nueva = $ruta_actual;
                    $ruta_nueva[] = $nodo_adyacente;
                    $cola->enqueue($ruta_nueva);
                }
            }
        }
        return null;
    }

    function print($a){
        for ($i=0; $i < count($a); $i++) { 
            echo $a[$i] . " ";
        }
    }
}

$Matriz = array(
    array(0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0),
    array(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1),
    array(1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    array(1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0),
    array(0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
    array(0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0),
    array(0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
    array(1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    array(1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    array(0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0),
    array(0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    array(0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
    array(0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
    array(0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    array(0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0),
    array(0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
);
$grafo = new Grafo();
$a = $grafo->bfs($Matriz, 0, 13);
$grafo->print($a);