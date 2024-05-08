def Busquedasimple(arr,search):
    i=0

    while i<= len(arr):
        if arr[i]!= search:
            i+=1
        else:
            return i+1



if __name__ == "__main__":
    n=int(input("Ingrese la cantidad de libros en la repisa de mate:"))
    x=str(input("Ingrese la el libro que está buscando"))


    y=str(input("Ingrese los libros de la repisa:"))
    
    arreglo=list(map(str,y.split()[:n]))

    
    print(arreglo)
    print(Busquedasimple(arreglo,x))
