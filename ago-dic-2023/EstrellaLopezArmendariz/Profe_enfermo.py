n=int(input("Introduce el número de medicamentos: "))
medicamentos=input("Introduce tus palabras: ").split()

#utilizaremos insertion sort
for i in range(len(medicamentos)):
    alfabeticamente_menor=i
    for j in range(i,len(medicamentos)):
        if medicamentos[j]<medicamentos[alfabeticamente_menor]:
            alfabeticamente_menor=j
    medicamentos[i],
    medicamentos[alfabeticamente_menor]=medicamentos[alfabeticamente_menor],
    medicamentos[i]

print(medicamentos)  
