
function merge(arr){
if (length(arr)==1){
    return arr
}

var medio =length(arr)/2
var arr_izq = arr[medio]
var arr_der = arr[medio]

var sort_izq_arr= merge(arr_izq)
var sort_der_arr= merge(arr_der)
return merge

function Merge_combinacion(izq_Arr,der_Arr){

    Arr_resultad = []
    while (length(izq_Arr)>0 && length(der_Arr)){
        if (izq_Arr>arr_der){
            Arr_resultad.push(der_Arr[0])
            der_Arr.pop(0)
        }
        else{
            Arr_resultad.push(izq_Arr[0])
            izq_Arr.pop(0)
        }

        while (length(der_Arr)>0){
            Arr_resultad.push(der_Arr[0])
            der_Arr.pop(0)
        }
        while (length(izq_Arr)>0){
            Arr_resultad.push(izq_Arr[0])
            izq_Arr.pop(0)
        }
    }
    return Arr_resultad
    console.log(Arr_resultad)
}
var resultado = prompt("Ingresa los nombres de dinosaurios separados por espacios");
var arr = resultado.split(" "); // Divide la línea en un arreglo usando espacios como separadores

}