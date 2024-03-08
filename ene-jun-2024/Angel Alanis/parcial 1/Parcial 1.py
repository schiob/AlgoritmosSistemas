def mergesort(arr):
    if len(arr) == 1:
        return
    middle = len(arr) // 2
    arr_izq = arr[:middle]
    arr_Der = arr[middle:]

    mergesort(arr_izq)
    mergesort(arr_Der)

    arr_Ordenado = juntarArreglos (arr_izq,arr_Der)
    return arr_Ordenado

def juntarArreglos(arr1,arr2):
    juntar = []
    i = 0
    x = 0

    while len(juntar) < len(arr1) + len(arr2):
        if i < len(arr1) and (x >= len(arr2) or arr1[i] < arr2[x]):
            juntar.append(arr1[i])
            i += 1
        else:
            juntar.append(arr2[x])
            x += 1
    print(juntar)

n = int(input("Ingrese el número de Relojes: "))

Relojes = []
print("ingrese Las horas de los relojes y si es PM o AM: ")
for i in range(n):
    Hora,Minutos = map(str,input("HH:MM ").split(":"))
    Formato = input(("AM/PM "))
    tiempo = Hora+":"+Minutos+" "+Formato

    Relojes.append(tiempo)

print(Relojes)
mergesort(Relojes)
print(Relojes)
