lista=["Parasaurolophus","Oviraptor","Minmi","Troodon","Wannanosaurus", "brontosaurio","toñorex","ferraptor"]

for i in range (1,len(lista)):
    temp = lista[i]
    j=i-1
    while j>=0 and len(temp)<len(lista[j]):
        lista[j+1]=lista[j]
        j=j-1
    lista[j+1]=temp
print(lista)