a = []
n = int(input("Cuantos numeritos quieres primo Tom?!?\n"))
print("Dime los numeritos Tom")
for i in range(n):
    k = int(input())
    if k%2 == 0:
        a.append(str(k))
print(' '.join(a[::-1])) 