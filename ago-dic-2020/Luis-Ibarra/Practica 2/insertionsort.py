line1 = input().split()
line2 = input().split()
n, m = line1
cont = 0
sumtime = 0

# Insertion Short
for i in range(1, len(line2)):
    actual = line2[i]
    indice = i

    while indice > 0 and line2[indice-1] > actual:
        line2[indice] = line2[indice-1]
        indice = indice - 1

    line2[indice] = actual

# for para calcular cuantos problemas se pueden realizar
for i in range(0, len(line2)):
    sumtime += int(line2[i])
    if(sumtime <= int(m)):
        cont += 1
    else:
        print(cont)
        break
