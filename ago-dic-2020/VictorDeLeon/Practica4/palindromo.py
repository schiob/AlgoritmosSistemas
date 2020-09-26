palabra = input()
cont = 0
palab = 0
for i in reversed(range(0, len(palabra))):
    if palabra[i].lower() == palabra[cont].lower():
        palab += 1
        cont += 1
        
if len(palabra) == palab:
            print("El texto es palindromo!")
else:
            print("no es un palindromo")
