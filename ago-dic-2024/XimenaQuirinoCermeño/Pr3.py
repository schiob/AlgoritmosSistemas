class Medicamentos:
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
            if Medi[j].numero < Medi[max_idx].numero:
                max_idx = j
        # Intercambia el Medicamento con el mayor numero con el menor numero no ordenado
        Medi[i], Medi[max_idx] = Medi[max_idx], Medi[i]
# Lista de Medicamentos
Medicamentos = [
    Medicamentos("Naproxeno", 3),
    Medicamentos("Paracetamol", 4),
    Medicamentos("Rimantadia", 5),
    Medicamentos("Azitromancina", 1),
    Medicamentos("Ibuprofeno", 2)
]
# Ordenar la lista por (de menor a mayor)
selection_sort(Medicamentos)
# Imprimir la lista ordenada
for Med in Medicamentos:
    print(Medicamentos)
