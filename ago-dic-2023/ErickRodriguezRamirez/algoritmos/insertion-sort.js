const arreglo = [10, 3, 7, 1, 8, 2, 4, 9, 6, 5]; // Ejemplo de un arreglo desordenado

for (var i = 1; i < arreglo.length; i++) {
  var k = arreglo[i];
  var j = i - 1;

  while (j >= 0 && arreglo[j] > k) {
    arreglo[j + 1] = arreglo[j];
    j = j - 1;
  }

  arreglo[j + 1] = k;
}

console.log(arreglo); // Imprime el arreglo ordenado

