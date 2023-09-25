import random;

#Entrada
lista=[random.randint(1,100) for i in range(10)]
print("Lista de Original", lista)

for i in range(len(lista)):
    pequeño = i;
    for j in range(i, len(lista)):
        if lista[j] < lista[pequeño]:
            pequeño = j;

    lista[i], lista[pequeño] = lista[pequeño], lista[i]

print("Lista Ordenada",lista)
