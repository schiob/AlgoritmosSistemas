
numeros = input("Dame dos numeros separados por espacio pliz: ")
listanumeros = numeros.split(" ")
x = int(listanumeros[0])
y = int(listanumeros[1])

if (x >= -100 and y <= 100):
    print(f"Los parametros de 'x' y 'y' son correctos\nLa suma de ambos es {x + y}")