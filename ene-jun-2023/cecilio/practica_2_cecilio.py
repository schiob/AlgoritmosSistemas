import random

num = random.sample(range(100), 20)

z = [x for x in num if x % 2 == 0]

for i in range(1, len(z)):
    j = i
    while j > 0 and z[j - 1] < z[j]:
        z[j - 1], z[j] = z[j], z[j - 1]
        j -= 1
        print(z)
