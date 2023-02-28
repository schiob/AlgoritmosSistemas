import sys

stdin_fileno = sys.stdin
stdout_fileno = sys.stdout

listed = []
completeList = []

for line in stdin_fileno:

    listed.append(line.strip())

    #Entra al ingresar la cantidad de lineas indicadas al principio
    if len(listed) > 0 and len(listed)-1  == int(listed[0]):

        #Eliminar el primer elemento, el cual solo indica cuantas lineas ingresaremos
        listed.pop(0)
        
        #Recorrer cada linea ingresado
        for ele in listed:
            intedList = []
            finalList = []
            element = ele.split(' ')
            element.pop(0)

            
            for i in range(len(element)):
                
                converted = element[i]
                
                #Convertir cada numero especial (As, T, Jack, Queen, King) a puros numeros para mejor orenamiento
                if(element[i][0] == 'A'):
                    converted = '1'+ element[i][1]
                
                if(element[i][0] == 'T'):
                    converted = '10'+ element[i][1]

                if(element[i][0] == 'J'):
                    converted = '11'+ element[i][1]

                if(element[i][0] == 'Q'):
                    converted = '12'+ element[i][1]

                if(element[i][0] == 'K'):
                    converted = '13'+ element[i][1]

                #Igualmente, convertir cada palo (espada, corazon, trebol, diamante) a numeros para mejor orenamiento
                if(element[i][len(element[i])-1] == 'E'):
                    intedList.append(int(converted.replace('E', '1')))
                if(element[i][len(element[i])-1] == 'C'):
                    intedList.append(int(converted.replace('C', '2')))
                if(element[i][len(element[i])-1] == 'T'):
                    intedList.append(int(converted.replace('T', '3')))
                if(element[i][len(element[i])-1] == 'D'):
                    intedList.append(int(converted.replace('D', '4')))


            n = len(intedList)

            #Con cada elemento convertido anumerico, ordenar de menor a mayor
            for i in range(n):

                for j in range(0, n-i-1):
            
                        # Swap if current element is greater than next
                        if intedList[j] > intedList[j+1]:
                            intedList[j], intedList[j+1] = intedList[j+1], intedList[j] 

            #Regresar cada elemento a string
            list_string = list(map(str, intedList))

            #Regresar los respectivos valores de numero de carta especial y de palo
            for i in range(len(list_string)):
                converted = list_string[i]
                
                if(list_string[i][0] == '1' and len(list_string[i]) == 2):
                    converted = 'A'+ list_string[i][1]

                if(list_string[i][1] == '0' and len(list_string[i]) == 3):
                    converted = 'T'+ list_string[i][2]

                if(list_string[i][1] == '1' and len(list_string[i]) == 3):
                    converted = 'J'+ list_string[i][2]

                if(list_string[i][1] == '2' and len(list_string[i]) == 3):
                    converted = 'Q'+ list_string[i][2]

                if(list_string[i][1] == '3' and len(list_string[i]) == 3):
                    converted = 'K'+ list_string[i][2]


                if(list_string[i][len(list_string[i])-1] == '1'):
                    finalList.append(converted[:-1] + 'E')
                if(list_string[i][len(list_string[i])-1] == '2'):
                    finalList.append(converted[:-1] + 'C')
                if(list_string[i][len(list_string[i])-1] == '3'):
                    finalList.append(converted[:-1] + 'T')
                if(list_string[i][len(list_string[i])-1] == '4'):
                    finalList.append(converted[:-1] + 'D')

            for elem in finalList:
            # imprimir
                stdout_fileno.write(elem + ' ') 
            stdout_fileno.write( '\n')
        

        #termina el programa
        exit(0)


