n, libroBuscado = input().split()
n = int(n)

librosRepisa = input().split()

encontrado = False
for i in range(n):
    if librosRepisa[i] == libroBuscado:
        print(i+1)
        encontrado = True
        break

if not encontrado:
    print(-1)
    