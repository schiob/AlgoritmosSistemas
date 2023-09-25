n = int(input()) #

pokemons = list(map(int, input().split()))

for ni in pokemons:
    if not (1 <= ni <= 2000):
        print("Fuera de rango")
        exit()

for i in range(0, len(pokemons)):
    minimo = i
    for j in range(i+1, len(pokemons)):
        if pokemons[minimo] > pokemons[j]:
            minimo = j

    temp = pokemons[i]
    pokemons[i] = pokemons[minimo]
    pokemons[minimo] = temp

print(pokemons)



#pokemons = [int(elemento) for elemento in m]

