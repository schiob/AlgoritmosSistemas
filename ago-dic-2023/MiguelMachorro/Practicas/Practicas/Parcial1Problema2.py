#Problema2
# Función para realizar la ordenación Marge Sort
def marge_sort(arr):
    if len(arr) <= 1:
        return arr

    #Divider el probelma en sub problemas
    middle = len(arr) // 2
    arrIzq = arr[:middle]
    arrDer = arr[middle:]

      #Resolver de forma recursiva 
    arrIzq = marge_sort(arrIzq)
    arrDer = marge_sort(arrDer)

    #Junta ambas partes 
    FinalOrdenado = Union(arrIzq, arrDer)

    return FinalOrdenado


def Union(izq, der):
    res = []
    i = j = 0

    while i < len(izq) and j < len(der):
        if izq[i][1] < der[j][1]:
            res.append(izq[i])
            i += 1
        else:
            res.append(der[j])
            j += 1

    res.extend(izq[i:])
    res.extend(der[j:])
    return res


# Entrada 
#Lee la cantidad de libros para juan junto con los libros y la cantidad de paginas
n = int(input("Ingrese la cantidad de libros que tiene Juan: "))
libros = []

for _ in range(n):
    name, pages = input().split()
    libros.append((name, int(pages)))

#Llamar a la función de ordenación Marge Sort
libros = marge_sort(libros)

print(" ")
# Imprimir la lista ordenada de libros
print("La lista ordenada de libros es la siguiente")
for libro in libros:
    print(libro)

