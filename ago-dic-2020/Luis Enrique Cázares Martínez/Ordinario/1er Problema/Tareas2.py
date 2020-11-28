from tareas import tarea

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

n = int(input("Dime cuantas tareas tienes pendientes -> "))
tar = []
for i in range(n):
    tareas = input("Dime la lista de tareas iniciando por el nombre y un espacio su peso entre 1 y 500: ")
    tareas = tareas.split(" ")
    tar.append(tarea(str(tareas[0]), int(tareas[1])))
    if (tar[i].getPeso() > 1 and tar[i].getPeso() < 500):
        pass
    else:
        print("Te dije que del 1 al 500 >:[")
        exit()

t = merge(tar)
print("Debes hacer las tareas en este orden")
for i in t:
    print(i)