def espalindromo(word):
    if len(word)<=1:
        return True
    else:
        return word[0]== word[-1] and espalindromo(word[1:-1])
word=input("palabra")
print(espalindromo(word))