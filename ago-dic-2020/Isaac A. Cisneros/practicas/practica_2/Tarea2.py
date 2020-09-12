x=input().split() 
y=input().split() 
n,m=x
cont=0
sumtime=0
for i in range(1, len(y)):
    actual=y[i]
    indice=i
    while indice>0 and y[indice-1]>actual:
    y[indice]= y[indice-1]
    indice = indice-1
    y[indice]= actual

    for i in range(0, len(y)):
        sumtime += int(y[i])
        if(sumtime <= int(m)):
            cont += 1
            else:
                print(cont)
                break