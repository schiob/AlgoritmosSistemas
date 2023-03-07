class Examen:

    def mayorduracion(self, peliculas):
        mid = len(peliculas)//2
        sub_array1 = peliculas[0:mid]
        sub_array2 = peliculas[mid:len(peliculas)]
        x=0
        while(x < len(peliculas)):
            print(peliculas[0][0])
            x+=1
peliculas = [["StarWars", 2, 1], ["Alien", 1, 57], ["ASpaceOdyssey", 2, 41], ["Matrix", 2, 30], ["BladeRunner", 1, 57]]

dino = Examen()
dino.mayorduracion(peliculas )