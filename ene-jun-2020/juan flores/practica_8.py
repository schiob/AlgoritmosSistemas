arr = []

repisas = input().split("\n\n")
for i in range(len(repisas)):
    arr.append([])
    libros = repisas[i].split("\n")
    for j in range(5):
        arr[i].append([])
        paginas = libros[j].split()
        for k in paginas:
            arr[i][j].append(k.split(','))

x = '566'

for i in range(3):
    for j in range(5):
        for k in range(10):
            if x in arr[i][j][k]:
                print(i+1,j+1,k+1,arr[i][j][k].index(x)+1)