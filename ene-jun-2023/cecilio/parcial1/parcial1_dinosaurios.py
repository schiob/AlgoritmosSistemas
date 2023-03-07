def acomodar(STDIN):
    for i in range(1, len(STDIN)):
        palabra = STDIN[i]
        j = i-1
        while j >= 0 and len(palabra) > len(STDIN[j]):
            STDIN[j + 1] = STDIN[j]
            j -= 1
        STDIN[j + 1] = palabra
    return STDIN

dinos = ["Parasaurolophus","Oviraptor","Minmi","Troodon","Wannanosaurus"]
n = len(dinos)
dinos = acomodar(dinos)
for STDOUT in dinos:
    print(STDOUT,end="-")