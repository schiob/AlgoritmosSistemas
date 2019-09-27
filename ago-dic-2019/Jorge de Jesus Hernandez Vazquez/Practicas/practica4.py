strng = input("give me the word:  ")
def Palindrumus(word):
    if len(word) <= 1:
        return True
    else:
        return (word[0] == word[-1]) * Palindrumus(word[1:-1])

if(Palindrumus(strng) == True):
    print("Si es")
else:
    print("No es")