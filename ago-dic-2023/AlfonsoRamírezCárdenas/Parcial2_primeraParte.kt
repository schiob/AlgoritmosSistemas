fun main() {
    print("Ingrese la cantidad de autos en la lista: ")
    val n = readLine()!!.toInt()

    val autos = mutableListOf<Pair<String, Int>>()

    for (i in 1..n) {
        print("Ingrese el nombre del auto y su kilometraje separados por un espacio (Ejemplo: camaro 150000): ")
        val (nombre, kilometraje) = readLine()!!.split(" ")
        autos.add(nombre to kilometraje.toInt())
    }

    quickSort(autos, 0, n - 1)

    println("\nLista de autos ordenados por kilometraje (de mayor a menor):")
    for (auto in autos) {
        println("${auto.first}: ${auto.second} km")
    }
}

fun quickSort(autos: MutableList<Pair<String, Int>>, low: Int, high: Int) {
    if (low < high) {
        val pivotIndex = partition(autos, low, high)
        quickSort(autos, low, pivotIndex - 1)
        quickSort(autos, pivotIndex + 1, high)
    }
}

fun partition(autos: MutableList<Pair<String, Int>>, low: Int, high: Int): Int {
    val pivot = autos[high].second
    var i = low - 1

    for (j in low until high) {
        if (autos[j].second >= pivot) {
            i++
            val temp = autos[i]
            autos[i] = autos[j]
            autos[j] = temp
        }
    }

    val temp = autos[i + 1]
    autos[i + 1] = autos[high]
    autos[high] = temp

    return i + 1
}


