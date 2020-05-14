num = input("").split(" ")
canciones = input("").split(" ")
num = [int(num[0]), int(num[1])]

arr1=[]

for j in range(num[1]):
    arr1.append(input())


def sort(lista):
    izquierda = []
    centro = []
    derecha = []
    if len(lista) > 1:
        pivote = lista[0]
        for i in lista:
            if i < pivote:
                izquierda.append(i)
            elif i == pivote:
                centro.append(i)
            elif i > pivote:
                derecha.append(i)
        return sort(izquierda)+centro+sort(derecha)
    else:
      return lista

def BinarySearch (arr, l, r, x): 
    if r >= l: 
        mid = l + (r - l)//2
        if arr[mid] == x: 
            return mid         
        elif arr[mid] > x: 
            return BinarySearch(arr, l, mid-1, x) 
        else: 
            return BinarySearch(arr, mid+1, r, x) 
    else:
        return -1

print(sort(canciones))
for i in range(len(arr1)):
    print(BinarySearch(canciones, 0, len(canciones)-1, arr1[i])) 