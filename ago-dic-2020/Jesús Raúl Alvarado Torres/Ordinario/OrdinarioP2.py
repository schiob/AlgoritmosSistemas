def binarySearch(arr, izq, der, buscando):
    medio = (izq + der)//2
    if izq > der: 
        return -1

    if arr[medio][0] == buscando :
        return medio
    if buscando < arr[medio][0]: 
        return binarySearch(arr, izq, medio-1, buscando)
    else:
        return binarySearch(arr, medio+1, der, buscando)

n,buscando = input().split() 
arr = []
for i in range(int(n)):
    b = input().split()
    arr.append(b)

print(binarySearch(arr, 0, len(arr), buscando)+1)