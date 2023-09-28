// Lista de puntos de poder de Pokémon
var arr = [];

var i, min_index, j, pokemon;

for (var k = 0; k < 6; k++) {
  // Solicitar al usuario que ingrese el punto de poder del Pokémon
  pokemon = parseInt(prompt("Ingresa el punto de poder del Pokémon:"));
  arr.push(pokemon); // Agregar el punto de poder a la lista
}

for (i = 0; i < arr.length - 1; i++) {
  min_index = i;

  for (j = i + 1; j < arr.length; j++) {
    // Se busca el mayor
    if (arr[j] > arr[min_index]) {
      min_index = j;
    }
  }

  // Intercambiar arr[i] con el elemento más grande encontrado
  var temp = arr[i];
  arr[i] = arr[min_index];
  arr[min_index] = temp;
}

console.log("ORDEN DE MAYOR PUNTOS DE PODER A MENOR");
console.log(arr);