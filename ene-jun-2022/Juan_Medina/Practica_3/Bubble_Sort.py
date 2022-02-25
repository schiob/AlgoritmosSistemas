
from operator import truediv
from tokenize import single_quoted
def eliminar_impares(arr):
    nueva_lista = []
    for elemento in arr:
        if elemento % 2 == 0:
            nueva_lista.append(elemento)
    return nueva_lista



arr = [3, 43, 2,5, 4, 6, 5, 4, 334, 45, 23, 123, 323, 45, 34, 23, 43, 5, 46, 78]

sin_impares = eliminar_impares(arr)
print("Lista Original: " + str(arr))
print("Lista sin impares: " + str(sin_impares))


band = False
while band == False:
    band = True
    for i in range(len(sin_impares) - 1):
        if sin_impares[i] > sin_impares[i+1]:
            aux = sin_impares[i]
            sin_impares[i] = sin_impares[i+1]
            sin_impares[i + 1] = aux
            band = False
sin_impares.sort(reverse= True)
print("\nLa lista ordenada de mayor a menor sin impares es: \n")
print(sin_impares)
