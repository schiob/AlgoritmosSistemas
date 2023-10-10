import random;

def margeSort(arr):
    if len(arr)==1:
        return arr
    
    #Divider el probelma en sub problemas
    middle = len(arr)//2
    arrIzq = arr[:middle]
    arrDer = arr[middle:]

    #Resolver de forma recursiva 
    izqOrdenado = margeSort(arrIzq)
    derOrdenado = margeSort(arrDer)

    #Junta ambas partes 
    finalOrdenado = Junta(izqOrdenado, derOrdenado)
    return finalOrdenado

def Junta(izq, der):
    res=[]
    apu_izq = 0
    apu_der = 0 
    while (apu_izq < len(izq) and apu_der < len(der)):
        if izq(apu_izq < der(apu_der)):
            res.append(izq(apu_izq))
            apu_izq += 1
        else:
            res.append(der(apu_der))
            apu_der +=1

    while apu_izq < len(izq):
        res.append(izq(apu_izq))
        apu_izq +=1
    
    while apu_der < len(der):
        res.append(der(apu_der))
        apu_der +=1
    return res




