class pelicula():
    def __init__(self, nombre, hrs, min):
        self.nombre = nombre
        self.hrs = hrs
        self.min = min

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getHrs(self):
        return self.hrs

    def setHrs(self, hrs):
        self.hrs = hrs

    def getMin(self):
        return self.min

    def setMin(self, min):
        self.min = min

    def sumaHrsMin(self,hrs, min):
        suma = hrs + min
        return suma

    def __str__(self):
        return f"Pelicula -> {self.nombre} Duración -> {self.hrs}:{self.min}"