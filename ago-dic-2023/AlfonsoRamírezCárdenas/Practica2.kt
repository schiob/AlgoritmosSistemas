fun insertionSort(arr: IntArray) {
    for (i in 1 until arr.size) {
        val valActual = arr[i]
        var j = i - 1
        while (j >= 0 && valActual < arr[j]) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = valActual
    }
}

fun main() {
    println("Ingrese el número de problemas y el tiempo disponible (n m):")
    val input = readLine()!!.split(" ").map { it.toInt() }
    val n = input[0]
    val m = input[1]

    println("Ingrese el tiempo que le toma resolver cada problema (separados por espacios):")
    val problemas = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    insertionSort(problemas)

    var problemasResueltos = 0
    var tiempoTotal = 0

    for (tiempo in problemas) {
        if (tiempoTotal + tiempo <= m) {
            problemasResueltos++
            tiempoTotal += tiempo
        } else {
            break
        }
    }

    println("David puede resolver $problemasResueltos problemas en $tiempoTotal minutos.")
}