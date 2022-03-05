lista = ['CANDESARTAN HIDROCLOROTIAZIDA ALTER', 'CARBAMAZEPINA NORMON', 'CARBAMAZEPINA NORMON', 'MATRIF', 'ACICLOVIR SANDOZ', 'ACICLOVIR SANDOZ', 'MELOXICAM', 'FENDIVIA', 'SEBUMSELEN']
def divide(x):
    if len(x) == 1:
        return x[0]

    mitad = int((len(x))//2)
    mitad1 = x[:mitad:]
    mitad2 = x[mitad::]

    z =  divide(mitad1)
    k = divide(mitad2)
    if z < k:
        return z
    else:
        return k

print(divide(lista))
