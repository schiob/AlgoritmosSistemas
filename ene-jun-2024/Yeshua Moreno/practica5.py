import sys
input = sys.stdin.read

data = input().splitlines()

# Número de concursantes
n = int(data[0])

# Lista concursantes
competitors = []

# Leer datos concursante
for i in range(1, n + 1):
    s, x, y, z = data[i].split()
    x, y, z = int(x), int(y), int(z)
    competitors.append((s, x, y, z))

competitors.sort(key=lambda c: (-c[1], -c[2], -c[3], c[0]))

#Salida
for competitor in competitors:
    print(competitor[0])