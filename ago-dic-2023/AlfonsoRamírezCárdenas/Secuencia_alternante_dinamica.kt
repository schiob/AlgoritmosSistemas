fun main() {
    println("Ingrese números enteros; positivos y negativos, separados por espacios para formar el arreglo:")
    val input = readLine()
    val arreglo = input?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toIntArray()

    if (arreglo != null) {
        val resultado = encontrarSubsecuenciaAlternanteDinamica(arreglo)
        println("La longitud de la subsecuencia alternante más larga es: ${resultado.first}")
        println("La subsecuencia alternante más larga es: ${resultado.second.joinToString(" ")}")
    } else {
        println("Error: Ingrese números enteros válidos.")
    }
}
fun encontrarSubsecuenciaAlternanteDinamica(arreglo: IntArray): Pair<Int, List<Int>> {
    val n = arreglo.size
    val dp = IntArray(n) { 1 }
    val predecesor = IntArray(n) { -1 }

    for (i in 1 until n) {
        for (j in 0 until i) {
            if ((arreglo[i] > 0 && arreglo[j] < 0) || (arreglo[i] < 0 && arreglo[j] > 0)) {
                if (dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1
                    predecesor[i] = j
                }
            }
        }
    }
    var maxIndex = dp.indexOf(dp.maxOrNull() ?: 1)
    val subsecuencia = mutableListOf<Int>()

    while (maxIndex != -1) {
        subsecuencia.add(arreglo[maxIndex])
        maxIndex = predecesor[maxIndex]
    }
    return Pair(dp.maxOrNull() ?: 1, subsecuencia.reversed())
}
