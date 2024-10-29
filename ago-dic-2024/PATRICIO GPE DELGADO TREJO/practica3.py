n = int(input("Ingresa el numero de pokemons capturados: "))

cp_list = list(map(int, input(f"Ingresa los {n} CPs de los pokemons separados por un espacio: ").split()))

# bubble sort
for i in range(n):
    for j in range(0, n-i-1):
        if cp_list[j] < cp_list[j+1]: 
            cp_list[j], cp_list[j+1] = cp_list[j+1], cp_list[j]

print("Los cps de los pokemons ordenados de mayor a menor son:")
print(" ".join(map(str, cp_list)))
