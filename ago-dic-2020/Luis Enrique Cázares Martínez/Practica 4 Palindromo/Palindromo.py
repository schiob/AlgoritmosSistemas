def palindromo(palindromo):
    palindromo = palindromo.replace(" ", "")
    if palindromo.lower() == palindromo[::-1].lower():
        return print("Si es una palabra palindrosisisima")
    else:
        return print("No es una palabra palindrosisisima")
 
cadena = input("Echate una palabra o frasse palidrosisisisma ploxs: ")
palindromo(cadena)
