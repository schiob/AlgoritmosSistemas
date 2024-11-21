#Angel Ricardo Villalpando Ramirez
#Ejercicio 1
def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

n = int(input())
medicinas = input().split()

bubble_sort(medicinas)
print(" ".join(medicinas))

#Ejercicio 2 #########################################################################

n = int(input())  
entrada = input().split()  

medicinas = []
for i in range(0, len(entrada), 2):
    nombre_medicina = entrada[i]
    cantidad_pastillas = int(entrada[i+1])
    medicinas.append((nombre_medicina, cantidad_pastillas))

medicinas.sort(key=lambda x: x[1], reverse=True)

print(" ".join([medicina[0] for medicina in medicinas]))
