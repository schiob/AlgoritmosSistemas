def quicksort(lista):
    if len(lista) <= 1:
        return lista
    else:
        pivot = lista[0]
        iguales = [x for x in lista if x == pivot]
        menores = [x for x in lista if x < pivot]
        mayores = [x for x in lista if x > pivot]
        return quicksort(menores) + iguales + quicksort(mayores)
    
def binary_search(lista, medicina):
    inicio = 0
    fin = len(lista) - 1
    while inicio <= fin:
        medio = (inicio + fin) // 2
        if lista[medio] == medicina:
            return medio
        elif lista[medio] < medicina:
            inicio = medio + 1
        else:
            fin = medio - 1
    return -1

n, q = map(int, input().split())
medicinas = input().split()


medicinas_buscadas = []
for i in range(q):
    medicina_buscada = input().strip()
    medicinas_buscadas.append(medicina_buscada)


medicinas_ordenadas = quicksort(medicinas)

indices = []
for medicina_buscada in medicinas_buscadas:
    indice = binary_search(medicinas_ordenadas, medicina_buscada)
    indices.append(indice)


for indice in indices:
    print(indice)
