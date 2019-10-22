def Mergesort(peliculas):
    if len(peliculas) > 1:
        # divido
        middle = len(peliculas) // 2
        left = peliculas[:middle]
        right = peliculas[middle:]
 # resuelvo
        new_left = Mergesort(left)
        new_right = Mergesort(right)

        # junto la solucion
        new_arr = Merge(new_left, new_right)
        return new_arr

    return peliculas

def Merge(left, right):

    arrp = []
    lp = 0
    rp = 0

    while lp < len(left) and rp < len(right):
        if left[lp][1] < right[rp][1]:
            arrp.append(left[lp])
            lp += 1

        else:
            arrp.append(right[rp])
            rp+=1

    while lp < len(left):
        arrp.append(left[lp])
        lp += 1

    while rp < len(right):
        arrp.append(right[rp])
        rp += 1

    return arrp

n=int(input("NÚMERO DE LIBROS"))
libros=[]
for i in range (n):
    line= input().split()
    name=line[0]
    pag= int(line[1])
    book=[name,pag]

    libros.append(book)

orden=Mergesort(libros)
nombres=[]

for book in orden:
    nombres.append(book[0])
print(" ".join(nombres))
