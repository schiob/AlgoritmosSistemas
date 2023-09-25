# Leer la cantidad de Pokémon
n = int(input("Ingrese la cantidad de Pokemones.\n"))

# Leer los CP de los Pokémon
cp = list(map(int, input("Ingrese los Puntos de Combate de tus Pokemones.\n").split()))
print ("Lista de CP desordenada",cp)

# Implementar selection sort
for i in range(len(cp)):
    pequeño = i
    for j in range(i + 1, len(cp)):
        if cp[j] > cp[pequeño]:
            pequeño = j
    cp[i], cp[pequeño] = cp[pequeño], cp[i]

# Imprimir la lista ordenada
print("Lista de CP ordenada", cp)
