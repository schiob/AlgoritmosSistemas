fun getMax(arr: IntArray): Int {
    var max = arr[0]
    for (element in arr) {
        if (element > max) {
            max = element
        }
    }
    return max
}

fun countSort(arr: IntArray, exp: Int) {
    val n = arr.size
    val output = IntArray(n)
    val count = IntArray(10) { 0 }

    for (i in 0 until n) {
        count[(arr[i] / exp) % 10]++
    }

    for (i in 1 until 10) {
        count[i] += count[i - 1]
    }

    for (i in n - 1 downTo 0) {
        output[count[(arr[i] / exp) % 10] - 1] = arr[i]
        count[(arr[i] / exp) % 10]--
    }

    for (i in 0 until n) {
        arr[i] = output[i]
    }
}

fun radixSort(arr: IntArray) {
    val max = getMax(arr)
    for (exp in 1 until max) {
        countSort(arr, exp)
    }
}

fun main() {
    print("Ingresa la cantidad de números en la lista: ")
    
    val n = readLine()!!.toInt()
    val numbers = IntArray(n)

    print("Ingresa los números separados por espacios: ")
    val input = readLine()!!.split(" ")

    for (i in 0 until n) {
        numbers[i] = input[i].toInt()
    }

    radixSort(numbers)

    println("\nLista de números ordenados de menor a mayor:")
    for (number in numbers) {
        print("$number ")
    }
}
