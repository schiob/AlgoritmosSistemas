print("Ingrese el numero de palabras")
n= (input())  
print("Ingrese las palabras separadas por un espacio")
palabra_fav= input().split()

for i in range(len(palabra_fav) - 1):
    for j in range(len(palabra_fav) - 1 - i):
        if len(palabra_fav[j]) > len(palabra_fav[j + 1]):
            p_pequeña = palabra_fav[j + 1]
            p_grande = palabra_fav[j]
            palabra_fav[j] = p_pequeña
            palabra_fav[j + 1] = p_grande

print(palabra_fav)