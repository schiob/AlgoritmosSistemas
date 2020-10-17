from libro import libro
from MergeLibro import merge

nump = int(input("Numero de libros -> "))

libros = []

for i in range(nump):
    p = input("Ingrese el nombre del libro seguido de un espacio para las paginas que tiene ")
    p = p.split(" ")
    libros.append(libro(str(p[0]), int(p[1])))

x = merge(libros)
print(f"Deberas leer los libros de esta forma")
for i in x:
    print(i)