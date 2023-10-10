n = int(input("Numero de medicinas:  "))
medicinas = input("ingrese las meidicinas por un espacio: ").split()

for i in range(len(medicinas)):
    meno = i
    for j in range(i, len(medicinas)):
        if medicinas[meno].lower() > medicinas[j].lower():
            meno = j

    temp = medicinas[i]
    medicinas[i] = medicinas[meno]
    medicinas[meno] = temp

print(*medicinas)
