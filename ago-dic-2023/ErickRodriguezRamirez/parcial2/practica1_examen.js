function quickSortAutos(autos) {
    if (autos.length <= 1) {
      return autos;
    }
  
    const pivot = autos[0];
    const left = [];
    const right = [];
  
    for (let i = 1; i < autos.length; i++) {
      if (autos[i].kilometraje >= pivot.kilometraje) {
        left.push(autos[i]);
      } else {
        right.push(autos[i]);
      }
    }
  
    return quickSortAutos(left).concat(pivot, quickSortAutos(right));
  }
  
  // Pedir los datos de entrada en una sola línea
  var input = prompt("Ingresa los datos de los autos en una sola línea (nombre y kilometraje separados por espacio):");
  var inputArray = input.split(" ");
  var autos = [];
  
  for (let i = 0; i < inputArray.length; i += 2) {
    var nombre = inputArray[i];
    var kilometraje = parseInt(inputArray[i + 1]);
    autos.push({ nombre, kilometraje });
  }
  
  var autosOrdenados = quickSortAutos(autos) // Ordenar de mayor a menor y luego invertir
  console.log("Autos ordenados por kilometraje de mayor a menor:");
  for (let i = 0; i < autosOrdenados.length; i++) {
    console.log(autosOrdenados[i].nombre + " " + autosOrdenados[i].kilometraje);
  }
  