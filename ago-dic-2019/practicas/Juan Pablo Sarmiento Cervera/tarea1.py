print("ingrese 20 numeros")
lista = []
for i in range(20):
    numero = int(input())
    if numero%2 ==0:
        lista.append(numero)
lista.reverse()
for i in lista:
    print (i)
print("adios")