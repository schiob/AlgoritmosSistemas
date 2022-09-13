arr=[4,2,3,7,5,1,2,1,3,2]
print(arr)

for i in range(1, len(arr)):
    actual = arr[i]
    j = i-1
    while j >= 0:
        comparar=arr[j]
        if actual < comparar:
            arr[j+1] = comparar
        else:
            break

        j-=1

    arr[j+1]=actual
print(arr)

def contador(n,m):
    cont=0
    suma=0
    while cont<n and suma<m:
        suma=suma+arr[cont]
        cont+=1

    print(suma)

contador(10,6)