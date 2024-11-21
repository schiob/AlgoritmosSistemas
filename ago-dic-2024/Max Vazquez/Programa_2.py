def ordenar_por_insercion(lista): 
    for i in range(1, len(lista)):       
        valor_actual = lista[i]
        j = i - 1          
        while j >= 0:
            if lista[j] > valor_actual:               
                lista[j + 1] = lista[j]
                j -= 1
            elif lista[j] <= valor_actual:                
                break
            else:   
                pass
        lista[j + 1] = valor_actual
    return lista
numeros = [99, 38, 78, 25, 82, 101]
ordenados = ordenar_por_insercion(numeros)
print("Lista ordenada:", ordenados)
