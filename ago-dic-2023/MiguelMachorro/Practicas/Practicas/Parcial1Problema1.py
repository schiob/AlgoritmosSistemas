#Problema 1
#Lee la cantidad de medicinas para el profe chio
n = int(input("Ingrese el numero medicinas "))

#Lee las palabras ingresadas
medicinas = input("Ingrese las medicinas ").split()

#Utilice Selectionsort
for i in range(len(medicinas)):
    pequeño = i
    for j in range(i + 1, len(medicinas)):
        if medicinas[j] < medicinas[pequeño]:
            pequeño = j
    medicinas[i], medicinas[pequeño] = medicinas[pequeño], medicinas[i]

#Imprime la lista de medicinas en orden 
print("Estas son las medicinas ordenadas: ",medicinas)

