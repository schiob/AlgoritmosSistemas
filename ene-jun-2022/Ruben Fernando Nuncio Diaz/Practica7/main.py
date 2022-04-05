lst = []
n = int(input())

for i in range(0, n):
    elementos = [input(), input()]
    lst.append(elementos)

def ordenarPalabras():
    length = len(lst)
    i = 1
    end = lst[0]
    while i < length:
        if lst[i] < end:
            x = lst.pop(i)
            for j in range(0, i):
                if x < lst[j]:
                    lst.insert(j, x)
                    break
                        end = lst[i]
        i += 1
        return lst


ordenarPalabras()
#las palabras al momento de insertarlas aparecen verticalmente en vez de horizontalmente
#me confundí a la hora de intentar ordenarlo alfabéticamente
