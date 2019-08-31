l = [ ]
p = int(input("Cuantos numeros?"))
for i in range(p): 
    u = int(input())
    if u%2 == 0:
        l.append(u)
l.sort(reverse=True)
print(l)
    
        
    