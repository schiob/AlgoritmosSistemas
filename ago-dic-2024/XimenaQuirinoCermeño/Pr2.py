class GMedicamentos:
    def __init__(self, nombre, numero):
        self.nombre = nombre
        self.numero = numero
    def __repr__(self):
        return f"{self.nombre} {self.numero}"
def selection_sort(Medi):
    # Recorre toda la lista
    for i in range(len(Medi)):
        # Acomoda segun su numero asignado
        max_idx = i
        for j in range(i, len(Medi)):
            if Medi[j].numero > Medi[max_idx].numero:
                max_idx = j
        # Intercambia el Medicamento con el menor numero con el mayor numero no ordenado
        Medi[i], Medi[max_idx] = Medi[max_idx], Medi[i]
# Lista de Medicamentos
Medicamentos = [
    GMedicamentos("Naproxeno", 10),
    GMedicamentos("Paracetamol", 5),
    GMedicamentos("Rimantadia", 20),
    GMedicamentos("Azitromancina", 15),
    GMedicamentos("Ibuprofeno", 8)
]
# Ordenar la lista por (de mayor a menor)
selection_sort(Medicamentos)
# Imprimir la lista ordenada
for M in Medicamentos:
    print(Medicamentos)