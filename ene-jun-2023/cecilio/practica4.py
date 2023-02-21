n = int(input("Ingresa el número de pokemons: "))
cp = []

for i in range(n):
    num = int(input("Ingresa su cp: "))
    cp.append(num)

print(n)
for num in cp:
    print(num, end=' ')

# Bubble Sort
for i in range(n):
    for j in range(0, n-i-1):
        if cp[j] > cp[j+1]:
            cp[j], cp[j+1] = cp[j+1], cp[j]

print("\npokemon mas fuerte segun su CP:")
for num in cp:
    print(num, end=' ')