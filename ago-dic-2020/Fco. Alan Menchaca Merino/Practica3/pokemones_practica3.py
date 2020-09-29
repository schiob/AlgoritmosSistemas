from algoritmos.insertion_sort import InsertionSort

pokemon_cplist = input("Ingresa el poder de cada pokemon (CP): ").split()
pokemon_list = [int(cp) for cp in pokemon_cplist]

InsertionSort.reverse_sort(pokemon_list)

print('Ordenados de mayor a menor: ', end="")
asd = [print(pokemon, end=", ") for pokemon in pokemon_list]
