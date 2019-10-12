def MergeSort(ar):
    if len(ar) > 1:
        mid = len(ar)//2
        L = ar[:mid]
        R = ar[mid:]
        
        MergeSort(L)
        MergeSort(R)

        i = j = k = 0
        #Pasando elementos a los arrays temporales
        while i < len(L) and j < len(R):
            if int(L[i][1]) <= int(R[j][1]) and int(L[i][2]) <= int(R[j][2]):
                ar[k] = L[i]
                i+=1
            else: 
                ar[k] = R[j]
                j+=1
            k+=1
        #Comprobando si quedo algun elemento
        while i < len(L):
            ar[k] = L[i]
            i+=1
            k+=1
        while j < len(R):
            ar[k] = R[j]
            j+=1
            k+=1

ar = []
n = int(input("Range: "))
for i in range(n):
    mkv= input("Name Movie: ").split()
    ar.append(mkv)
MergeSort(ar)
for i in ar:
    print(''.join(i[0]), end=" ") 


#ENTRADA
#5
#StarWars 2 1
#Alien 1 57
#ASpaceOdyssey 2 41
#Matrix 2 30
#BladeRunner 1 57

#SALIDA
#Alien BladeRunner StarWars Matrix ASpaceOdyssey

