var resultado = prompt("Ingresa los nombres de los libros separados por espacios");
var arr = resultado.split(" "); // Divide la línea en un arreglo usando espacios como separadores

function merge(arr) {
    if (arr.length <= 1) {
        return arr;
    }

    var medio = Math.floor(arr.length / 2)
    var arr_izq = arr.slice(0, medio)
    var arr_der = arr.slice(medio)

    var sort_izq_arr = merge(arr_izq)
    var sort_der_arr = merge(arr_der)

    return merge_combinacion(sort_izq_arr, sort_der_arr)
}

function merge_combinacion(izq_Arr, der_Arr) {
    var Arr_resultado = [];
    while (izq_Arr.length > 0 && der_Arr.length > 0) {
        if (izq_Arr[0] > der_Arr[0]) { 
            Arr_resultado.push(izq_Arr.shift())
        } else {
            Arr_resultado.push(der_Arr.shift())
        }
    }

    while (izq_Arr.length > 0) {
        Arr_resultado.push(izq_Arr.shift())
    }

    while (der_Arr.length > 0) {
        Arr_resultado.push(der_Arr.shift())
    }

    return Arr_resultado
}
console.log(merge(arr)) 