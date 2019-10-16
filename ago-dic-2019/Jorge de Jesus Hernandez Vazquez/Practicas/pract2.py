prob, mins = map(int, input("Ingresa num de problemas y min que se tienen: ").split())
L=  list(map(int, input("Ingrese el num de minutos de cada problema: ").split()))

for i in range (1, len(L)):
    val= L[i]
    j = i-1
    while j >=0 and val < L[j]:
        L[j+1] = L[j]
        j = j-1  
        L[j+1] = val
c = 0
for i in range(prob):
        if mins >= L[i] and mins>=0:
                c+=1 
                mins -=L[i]
print(c)