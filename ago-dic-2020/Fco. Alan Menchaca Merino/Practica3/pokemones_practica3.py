from insertion_sort import InsertionSort

pokemon_cplist = input("Ingresa el poder de cada pokemon (CP): ").split()
pokemon_list = [int(cp) for cp in pokemon_cplist]

InsertionSort().reverse_sort(pokemon_list)

msg = 'Ordenados de mayor a menor: '
for pokemon in pokemon_list:
    msg += f"%d, " % pokemon

print(msg)