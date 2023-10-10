#Ejercicio 1 Abigail Silva Diaz
#El profe Chio se enfermó de la garganta y le recetaron un montón de drogas para que se cure.
#Por la fiebre no quiere andar batallando para encontrar la medicina que ocupa así que ayúdalo 
#haciendo un programa que le ayude a ordenar los medicamentos en orden alfabético.
#La entrada consiste en dos lineas, la primera tiene 1 entero, n representado el número de medicinas.
#Después hay 1 línea con n palabras separadas por espacios, cada palabra es el nombre de una medicina.
#Imprime una linea con las medicinas ordenas en orden alfabético.
def seleccion_sort(lista):
    n = len(lista)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if lista[j] < lista[min_idx]:
                min_idx = j
        lista[i], lista[min_idx] = lista[min_idx], lista[i]


n = int(input())
medicinas = input().split()
seleccion_sort(medicinas)
print(' '.join(medicinas))

#medicamentos a prueba de orden
#naproxeno paracetamol rimantadina azitromicina ibuprofeno