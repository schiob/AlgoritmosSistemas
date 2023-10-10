# Leer la cantidad de palabras y la lista de palabras
n = int(input())
word_list = input().split()

# Ordenar la lista de palabras alfabéticamente
sorted_words = sorted(word_list)

# Imprimir la lista ordenada
print(" ".join(sorted_words))