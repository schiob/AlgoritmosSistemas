function countingSort(arr, exp1) {
    const n = arr.length;
    const output = new Array(n);
    const count = new Array(10).fill(0);

  
    for (let i = 0; i < n; i++) {
        const index = Math.floor(arr[i] / exp1) % 10; 
        count[index] += 1;
    }

 
    for (let i = 1; i < 10; i++) {
        count[i] += count[i - 1]; 
    }

    for (let i = n - 1; i >= 0; i--) {
        const index = Math.floor(arr[i] / exp1) % 10; 
        output[count[index] - 1] = arr[i]; 
        count[index] -= 1;
    }


    for (let i = 0; i < n; i++) {
        arr[i] = output[i];
    }
}

function radixSort(arr) {
    const max1 = Math.max(...arr); 
    let exp = 1;


    while (Math.floor(max1 / exp) >= 1) {
        countingSort(arr, exp);
        exp *= 10;
    }
}

const NumeroPos = parseInt(prompt("Ingresa el número de posiciones"));
const numeros = prompt("Ingresa los números por ordenar").split(" ").map(Number);

radixSort(numeros); // Aquí debes usar 'numeros' en lugar de 'numeros'
console.log("El arreglo ordenado es: " + " "+numeros);

