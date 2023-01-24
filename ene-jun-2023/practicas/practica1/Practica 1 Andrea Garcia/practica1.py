def maind():
    inp = input('dame los numeros:')

    espacio = inp.index(' ')
    num1 = ''; num2 = ''

    num1 = inp [:espacio]
    num2 = inp [espacio:]

    return "suma = ", (int(num1)+int(num2))

print (maind())