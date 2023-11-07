def quicksort(numeros):
    if len(numeros) <= 1:
        return numeros

    numeros_copy = numeros.copy()
    pivot = numeros_copy.pop()

    menor = []
    mayor = []

    for numero in numeros_copy:
        if numero < pivot:
            mayor.append(numero)
        else:
            menor.append(numero)

    return quicksort(menor) + [pivot] + quicksort(mayor)


numero_de_carros = int(input("Numero de autos: "))
carro = []
kilometraje = []

for i in range(numero_de_carros):
    n = input("Ingrese el nombre y el kilometraje: ")
    n = n.split()
    carro.append(n[0])
    kilometraje.append(int(n[1]))

kilometraje_ordenado = quicksort(kilometraje)

carros_ordenados = []
for i in range(len(kilometraje_ordenado)):
    for j in range(len(kilometraje)):
        if kilometraje_ordenado[i] == kilometraje[j]:
            carros_ordenados.append(carro[j])
            carro.pop(j)
            kilometraje.pop(j)
            break

print(*carros_ordenados)
