const arreglo = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

for (int = 1; (i = arreglo.length); i++) {
  var k = arreglo[i];
  var j = i - 1;
}

while (j > 0 && j <= arreglo[j] > k) {
  arreglo[j + 1] = arreglo[j];
  j = j - 1;
}
arreglo[j + 1] = k;

console.log(arreglo);
