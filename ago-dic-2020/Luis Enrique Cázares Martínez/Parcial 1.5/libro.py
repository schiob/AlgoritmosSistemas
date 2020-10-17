class libro():
    def __init__(self, nombre, paginas):
        self.nombre = nombre
        self.paginas = paginas

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getPaginas(self):
        return self.paginas

    def setPaginas(self, paginas):
        self.paginas = paginas;

    def __str__(self):
        return f"Libro -> {self.nombre} Paginas -> {self.paginas}"