fun main() {
    println("Ingrese números enteros separados por espacios para formar el arreglo:")
    val input = readLine()
    val arreglo = input?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray()

    if (arreglo != null) {
        val resultado = encontrarSubsecuenciaAlternanteLineal(arreglo)
        val longitudSubsecuencia = resultado.first
        val subsecuencia = resultado.second

        println("La longitud de la subsecuencia alternante más larga es: $longitudSubsecuencia")
        println("La subsecuencia alternante más larga es: $subsecuencia")
    } else {
        println("Error: Ingrese números enteros válidos.")
    }
}

fun encontrarSubsecuenciaAlternanteLineal(arreglo: IntArray): Pair<Int, List<Int>> {
    if (arreglo.isEmpty()) return Pair(0, emptyList())

    var longitudMaxima = 1
    var longitudActual = 1
    var inicioSubsecuencia = 0
    var inicioMaximo = 0

    for (i in 1 until arreglo.size) {
        if ((arreglo[i] > 0 && arreglo[i - 1] < 0) || (arreglo[i] < 0 && arreglo[i - 1] > 0)) {
            longitudActual++
            if (longitudActual > longitudMaxima) {
                longitudMaxima = longitudActual
                inicioMaximo = inicioSubsecuencia
            }
        } else {
            longitudActual = 1
            inicioSubsecuencia = i
        }
    }

    val subsecuencia = arreglo.copyOfRange(inicioMaximo, inicioMaximo + longitudMaxima).toList()

    return Pair(longitudMaxima, subsecuencia)
}

