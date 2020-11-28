def binarySearch(arr, inicio, fin, x):
    middle = (inicio + fin)//2
    if inicio > fin:
        return -1
    if arr[middle][0] == x:
        return middle
    if x < arr[middle][0]:
        return binarySearch(arr, inicio, middle-1, x)
    else:
        return binarySearch(arr, middle+1, fin, x)


x, s = input().split()
lista = []


for i in range(int(x)):
    art = input().split()
    lista.append(art)

print(binarySearch(lista, 0, len(lista), s)+1)

