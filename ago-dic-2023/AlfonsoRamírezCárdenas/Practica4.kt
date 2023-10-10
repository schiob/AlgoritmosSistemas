fun seleccionSort(arregloPalabras: MutableList<String>) {
    val n = arregloPalabras.size

    for (i in 0 until n - 1) {
        var minIndex = i

        // Encuentra el índice de la palabra más pequeña en la lista no ordenada
        for (j in i + 1 until n) {
            if (arregloPalabras[j] < arregloPalabras[minIndex]) {
                minIndex = j
            }
        }

        // Intercambia la palabra más pequeña con la palabra en la posición actual
        val temp = arregloPalabras[i]
        arregloPalabras[i] = arregloPalabras[minIndex]
        arregloPalabras[minIndex] = temp
    }
}

fun main() {
    println("Por favor, ingrese el número de palabras:")

    val n = readLine()!!.toInt()

    if (n <= 0) {
        println("El número de palabras debe ser mayor que cero.")
        return
    }

    println("Ahora ingrese las $n palabras separadas por espacios:")

    val palabras = readLine()?.split(" ")?.toMutableList()

    if (palabras == null || palabras.size != n) {
        println("No ingresó la cantidad correcta de palabras.")
        return
    }

    seleccionSort(palabras)

    println("Lista de palabras ordenadas alfabéticamente:")
    println(palabras.joinToString(" "))
}
