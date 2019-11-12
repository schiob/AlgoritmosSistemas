def binarySearch(arr, inicio, fin, x):
    middle = (inicio + fin)//2
    
    if inicio > fin:
        return -1

    if arr[middle] == x:
        return middle

    if x == arr[middle]:
        return binarySearch(arr, inicio, middle-1, x)
    else:
        return binarySearch(arr, middle+1, fin, x)


n = input().split()
arr = input().split()
arr.sort()
print(binarySearch(arr, 0, len(arr)-1, n[1]) + 1)

 
#5 CalculoForDummies
#Calculo2Deitel CalculoForDummies AlgebraLineal TeoríaDeNúmeros TheMangaGuideToCalculus