##El profe esta enfermo problema 1/pacial1

print("Ingrese el número de medicamentos:")
n = (input())
print("Ingrese los medicamentos separados por un espacio:")
medicamentos = input().split()

for i in range(0,len(medicamentos)):
    minimo = i
    for j in range(i+1, len(medicamentos)):
        if medicamentos[minimo] > medicamentos[j]:
            minimo = j
    temporal = medicamentos[i]
    medicamentos[i] = medicamentos[minimo]
    medicamentos[minimo] = temporal
print(medicamentos)