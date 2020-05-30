#bynary search
def binarySearch(arreglo1, l, r, x):
    while l <= r:
        mid = l + (r - l) // 2;
        if arreglo1[mid] == x:
            return mid +1
        elif arreglo1[mid] < x:
            l = mid + 1
        else:
            r = mid - 1

    return -1

#ENTRADA
print("1.- número de artículos en la lista, el artículo que busca Panchito.")
print("2.- nombre de los articulos y su precio.\n ")
n,s=input().split()
arreglo1=[] #PRODUCTS
arreglo2=[] #precios
x=0 #LO QUE VOY A BUSCAR

for i in range(int(n)):
  r,q=input().split()
  arreglo1.append(r)
  arreglo2.append(int(q))
  if r==s:
    x=int(q)

#MANDAMOS A BUSCAR
result = binarySearch(arreglo2, 0, len(arreglo2)-1, x)

if result != -1:
  #IMPRIMIMOS
    print("\n Su producto esta en la Posición")
    print (result)
else:
    print ("Element is not present in array")
