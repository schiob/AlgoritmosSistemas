#Abigail Silva Diaz
#Juan tiene una lista de autos usados ​​y desea venderlos, 
#pero quiere mostrar primero los autos con el kilometraje más alto a los posibles compradores.
#Ayuda a Juan a ordenar su lista de autos según el kilometraje de mayor a menor
#utilizando el algoritmo de Quick Sort.
#Aporte
#La entrada será recibida por STDIN.
#Consiste en varias líneas. La primera línea contiene un entero n, que representa el número de autos en la lista de Juan. Luego, siguen n líneas, cada una con el nombre del auto y su kilometraje separado por espacio.
#Producción
#Imprime a la salida estándar STDOUT la lista con los nombres de los autos ordenados de acuerdo a su kilometraje, de mayor a menor.

def quick_sort_autos(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        autos_menores = [auto for auto in arr[1:] if auto[1] < pivot[1]]
        autos_mayores = [auto for auto in arr[1:] if auto[1] >= pivot[1]]
        return quick_sort_autos(autos_mayores) + [pivot] + quick_sort_autos(autos_menores)

n = int(input())
autos = []

for _ in range(n):
    nombre, kilometraje = input().split()
    autos.append((nombre, int(kilometraje)))

# Ordenar la lista usando Quick Sort
autos_ordenados = quick_sort_autos(autos)

print("-------------------")
print("Autos ordenados de mayor a menor kilometraje")
print("-------------------")
# Imprimir los nombres de los autos ordenados de mayor a menor kilometraje
for auto in autos_ordenados:
    print(auto[0])

#Ingresar la entrada de esta manera 
#4
#ToyotaCamry 120000
#FordMustang 65000
#HondaCivic 80000
#ChevroletMalibu 110000

#Salida esperada
#ToyotaCamry ChevroletMalibu HondaCivic FordMustang 



