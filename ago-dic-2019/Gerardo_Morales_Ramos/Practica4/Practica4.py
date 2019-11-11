def Palindrome(word):
    if len(word) < 2:
        return True
    if word[0] != word[-1]:
        return False
    return Palindrome(word[1:-1])


word = input()

if Palindrome(word) == True:
    print("Si es")
else:
    print("No es")