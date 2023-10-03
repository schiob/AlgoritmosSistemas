#Lee la cantidad de palabras
n = int(input("Ingrese el numero de palabras "))

#Lee las palabras ingresadas
palabras = input("Ingrese las palabras ").split()

#Utilice el mismo algoritmo de ordenamiento que la practica 3
for i in range(len(palabras)):
    pequeño = i
    for j in range(i + 1, len(palabras)):
        if palabras[j] < palabras[pequeño]:
            pequeño = j
    palabras[i], palabras[pequeño] = palabras[pequeño], palabras[i]

#Imprime la lista de palabras 
print("Estas son las palabras ordenadas: ",palabras)

#Ejemplos:
#text2a text2 text2a12 a a12 text2a2 b2