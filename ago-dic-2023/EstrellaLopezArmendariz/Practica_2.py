entrada = "10 6"
enteros = "4 2 3 7 5 1 2 1 3 2"

entrada = [int(x) for x in entrada.split()]
enteros = [int(x) for x in enteros.split()]

for i in range(1,len(enteros)):
    valor_posicion=enteros[i]
    j=i-1
    while j>=0 and valor_posicion<enteros[j]:
        enteros[j+1]=enteros[j]
        j-=1
    enteros[j+1]=valor_posicion

m=entrada[1]
problemas=0
minutos=0

for tiempo in enteros:
    if minutos+tiempo<= m:
        problemas+=1
        minutos+=tiempo

print(problemas)