data class Libro(val nombre: String, val paginas: Int)

fun mergeSort(arr: MutableList<Libro>) {
    if (arr.size <= 1) return

    val medio = arr.size / 2
    val izquierda = arr.subList(0, medio)
    val derecha = arr.subList(medio, arr.size)

    mergeSort(izquierda)
    mergeSort(derecha)

    var i = 0
    var j = 0
    var k = 0

    while (i < izquierda.size && j < derecha.size) {
        if (izquierda[i].paginas < derecha[j].paginas) {
            arr[k] = izquierda[i]
            i++
        } else {
            arr[k] = derecha[j]
            j++
        }
        k++
    }

    while (i < izquierda.size) {
        arr[k] = izquierda[i]
        i++
        k++
    }

    while (j < derecha.size) {
        arr[k] = derecha[j]
        j++
        k++
    }
}

fun main() {
    print("Introduce la cantidad de libros ")
    val n = readLine()!!.toInt()

    val libros = mutableListOf<Libro>()

    for (i in 1..n) {
        print("Introduce el título y el número de páginas del libro $i (separados por un espacio): ")
        val (nombre, paginas) = readLine()!!.split(" ")
        libros.add(Libro(nombre, paginas.toInt()))
    }

    mergeSort(libros)

    println("\nLista de libros ordenados por número de páginas (de menor a mayor):")
    for (libro in libros) {
        println("${libro.nombre} - ${libro.paginas} páginas")
    }
}
