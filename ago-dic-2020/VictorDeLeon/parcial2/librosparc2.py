def algor(palab,libros):
    i=0
    F=False
    while i < len(libros) and not F:
        if libros[i]  == palab:
            F = True
            i = i +1
    return i


ent = input().split()
num = ent[0]
palab = ent[1]
#libros = input().split
libros = ["Calculo2Deitel", "CalculoForDummies", "AlgebraLineal" ,"TeoríaDeNúmeros", "TheMangaGuideToCalculus"]
print(libros)
algor(palab, libros)
print(algor(palab,libros))
