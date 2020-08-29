line = input().split()

a, b = line

if int(a) < -100 or int(b) < -100 or int(a) > 100 or int(b) > 100:
    print("Solo se aceptan valores entre -100 y 100")
else:
    resultado = int(a) + int(b)
    print("Resultado =", resultado)
