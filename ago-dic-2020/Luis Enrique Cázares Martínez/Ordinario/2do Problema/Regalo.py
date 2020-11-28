from regalo import regalo

def merge(lista):
    mid = len(lista)//2

    if len(lista) > 1:
        L = lista[mid:]
        R = lista[:mid]

        lista.clear()

        merge(L)
        merge(R)

        while len(L) > 0 and len(R) > 0:
            if L[0].getPeso() < R[0].getPeso():
                lista.append(L.pop(0))
            else:
                lista.append(R.pop(0))

        while len(L) > 0:
            lista.append(L.pop(0))

        while len(R) > 0:
            lista.append(R.pop(0))


    return lista


def binarySearch(arr, x):
    l = 0
    r = len(arr)
    while (l <= r):
        m = l + ((r - l) // 2)

        res = (x == arr[m])

        # Check if x is present at mid
        if (res == 0):
            return m - 1

        # If x greater, ignore left half
        if (res > 0):
            l = m + 1

        # If x is smaller, ignore right half
        else:
            r = m - 1

    return -1

n = input("Dime cuantas regalos tienes en la lista y cual quieres encontrar separados por un espacio -> ")
n = n.split(" ")
reg = []
for i in range(int(n[0])):
    regal = input("Dime los nombres y el costo separados por un espacio -> ")
    regal = regal.split(" ")
    reg.append(regalo(str(regal[0]), int(regal[1])))

r = merge(reg)
for i in r:
    print(i)
rorden = []
for i in r:
    rorden.append(i.getNombre())

print("Tu regalo es en la siguiente posicion")
print(binarySearch(rorden, n[1]))