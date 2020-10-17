def merge(libro):
    mid = len(libro)//2

    if len(libro) > 1:
        L = libro[mid:]
        R = libro[:mid]

        libro.clear()

        merge(L)
        merge(R)

        while len(L) > 0 and len(R) > 0:
            if L[0].getPaginas() < R[0].getPaginas():
                libro.append(L.pop(0))
            else:
                libro.append(R.pop(0))

        while len(L) > 0:
            libro.append(L.pop(0))

        while len(R) > 0:
            libro.append(R.pop(0))


    return libro