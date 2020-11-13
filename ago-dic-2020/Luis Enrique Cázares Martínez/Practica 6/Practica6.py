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
        #print(izquierda+["-"]+centro+["-"]+derecha)
        return sort(izquierda)+centro+sort(derecha)
    else:
      return lista


def binary_search_recursive(array, element, start, end):
    if start > end:
        return -1

    mid = (start + end) // 2
    if element == array[mid]:
        return mid

    if element < array[mid]:
        return binary_search_recursive(array, element, start, mid-1)
    else:
        return binary_search_recursive(array, element, mid+1, end)

n = input("Dime cuantas medicinas tiene y cunatas veces las buscaras separadas por un espacio -> ")
n = n.split(" ")
#print(n[0])
medicinas = input("Dime la lista de medicinas del Chilaquil separadas por un espacio: ")
medicinas = medicinas.split(" ")
#print(len(medicinas))
#print(len(medicinas) != n[0])
if int(len(medicinas)) != int(n[0]):
    print("Estas poniendo mas medicinas de las que tenemos burro")
    exit()
else:
    bus = ""
    for i in range(0, int(n[1])):
        l = input("Dime el nombre de la medicina que buscaras -> ")
        bus+=f" {l}"

    bus = bus.split(" ")
    buso = sort(bus)
    buso.pop(0)
    ord = sort(medicinas)
    #print(len(bus))
    print(buso)
    for i in buso:
        print(i)

    for i in range(0, len(bus)-1):
        # Function call
        result = binary_search_recursive(medicinas, buso[i], 0, len(medicinas)-1)
        print(result)