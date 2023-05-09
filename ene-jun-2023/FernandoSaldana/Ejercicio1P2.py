n, libro_buscado = input().split()
libros = input().split()

posicion = -1
for i in range(len(libros)):
    if libros[i] == libro_buscado:
        posicion = i + 1 
        break

print(posicion)

#El algoritmo esta hecho con el algoritmo de busqueda lineal

#5 AlgebraLineal
#Calculo2Deitel CalculoForDummies AlgebraLineal TeoríaDeNúmeros TheMangaGuideToCalculus