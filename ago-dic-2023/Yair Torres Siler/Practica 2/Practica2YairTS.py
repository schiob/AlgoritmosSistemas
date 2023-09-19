
ent1 = input().split()

n = int(ent1[0]) #Numero de problemas
m = int(ent1[1]) #Numerode horas disponibles


ent2 = input().split()

listaEnteros = [int(elemento) for elemento in ent2]

if len(listaEnteros) != n:
    print("Huh?")
else:
    for i in range(1, len(listaEnteros)):
        valActual = listaEnteros[i]

        j = i - 1
        while j >= 0 and listaEnteros[j] > valActual:
            listaEnteros[j + 1] = listaEnteros[j]
            j -= 1
        listaEnteros[j + 1] = valActual

    t = 0 #total de horas
    c = 0 #contador de tareas

    for i in listaEnteros:
        if t + i <= m:
            t += i
            c += 1
        else:
            break

    print(c)






