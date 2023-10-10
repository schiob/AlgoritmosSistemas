##Mas ordenamiento
def mergeSort(n):
    if len(n) == 1:
        return n

    middle = len(n) // 2
    left_arreglo = n[:middle]
    right_arreglo = n[middle:]

    sorted_left_arreglo = mergeSort(left_arreglo)
    sorted_rigth_arreglo = mergeSort(right_arreglo)

    a,b,c = 0,0,0
    
    while a < len(left_arreglo) and b <len(right_arreglo):
        if left_arreglo[a][1] <  right_arreglo[a][1]:
            n[c] = left_arreglo[i]
            a += 1
        else:
            n[c] = right_arreglo[b]
            b += 1
        c += 1
    while i< len(left_arreglo):
        n[c] = left_arreglo[a]
        a +=1
        c +=1
    while i < len(right_arreglo):
        n[c] = right_arreglo[a]
        b+=1
        c+=1
        

print("Ingrese el número de libros:")
n= int(input())
libro=[]
print("Ingrese el nombre del libro y el número de paginas que tiene:")
for i in range(n):
    pagina = input().split()
    nombre = pagina[0]
    pagina = int(pagina[1])
    libro.append((nombre, pagina))

sorted_arr = mergeSort(n)
print("El mejor orden para ver las peliculas es:")
for pelicula in sorted_arr:
    print(pelicula[0], end=" ")


    
