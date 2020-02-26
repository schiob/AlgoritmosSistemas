# Valor de la carta excluyendo el palo.
valor = ['A',2,3,4,5,6,7,8,9,'T','J','Q','K']
# Valor del palo cuando no se toma en cuenta el valor de la carta al tener esta el mismo valor que otra.
palo = ['E','C','T','D']

# Lista donde se almacenarán las diferentes manos de cartas.
lista_principal = []
# Cantidad de manos.
manos = int(input(''))
# Ciclo que guardará en diferentes listas las diferentes cartas de las manos para después guardar dichas listas en la lista principal.
for i in range(0,manos):
    diferentes_listas = input('').split(' ')
    lista_principal.append(diferentes_listas)
    # Remuevo la primera posición la cual es el número que indica la cantidad de cartas de la mano, debido al tipo de entrada de datos es innecesario.
    lista_principal[i].pop(0)

# Función que convierte el valor de un caracter en un valor númerico, mismo que me facilitará hacer comparaciones.
def valor_a_numero(n):
    if n == 'A':
        n = 1
    elif n == 'T':
        n = 10
    elif n == 'J':
        n = 11
    elif n == 'Q':
        n = 12
    elif n == 'K':
        n = 13
    else:
        n = int(n)
    return n

# Función que convierte el valor de un caracter en un valor númerico, mismo que me facilitará hacer comparaciones.
def palo_a_numero(n):
    if n == 'E':
        n = 1
    elif n == 'C':
        n = 2
    elif n == 'T':
        n = 3
    elif n == 'D':
        n = 4
    else:
        n = int(n)
    return n

# Función merge sort que recibe como argumento una lista con valores.
def merge_sort(lista_principal):
    # Condicional que valida que el tamaño de la lista sea mayor a 1.
    if len(lista_principal) > 1:
        # Se parte en dos la lista.
        mid = len(lista_principal) // 2
        # Se asigna en dos listas diferentes ambos costados de la lista original partida por la mitad.
        izquierda = lista_principal[:mid]
        derecha = lista_principal[mid:]

        # Llamadas recursivas.
        merge_sort(izquierda)
        merge_sort(derecha)

        # Iteradores.
        i = 0
        j = 0
        k = 0

        # Aquí comienza la magia del ciclo que ordenará los valores.
        while i < len(izquierda) and j < len(derecha):
            # Guardo los valores que contienen dos posiciones en una variable.
            # Ejemplo: AT
            valor_izquierdo = izquierda[i]
            valor_derecho = derecha[j]
            # Comparo si la posición cero de las variables anteriores son iguales, en caso de ser así, se comparará utilizando el palo.
            if valor_izquierdo[0] == valor_derecho[0]:
                if palo_a_numero(valor_izquierdo[1]) < palo_a_numero(valor_derecho[1]):
                    lista_principal[k] = izquierda[i]
                    i += 1
                else:
                    lista_principal[j] = derecha[j]
                    j += 1
            # Comparo si la posición cero de las variables anteriores son iguales, en caso de no ser así, se comparará utilizando el valor de la carta principal.
            elif valor_a_numero(valor_izquierdo[0]) < valor_a_numero(valor_derecho[0]):
                lista_principal[k] = izquierda[i]
                i += 1
            else:
                lista_principal[k] = derecha[j]
                j += 1
            k += 1

        # Estos ciclos se utilizarán sólo con los valores restantes.
        while i < len(izquierda):
            lista_principal[k] = izquierda[i]
            i += 1
            k += 1
        while j < len(derecha):
            lista_principal[k]=derecha[j]
            j += 1
            k += 1

# Respuesta del examen.
respuesta = ''
for i in range(0,manos):
    merge_sort(lista_principal[i])
    respuesta += ' '.join(lista_principal[i])
    respuesta += '\n'
print(respuesta)
