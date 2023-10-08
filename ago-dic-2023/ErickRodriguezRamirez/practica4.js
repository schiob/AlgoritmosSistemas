var arr = []; //se crea el arreglo
var  palabra;
//pedir el número de palabras mediante un ciclo
for (var i = 0; i < 5; i++) {
  palabra = prompt("Ingresa las palabras que quieres añadir:");
  arr.push(palabra);
}
//se aplica algoritmo de insertion sort para acomodar palabras de orden alfabetico
for (var i = 1; i < arr.length; i++) {
  var k = arr[i];
  var j = i - 1;

  while (j >= 0 && arr[j] > k) {
    arr[j + 1] = arr[j];
    j = j - 1;
  }
  arr[j + 1] = k;
}
console.log(arr);
