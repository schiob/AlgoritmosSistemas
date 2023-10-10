# Leer la cantidad de palabras y la lista de palabras
n = int(input())
lista = input().split()

# Ordena  alfabéticamente
medicinas = sorted(lista)

# Imprimir la lista ordenada
print(" ".join(medicinas))