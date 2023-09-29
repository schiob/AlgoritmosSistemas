# Ordenamiento burbuja

n = int(input())
words = input().split()

for i in range(len(words) - 1):
    for j in range(len(words) - 1 - i):
        if words[j] > words[j + 1]:
            pequeño = words[j + 1]
            grande = words[j]
            words[j] = pequeño
            words[j + 1] = grande

print(*words)
