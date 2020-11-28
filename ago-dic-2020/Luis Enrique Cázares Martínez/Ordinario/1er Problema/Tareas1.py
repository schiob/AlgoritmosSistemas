class tarea():
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getPeso(self):
        return self.peso

    def setPeso(self, peso):
        self.peso = peso


    def __str__(self):
        return f"Tarea -> {self.nombre}"