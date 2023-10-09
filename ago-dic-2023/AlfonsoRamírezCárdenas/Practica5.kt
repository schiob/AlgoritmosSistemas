package Ejercicios

fun mergeSortDinosaurios(dinosaurios: List<String>): List<String> {
    if (dinosaurios.size <= 1) {
        return dinosaurios
    }

    val medio = dinosaurios.size / 2
    val izquierda = dinosaurios.subList(0, medio)
    val derecha = dinosaurios.subList(medio, dinosaurios.size)

    val izquierdaOrdenada = mergeSortDinosaurios(izquierda)
    val derechaOrdenada = mergeSortDinosaurios(derecha)

    return mergeDinosaurios(izquierdaOrdenada, derechaOrdenada)
}

fun mergeDinosaurios(izquierda: List<String>, derecha: List<String>): List<String> {
    val resultado = mutableListOf<String>()
    var i = 0
    var j = 0

    while (i < izquierda.size && j < derecha.size) {
        if (izquierda[i].length < derecha[j].length) {
            resultado.add(izquierda[i])
            i++
        } else {
            resultado.add(derecha[j])
            j++
        }
    }

    resultado.addAll(izquierda.subList(i, izquierda.size))
    resultado.addAll(derecha.subList(j, derecha.size))

    return resultado
}

fun main() {
    println("Introduce los nombres de los dinosaurios separados por espacios:")

    val input = readLine() ?: ""
    val dinosaurios = input.split(" ")

    val dinosauriosOrdenados = mergeSortDinosaurios(dinosaurios)

    println("Lista de dinosaurios ordenados de más corto a más largo:")
    println(dinosauriosOrdenados.joinToString(", "))
}