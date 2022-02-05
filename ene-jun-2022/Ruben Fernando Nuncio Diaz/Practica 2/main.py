# insertion Sort
# primero ver cuantos elementos tenemos
# ver cual es el inicio y el final
#   si tenemos  0 o 1 entonces por default va a estar ordenado imprimir 'la lista está ordenada'
#    si no entonces vamos a tener que ordenarlo
#     Si es el primero por default va a estar odenado
# crear constante TOTAL INICIO FINAL
# crear variables si está ordenado o no la lista
# hacer recorrido para ver el total
# sorting
#   identificar el primero
#       El primero va está ordenado por default y no se va a comparar
#    recorremos hasta llegar el segundo
#    Vamos a compararlo con el segundo
#       Si es mayor ahí lo dejamos
#       si es menor lo movemos hasta que sea mayor que el que está en frente
#           si es mayor que el que está atras pero del que está menor estonces ahí debe de estar
#               Si no entonces se ingresó algo mal


## se van a tener que hacer operaciones en especifico en los caso en el index en el que nos encontremos

# nada
#   Rregresamos toda la lista
# 1 solo valor
#   imprimir absolutamtne_todo
# 2 o mas
#   lo que se menciona arriba
# repetido
#

lista = [
    [7777]
]
estatus_lista_ordenada = False
inicio = 0
final = 0
valor_temp = 0

total_numeros_en_la_lista = len(lista)
x = int(total_numeros_en_la_lista)
print(type(x))

if lista == [[]]:
    print('ho hay nada para ordenar en la lista')
    print(lista[::1])
    estatus_lista_ordenada = True
elif lista != [[]]:
    # si solo hay un elemento en la lista
    print(lista[::1])
    print('No hay nada mas que ordenar')
    estatus_lista_ordenada = True
else:
    print('error')



def insertionSort():
    if lista[1] > lista[2]:
        lista[1++]

    return lista



