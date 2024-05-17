def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    # Dividir la lista en dos mitades
    mid = len(arr) // 2
    left_half = arr[:mid]
    right_half = arr[mid:]
    
    # Llamada recursiva para ordenar cada mitad
    left_half = merge_sort(left_half)
    right_half = merge_sort(right_half)
    
    # Fusionar las mitades ordenadas
    return merge(left_half, right_half)

def merge(left, right):
    result = []
    i = j = 0
    
    # Fusionar las dos listas ordenadas
    while i < len(left) and j < len(right):
        if compare(left[i], right[j]):
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    
    # Agregar los elementos restantes de la lista izquierda, si los hay
    while i < len(left):
        result.append(left[i])
        i += 1
    
    # Agregar los elementos restantes de la lista derecha, si los hay
    while j < len(right):
        result.append(right[j])
        j += 1
    
    return result

def compare(cont1, cont2):
    # Comparar basado en las reglas de desempate
    if cont1[1:] > cont2[1:]:
        return True
    elif cont1[1:] == cont2[1:]:
        return cont1[0] < cont2[0]
    else:
        return False

# Lectura de la entrada
n = int(input("ingrese las cartas"))
participants = []
for _ in range(n):
    name, gold, silver, bronze = input().split()
    participants.append((name, int(gold), int(silver), int(bronze)))

# Ordenar la lista de participantes
sorted_participants = merge_sort(participants)

# Imprimir los nombres de los participantes ordenados
for participant in sorted_participants:
    print(participant[0])