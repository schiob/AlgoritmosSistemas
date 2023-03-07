Dinosaurios=["Parasaurolophus", "Oviraptor", "Minmi", "Troodon", "Wannanosaurus"]
print(Dinosaurios)

if __name__ == "__main__":
    for i in range(0, len(Dinosaurios)): #recorrer el arreglo
        actual=Dinosaurios[i] #Posicion actual
        final=0
        for j in reversed(range(0,i)): #Recorrer desde la posicion actual a cero
            if len(Dinosaurios[j])<len(actual):
                Dinosaurios[j+1]=Dinosaurios[j] #intercambiar el mayor a la posicion actual
            else:
                final=j+1
                break
        Dinosaurios[final]=actual

print(Dinosaurios)