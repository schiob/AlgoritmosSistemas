npokemon = False
while (npokemon == False):
    # Sacamos el numero de pokemones atrapados
    pokemones = input("Cuantos atrapaste prro, recuerda que no puedes atrapar mas de 50 y lo minimos es 1 o te truena la pokedex ")
    pokemones = int(pokemones)
    if (1 <= pokemones <=50):
        npokemon = True
    else:
        print("Rompiste la Pokedex")
        break
npoder = False
while (npoder == False):
    #Sacamos sus cp para ver que tan rotos estan
    cp = input("Que tan chetados estan separados por un espacio que van desde 1 a 2000 o rompes la pokedex ")
    #lista de comprension
    cp = [int(i) for i in cp.split(" ")]
    for i in cp:
        if (1 <= i <= 2000):
            npoder = True
        else:
            print("Tus pokemos estan super rotos que no los podemos ver")
            break
#lista ordenada usando insertion sort pero de menor a mayor
for i in range(1, len(cp)):
    llave = cp[i]
    j = i-1
    while(j >= 0 and llave > cp[j]):#Cambiamos ">" a ">=" y "<" a ">
        cp[j+1] = cp[j]
        j -= 1
    cp[j+1] = llave
print(cp)
