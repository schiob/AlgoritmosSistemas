print("Hola, una disculpa con la tardanza, me estaba peleando con el commit >:v")

primernumero = int(input("Ingrese por favor el primer valor: "))
segundonumero = int(input("Ingrese por favor el segundo valor: "))

if primernumero < -100:
    primernumero = -100

if segundonumero > 100:
    segundonumero = 100

print(primernumero, "+", segundonumero, "=", primernumero + segundonumero)
