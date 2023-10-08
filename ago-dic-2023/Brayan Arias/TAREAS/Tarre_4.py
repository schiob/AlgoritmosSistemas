
n = int(input("Numero de palabras en la lista de Ricardo: "))
words =input("Ingrese los datos: ").split()

for i in range(len(words) - 1):
    for j in range(len(words) - 1 - i):
        if len(words[j]) > len(words[j + 1]):
            pequeño = words[j + 1]
            grande = words[j]
            words[j] = pequeño
            words[j + 1] = grande

print(*words)
