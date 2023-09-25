//lista de puntos de cada pokemon
var arr = [1980, 2012, 1764, 1543, 1500, 1989];

var i, min_index, j;

for (i = 0; i < arr.length - 1; i++) {
    min_index = i;

    for (j = i + 1; j < arr.length; j++) {
        // Se busca el mayor
        if (arr[j] > arr[min_index]) {
            min_index = j;
        }
    }

    // Intercambiar arr[i] con el elemento más pequeño encontrado
    var temp = arr[i];
    arr[i] = arr[min_index];
    arr[min_index] = temp;

    console.log("ORDEN DE MAYOR PUNTOS DE PODER A MENOR");
    console.log(arr);
}
