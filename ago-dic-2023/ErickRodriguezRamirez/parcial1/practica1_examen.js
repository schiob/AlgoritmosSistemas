var arr = []; //se crea el arreglo
var numeroMedicinas, NombreMedicinas

numeroMedicinas = parseInt(prompt("Ingresa el número de medicinas"))
NombreMedicinas = prompt("Ingresa el nombre de medicinas")
arr.push(NombreMedicinas);
var arr = NombreMedicinas.split(" "); //se divide la línea usando el espacio como separadores
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
console.log(numeroMedicinas + " " + arr)
