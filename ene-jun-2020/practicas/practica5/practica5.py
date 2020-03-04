num = int(input("personas a concursar"))

persona =[]
for i in range(num):
    print(i+1,"persona y sus 3 tipos de medallas")
    lista =input().split()

    nombre = lista[0]
    oro =int (lista[1])
    plata= int(lista[2])
    cobre = int(lista[3])
    pelicula.append([nombre,oro,plata,cobre])
    pass

print()

for x in range(num):
    print(persona[x])
    pass

for i in range(num):
    temp=persona[i]
    for j in range(num-i-1):
        temp2 = persona[j]

        if temp2[1] > temp[1] :
            persona[j],persona[j+1] = persona[j+1],persona[j]

        elif temp2[1] == temp[1]:
            if temp2[2] > temp[2]:
                persona[j],persona[j+1] = persona[j+1],persona[j]

            elif temp2[2] == temp[2]:
                if temp2[3] > temp[3]:
                    
                    persona[j],persona[j+1] = persona[j+1],persona[j]
                elif temp2[3] == temp[3]:
                    if temp2[0] < temp[0]:
                        persona[j],persona[j+1] = persona[j+1],persona[j]
                        pass

                    pass
                pass

            pass
        pass        
            
    pass
    
print ("")
for x in range(num):
    print(persona[x])
    pass                   
