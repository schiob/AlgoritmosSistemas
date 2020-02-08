# Cantidad de elementos que se ingresarán.
list_length = int(input('Ingresa la cantidad de elementos que deseas agregar. \n'))
# Declaro que utilizaré una lista en la que se guardarán después los elementos.
list = []
# Ciclo para agregar elementos a la lista.
for i in range(0,list_length):
    list.append(int(input('Dame un número para la posición [{}] de la lista. \n'.format(i))))

# Función para ordenar de forma inversa los números.
def insertionSort(reversed_list):
    # Lista que contendrá sólo numeros pares.
    even_reversed_list = []
    # Ciclo para iterar toda la lista.
    for i in range(0,len(reversed_list)):
        # Aquí obtendré sólo los números pares y se le añadirán a la lista de pares.
        if reversed_list[i]%2 == 0:
            even_reversed_list.append(reversed_list[i])
    # Ciclo para iterar toda la lista.
    for i in range(0,len(even_reversed_list)):
        print('Soy i: {}'.format(i))
        # Se guarda el valor de dicha posición como un pivote del arreglo.
        current = even_reversed_list[i]
        # Ciclo en el cual mientras la i sea mayor a 0 y el valor de la lista en i-1 sea menor que el pivote
        # ejecutará una serie de instrucciones.
        while i>0 and even_reversed_list[i-1]<current:
            print('Soy i del while: {}'.format(i))
            even_reversed_list[i] = even_reversed_list[i-1]
            i = i-1
            even_reversed_list[i] = current
    # Retornamos la lista ordenada de forma invertida.
    return even_reversed_list

print('Lista ordenada: {}'.format(insertionSort(list)))
