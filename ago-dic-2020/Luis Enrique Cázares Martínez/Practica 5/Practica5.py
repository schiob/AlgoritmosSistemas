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

n = int(input("Dime cuantas palabras son -> "))
palabras = input("Dime la lista de pakabras de Ricardo separadas por un espacio: ")
palabras = palabras.split(" ")
print(sort(palabras))
