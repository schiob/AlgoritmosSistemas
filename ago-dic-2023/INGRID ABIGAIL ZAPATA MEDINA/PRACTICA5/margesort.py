def merge_sort(dinosaurios):
    if len(dinosaurios) <= 1:
        return dinosaurios

    # Dividir la lista en dos mitades
    mitad = len(dinosaurios) // 2
    izquierda = dinosaurios[:mitad]
    derecha = dinosaurios[mitad:]

    # Aplicar merge_sort recursivamente a ambas mitades
    izquierda = merge_sort(izquierda)
    derecha = merge_sort(derecha)

    # Combinar las dos mitades ordenadas
    resultado = []
    i = j = 0

    while i < len(izquierda) and j < len(derecha):
        if len(izquierda[i]) < len(derecha[j]):
            resultado.append(izquierda[i])
            i += 1
        else:
            resultado.append(derecha[j])
            j += 1

    resultado.extend(izquierda[i:])
    resultado.extend(derecha[j:])
    return resultado

# Entrada de nombres de dinosaurios
entrada = input().split()

# Ordenar la lista usando merge_sort
lista_ordenada = merge_sort(entrada)

# Imprimir la lista ordenada
for dinosaurio in lista_ordenada:
    print(dinosaurio, end=' ')