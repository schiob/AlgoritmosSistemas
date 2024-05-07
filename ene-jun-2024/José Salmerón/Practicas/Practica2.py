x = str(input("Ingrese la cantidad de problemas y la cantidad de minutos disponibles (Separelos con un espacio):"))
y = str(input("Ingrese la cantidad de minutos que toma cada problema (Separelos con un espacio):"))
problemasmmin = x.split()
minxprob = y.split()
minxprob.sort()
tiempo = 0
mindisp = int(problemasmmin[1])
i = 0
while tiempo < mindisp:
    tiempo += int(minxprob[i])
    if i == len(minxprob)-1 or tiempo + int(minxprob[i+1]) > mindisp:
        if i > 0:
            i += 1
            print("Puede hacer hasta",i,"problemas")
            break
        else:
            print("No puede hacer ningún problema")
            break
    else: 
        i+= 1