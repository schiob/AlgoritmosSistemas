Kenny=[0,5,6,14,10,1,8,7,9,6,3,4,20]
print(Kenny)

for i in range(1, len(Kenny)):
    Muerto = Kenny[i]
    j = i-1
    while j >= 0:
        Diferencia=Kenny[j]
        if Muerto < Diferencia:
            Kenny[j+1] = Diferencia
        else:
            break

        j-=1

    Kenny[j+1]=Muerto
print(Kenny)

def Contar(x,y):
    L=0
    Sum=0
    while L<x and Sum<y:
        Sum=Sum+Kenny[L]
        L+=1

    print(Sum)

Contar(10,6)