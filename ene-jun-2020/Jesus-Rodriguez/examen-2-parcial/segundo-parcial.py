# Entrada de datos.
datos = input('').split(' ')
# Destructuración.
total_canciones = int(datos[0])
total_peticiones = int(datos[1])
# Lista de canciones.
lista_canciones = input('').split(' ')

# Función de partición para quick sort.
def particion(lista,menor,mas_alto): 
    # Indice menor del elemento.
    i = ( menor-1 )   
    # Pivote basado en valor ASCII.
    pivot = ord(lista[mas_alto][0])
    for j in range(menor , mas_alto): 
        # Si el elemento es menor o igual al pivote entonces incrementará el índice.
        if  ord(lista[j][0]) <= pivot: 
            i = i+1 
            # Sustituyen valores.
            lista[i],lista[j] = lista[j],lista[i] 
    lista[i+1],lista[mas_alto] = lista[mas_alto],lista[i+1] 
    return ( i+1 ) 
# Función para hacer quick sort.
def quickSort(lista,menor,mas_alto): 
    if menor < mas_alto: 
        pi = particion(lista,menor,mas_alto) 
        quickSort(lista, menor, pi-1) 
        quickSort(lista, pi+1, mas_alto) 

def busquedaBinaria (lista_canciones, l, r, x): 
    # Caso base.
    if r >= l: 
        mid = l + (r - l) // 2
        # Si el elemento se encuentra justo a la mitad.
        if lista_canciones[mid] == x: 
            return mid
        # Si el elemento es menor que el medio.
        elif lista_canciones[mid] > x: 
            return busquedaBinaria(lista_canciones, l, mid-1, x) 
        else: 
            return busquedaBinaria(lista_canciones, mid + 1, r, x) 
    else: 
        # El elemento no se encuentra en la lista.
        return -1
  
# Ordeno la lista de canciones por orden alfabetico.
quickSort(lista_canciones,0,total_canciones-1) 
# Imprimo la lista de canciones ordenada.
print(lista_canciones)
# Imprimo el índice de donde se encuentra la canción que se pide.
for i in range(0,total_peticiones):
    cancion_requerida = input('')
    indice = busquedaBinaria(lista_canciones, 0, len(lista_canciones)-1, cancion_requerida) 
    print(indice)
# Aquí pude guardarlo en un array y luego imprimirlos para que en la consola no se manche con la entrada que van poniendo pero no supe si así ya estaba bien en general.