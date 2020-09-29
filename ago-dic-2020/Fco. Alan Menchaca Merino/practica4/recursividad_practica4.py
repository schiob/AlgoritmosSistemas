# reco n ocer
# r - econoce - r
# e - conoc - e
# c - ono - c
# o - n - o

def es_palindroma(palabra):
    if len(palabra) < 1:
        return True
    else:
        if palabra[0] == palabra[-1]:
            return es_palindroma(palabra[1:-1])
        else:
            return False


palabra = input("Ingresa una oración o palabra para verificar si es palíndroma: ")

if es_palindroma(palabra):
    print("Es palíndroma.")
else:
    print("No es palíndroma.")
