class Examen:
    def mayormenor(self, Nombres):
        for i in range(0, len(Nombres)):
            actual = Nombres[i]
            #comparar con todos los anteriores
            #para encontrar el lugar
            idx_final = 0
            for j in reversed(range(0, i)):
                if  len(Nombres[j]) < len(actual):
                    Nombres[j+1] = Nombres[j]
                else:
                    idx_final = j+1
                    break
            Nombres[idx_final] = actual

        for n in Nombres:
            print(n, end=" ")




dinoNombres = ["Parasaurolophus", "Oviraptor", "Minmi", "Troodon", "Wannanosaurus"]

dino = Examen()
dino.mayormenor(dinoNombres)
