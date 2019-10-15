Dinos = ['Parasaurolophus', 'Oviraptor', 'Minmi', 'Troodon', 'Wannanosaurus']
for i in range(0, len(Dinos)):
    tmp = Dinos[i]
    j = i-1
   
    while (j>-1 and Dinos[j] > tmp):
        Dinos[j+1] = Dinos[j] 
        j = j-1
        Dinos[j+1] = tmp

print(Dinos)