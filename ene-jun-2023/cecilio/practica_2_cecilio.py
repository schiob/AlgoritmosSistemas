num = (3 ,43 ,2 ,5 ,4 ,6 ,5 ,4 ,334 ,45 ,23 ,123 ,323 ,45 ,34 ,23 ,43, 5, 46 ,78)

z = [x for x in num if x % 2 == 0]

for i in range(1, len(z)):
    j = i
    while j > 0 and z[j - 1] < z[j]:
        z[j - 1], z[j] = z[j], z[j - 1]
        j -= 1
        print(z)
