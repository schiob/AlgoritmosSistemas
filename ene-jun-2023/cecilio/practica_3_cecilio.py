def acomodar(STDIN):
    for i in range(1, len(STDIN)):
        palabra = STDIN[i]
        j = i-1
        while j >= 0 and len(palabra) < len(STDIN[j]):
            STDIN[j + 1] = STDIN[j]
            j -= 1
        STDIN[j + 1] = palabra
    return STDIN

medi = ["CANDESARTAN HIDROCLOROTIAZIDA ALTER","CARBAMAZEPINA NORMON","MATRIF","ACICLOVIR SANDOZ","MELOXICAM","FENDIVIA","SEBUMSELEN"]
n = len(medi)
medi = acomodar(medi)
for STDOUT in medi:
    print(STDOUT)