def mergeSort(cadena):
    print("Splitting ",cadena)
    if len(cadena)>1:
        mid = len(cadena)//2
        lefthalf = cadena[:mid]
        righthalf = cadena[mid:]

        mergeSort(lefthalf)
        mergeSort(righthalf)

        i=0
        j=0
        k=0
        while i < len(lefthalf) and j < len(righthalf):
            if lefthalf[i] <= righthalf[j]:
                cadena[k]=lefthalf[i]
                i=i+1
            else:
                cadena[k]=righthalf[j]
                j=j+1
            k=k+1

        while i < len(lefthalf):
            cadena[k]=lefthalf[i]
            i=i+1
            k=k+1

        while j < len(righthalf):
            cadena[k]=righthalf[j]
            j=j+1
            k=k+1
    print("Merging ",cadena)


#numero = int(input("Introduce un numero de libros:"))
cadena = input("Introduce una cadena de texto: ")
#alist = ["HarryPotter 245", "GodelEscherBach 777", "Flatland 96", "Mistborn 541", "CleanCode 469"]
mergeSort(cadena)
print(cadena)
