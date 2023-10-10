fun seleccionSort(arregloMedicinas: MutableList<String>) {
    val n = arregloMedicinas.size

    for (i in 0 until n - 1) {
        var minIndex = i

        // Encuentra el índice de la palabra más pequeña en la lista no ordenada
        for (j in i + 1 until n) {
            if (arregloMedicinas[j] < arregloMedicinas[minIndex]) {
                minIndex = j
            }
        }

        // Intercambia la palabra más pequeña con la palabra en la posición actual
        val temp = arregloMedicinas[i]
        arregloMedicinas[i] = arregloMedicinas[minIndex]
        arregloMedicinas[minIndex] = temp
    }
}

fun main() {
    println("Por favor, ingrese el número de medicinas:")

    val n = readLine()!!.toInt()

    if (n <= 0) {
        println("El número de medicinas debe ser mayor que cero.")
        return
    }

    println("Ahora ingrese las $n medicinas separadas por espacios:")

    val medicinas = readLine()?.split(" ")?.toMutableList()

    if (medicinas == null || medicinas.size != n) {
        println("No ingresó la cantidad correcta de medicinas.")
        return
    }

    seleccionSort(medicinas)

    println("Lista de medicinas ordenadas alfabéticamente:")
    println(medicinas.joinToString(" "))
}