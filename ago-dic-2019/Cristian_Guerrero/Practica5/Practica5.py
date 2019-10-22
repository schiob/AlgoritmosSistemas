def MergeSort(ar):
    if len(ar) > 1:
        mid = len(ar)//2
        L = ar[:mid]
        R = ar[mid:]

        MergeSort(L)
        MergeSort(R)

        i = j = k = 0
        #GUARDAMOS ELEMENTOS EN TEMPORALES
        while i < len(L) and j < len(R):
            if int(L[i][1]) <= int(R[j][1]):
                ar[k] = L[i]
                i+=1
            else: 
                ar[k] = R[j]
                j+=1
            k+=1
        #VERIFICAMOS QUE NO QUEDE NADA DE ELEMENTOS
        while i < len(L):
            ar[k] = L[i]
            i+=1
            k+=1
        while j < len(R):
            ar[k] = R[j]
            j+=1
            k+=1

ar = []
n = int(input("¿CUANTOS LIBROS QUIERES LEER JUAN? "))
for i in range(n):
    mkv= input("INGRESE NOMBRE DEL LIBRO Y NUMERO DE PAGINAS: ").split()
    ar.append(mkv)
MergeSort(ar)
for i in ar:
    print(''.join(i[0]), end=" ") 
