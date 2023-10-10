n = int(input())
libreria =[]
for _ in range (n):
    nom,pag = input().split()
    libreria.append((nom, int(pag)))

def marge_sort(libros):
    if len(libros) <=1:
        return libros

    mitad = len(libros)//2
    part_iz = libros[:mitad]
    part_der = libros[mitad:]

    part_iz = marge_sort(part_iz)
    part_der = marge_sort(part_der)

    return com(part_iz,part_der)


def com(part_iz, part_der):
    combinacion = []
    i=j=0

    while i < len(part_iz) and j < len(part_der):
        if part_iz[i][1] < part_der[j][1]:
            combinacion.append(part_iz[i])
            i += 1
        else:
            combinacion.append(part_der[j])
            j += 1

    combinacion.extend(part_iz[i:])
    combinacion.extend(part_der[j:])
    return combinacion

  
lista_ordenada = marge_sort(libreria)

for libro in lista_ordenada:
    print(libro[0], end='  ')