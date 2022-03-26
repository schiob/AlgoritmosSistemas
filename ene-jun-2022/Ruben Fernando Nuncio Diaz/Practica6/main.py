arrayPersona = []
totalPersonas = int(input())
for i in range(totalPersonas):
    persona = i.split(" ")
    arrayPersona.append(persona)

    #no me aparece en los parentesis de la funcion
    #no me aparece todos solo el del final
    #como hacer que se junte el sort con lo que hay que infgresar


def selection_sort(array):
    #no agarra el arrayPersona la funcións
    #habría que solo agarrar [:1]
    #quizá serviría hacer otro array
    #hacer algo para ordenarllo pero que respete los for

    for i in range(len(array)-1):
        print(array)
        minimo = array[i]
        minimo_index = i
        for j in range(i+1, len(array)):
            if array[j] < minimo:
                minimo = array[j]
                minimo_index = j
        if minimo_index != i:
            array[minimo_index], array[i] = array[i], array[minimo_index]
    return (array)


