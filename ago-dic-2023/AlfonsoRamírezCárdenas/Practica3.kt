fun selectionSortDescending(arreglo: MutableList<Int>) {
    val n = arreglo.size

    for (i in 0 until n - 1) {
        // Encontrar el índice del elemento máximo en la lista desordenada
        var masGrande = i
        for (j in i + 1 until n) {
            if (arreglo[j] > arreglo[masGrande]) {
                masGrande = j
            }
        }

        // Intercambiar el elemento máximo con el primer elemento de la lista desordenada
        val temp = arreglo[i]
        arreglo[i] = arreglo[masGrande]
        arreglo[masGrande] = temp
    }
}

fun main() {

    println("Por favor, ingrese el número de Pokémon que desea ordenar:")

    // Lectura del número de Pokémon
    val n = readLine()?.toIntOrNull()

    if (n == null || n < 1 || n > 50) {
        println("Cantidad de Pokémon no válida. Debe ser un número entre 1 y 50.")
        return
    }

    println("Ingrese los poderes (CP) de los $n Pokémon, separados por espacios:")

    // Lectura de los poderes de los Pokémon
    val powers = readLine()?.split(" ")?.mapNotNull { it.toIntOrNull() }?.toMutableList()

    if (powers == null || powers.size != n) {
        println("Entrada no válida. Asegúrese de ingresar $n poderes válidos.")
        return
    }

    // Ordenar los poderes de los Pokémon de mayor a menor
    selectionSortDescending(powers)

    // Imprimir la lista ordenada
    println("Lista ordenada de Pokémon por poder (CP) de mayor a menor:")
    println(powers.joinToString(" "))
}