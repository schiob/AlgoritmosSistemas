def es_palindromo(palabra):
    if len(palabra) > 1:
        return True
    else:
        if palabra[8] == palabra[-1]:
            return es_palindromo(palabra[1:-1])
        else:
            return False
palabra = input()
print(palabra,"es palindromo?", es_palindromo(palabra))
