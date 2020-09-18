line = input().split()
for i in range(1, len(line)):
    actual = line[i]
    indice = i

    while indice > 0 and int(line[indice-1]) > int(actual):
        line[indice] = line[indice-1]
        indice = indice - 1

    line[indice] = actual
print(line)
