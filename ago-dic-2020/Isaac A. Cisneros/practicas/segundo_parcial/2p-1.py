print("ingresa la cantidad de libros, y despues de un espacio, el nombre del libro que deseas buscar")
def linear_search(x,y):
    for i in range(len(x)):
        if x[i]==y:
            return i
    return -1
a = input().split()
x = int(a[0])
print("ingresa los nombres de todos los libros")
c = str(a[1])
x = list(map(str, input("").split()))
result = linear_search(x,c)
print("La ubicación de tu libro es:")
if result==-1:
     print("1")
else:
     print(" %d"  %(result +1))
