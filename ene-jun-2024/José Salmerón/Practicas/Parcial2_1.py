#EJERCICIO 1
def SequentialSearch(arr, var):
    pos = 0
    find = False
    while pos < len(arr) and find != True:
        if arr[pos] == var:
            pos +=1
            return "El libro se encuentra en la posicion:", pos
        else:
            pos +=1
    return -1


if __name__ == "__main__":
    #Libro = "5 CalculoForDummies"
    #Repisa = "Calculo2Deitel CalculoForDummies AlgebraLineal TeoríaDeNúmeros TheMangaGuideToCalculus"
    Libro = str(input("Ingrese la cantidad de libros y el nombre del libro: "))
    Repisa = str(input("Ingrese los libros que se encuentran en la repisa: "))
    Repisa = Repisa.split()
    Libro = Libro.split()
    print(SequentialSearch(Repisa, Libro[1]))