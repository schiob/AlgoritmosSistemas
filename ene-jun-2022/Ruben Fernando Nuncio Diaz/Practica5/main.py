total_masos,total_cartas = input().split
for i in range(total_masos):
    for j in range(total_cartas):
        i , j = input().split()


def ordenarcartas():
    #hay que acceder a las propiedades de la carta
    for i in range(total_masos):
        for j in range(total_cartas):
            print(i,j)

ordenarcartas()