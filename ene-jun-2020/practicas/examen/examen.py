num = int(input("maraton de peliculas"))

pelicula =[]
for i in range(num):
    print(i+1,"duraccion de pelicula")
    lista =input().split()

    nombre = lista[0]
    hora =int (lista[1])
    minuto= int(lista[2])
    pelicula.append([nombre,hora,minuto])
    pass

print()

for x in range(num):
    print(pelicula[x])
    

for i in range(num):
    temp=pelicula[i]
    for j in range(num-i-1):
        temp2 = pelicula[j]

        if temp2[1] > temp[1] :
            pelicula[j],pelicula[j+1] = pelicula[j+1],pelicula[j]

        elif temp2[1] == temp[1]:
            if temp2[2] > temp[2]:
                pelicula[j],pelicula[j+1] = pelicula[j+1],pelicula[j]

            elif temp2[2] == temp[2]:
                if temp2[0] > temp[0]:
                    
                    pelicula[j],pelicula[j+1] = pelicula[j+1],pelicula[j]
                elif temp2[0] == temp[0]:
                    if temp2[0] > temp[0]:
                    
                        pelicula[j],pelicula[j+1] = pelicula[j+1],pelicula[j]
                    pass
                pass

            pass
        pass        
            
    pass
    
print ("")
for x in range(num):
    print(pelicula[x])
    pass                   

 