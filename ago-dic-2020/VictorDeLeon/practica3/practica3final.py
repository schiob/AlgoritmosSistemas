entrada = input()
pokemon = entrada.split(" ")
pokemons = int(pokemon[0])

arreglo = input()
separararreglo = arreglo.split(" ")
#cambiar a enteros
b = [int(x) for x in separararreglo]

for i in range(1, len(b)):

    actual = b[i]
    indice = i
    
    while indice > 0 and b[indice -1] < actual:
       b[indice] = b[indice - 1]
       indice = indice -1


    b[indice] = actual
    
print(b)
