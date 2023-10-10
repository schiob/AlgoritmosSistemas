function quick_sort(arr, low, high) {
    if (low < high) {
      var pi = partition(arr, low, high);
      quick_sort(arr, low, pi - 1); // Ordenar la partición izquierda
      quick_sort(arr, pi + 1, high); // Ordenar la partición derecha
    }
  }
  
  function partition(arr, low, high) {
    var pivot = arr[high];
    var i = low - 1;
  
    for (var j = low; j < high; j++) {
      if (arr[j] <= pivot) {
        i++;
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
  
    var temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
  
    return i + 1;
  }
  
  // Ejemplo de uso:
  var arr = [10, 7, 8, 9, 1, 5];
  var n = arr.length;
  quick_sort(arr, 0, n - 1);
  console.log(arr);
  