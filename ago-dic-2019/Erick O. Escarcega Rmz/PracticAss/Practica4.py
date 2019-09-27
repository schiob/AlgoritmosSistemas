string = input("Dame la palabra mijo:  ")
def esPal(x):
    if len(x) < 2:
        return True
    if x[0] != x[-1]:
        return False
    return esPal(x[1:-1])
if (esPal(string) == True):
    print("Es palindromo")
else:
    print("No es Palindromo")