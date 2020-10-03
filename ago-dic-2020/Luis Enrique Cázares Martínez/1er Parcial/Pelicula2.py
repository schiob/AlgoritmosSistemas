from pelicula import pelicula

def merge_sort(lista):
    if len(lista) > 1:
        mitad = len(lista) // 2
        primera_mitad = lista[:mitad]
        segunda_mitad = lista[mitad:]

        merge_sort(primera_mitad)
        merge_sort(segunda_mitad)
        i = 0
        j = 0
        k = 0

        while i < len(primera_mitad) and j < len(segunda_mitad):
            if primera_mitad[i.getMin()] < segunda_mitad[j.getNum()] and primera_mitad[i.getHrs()] < segunda_mitad[j.getHrs()]:
                lista[k] = primera_mitad[i]
                i += 1
            else:
                lista[k] = segunda_mitad[j]
                j += 1
            k += 1

        while i < len(primera_mitad):
            lista[k] = primera_mitad[i]
            i += 1
            k += 1

        while j < len(segunda_mitad):
            lista[k] = segunda_mitad[j]
            j += 1
            k += 1



nump = int(input("Numero de peliculas -> "))

peliculas = []

for i in range(nump):
    p = input("Ingrese el nombre de la pelicula seguido de un espacio para las horas, un espacio para los minutos ")
    p = p.split(" ")
    peliculas.append(pelicula(str(p[0]), int(p[1]), int(p[2])))

merge_sort(peliculas)