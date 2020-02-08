/* Arrow function que retornará un string con la lista ordenada invertida de números pares
dado un string que contiene números. */
const reversedInsertionSort = (reversed) => {
   /* Se inicializa un arreglo utilizando la función split dada por números separados por un espacio. */
   let reversed_array = reversed.split(' ');
   /* Se declara un arreglo vacío al que se le agregarán sólo los números que sean pares. */
   let even_reversed_array = [];
   /* Ciclo que iterará dependiendo del tamaño del arreglo creado mediante split.
   En caso de que sea número par el valor se le agregará al arreglo de números pares. */
   for (let i in reversed_array){
       if(reversed_array[i] %2 == 0){
           even_reversed_array.push(parseInt(reversed_array[i]));
       }
   }
   /* Declaro una variable que manejará el valor actual, o bien, que funcionará como pivote. */
   let actual;
   /* Ciclo que se encargará de la magia. */
   for (let i in even_reversed_array){
       /* Guardamos el valor actual en una variable temporal. */
       actual = even_reversed_array[i];
       /* Aquí ocurre la magia del ordenamiento. */
       while(i>0 && even_reversed_array[i-1]<actual){
           even_reversed_array[i] = even_reversed_array[i-1];
           i = i-1;
           even_reversed_array[i] = actual;
       }
   }
   /* Declaro una variable donde se guardará el resultado final de la lista ordenada invertida. */
   let mensaje_final = "";
   for(let i in even_reversed_array){
       mensaje_final += even_reversed_array[i] + " ";
   }
   /* Retorno el mensaje final. */
   return mensaje_final;
}

function processData(input) {
  /* Imprimo la respuesta. */
  process.stdout.write(reversedInsertionSort(input));
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
   _input += input;
});

process.stdin.on("end", function () {
  processData(_input);
});
