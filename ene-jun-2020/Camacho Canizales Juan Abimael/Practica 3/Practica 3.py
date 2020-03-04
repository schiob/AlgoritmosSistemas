def bubbleSort(cadenas):
    for i in range(len(cadenas)):
        for j in range (1, len(cadenas)-i):
            if len(cadenas[j-1]) > len(cadenas[j]):
                temp = cadenas[j-1]
                cadenas[j - 1] = cadenas[j]
                cadenas[j] = temp

# imprime en pantalla los valores de un arreglo
def printArray(arr):
     for i in range(len(arr)):
         print(arr[i])

n = input("Numero de medicamentos: ") #pedir número de medicamentos
cadenas = []
# pedir nombre de cada medicamento
for i in range(int(n)):
    cadenas.append(input(str(i + 1) + ".-"))

print("\nLista ordenada:")
bubbleSort(cadenas) #ordena los medicamentos
printArray(cadenas) #lista las palabras

