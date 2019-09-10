l = [ ]

p = int(input("Cuantos numeros?\t"))
for i in range(p): 
    u = int(input())
    if u%2 == 0:
        l.append(str(u))
l.reverse()
print(' '.join(l))
    