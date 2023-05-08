def entrada():
    n = int(input('Ingresa el numero de concursantes: ')) 
    arr = [] 
    for i in range(n):
        print(f'Ingrese los datos del participante num {i+1}')
        s, x, y, z = input('(Nombre, Num Medallas Oro, Num Medallas Plata, Num Medallas Bronce)\n').split()
        x, y, z = int(x), int(y), int(z)
        arr.append((s, x, y, z))
    Res=quicksort(arr)
    
    print ('\n\nLa lista ordenada de participantes es:\n')
    for i in range(n):
        print(Res[i][0])

def quicksort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivote = arr[0]
        izq = []
        der = []
        for i in range(1, len(arr)):
            if arr[i][1] > pivote[1]:
                izq.append(arr[i])
            else:
                der.append(arr[i])
        return quicksort(izq) + [pivote] + quicksort(der)

entrada()