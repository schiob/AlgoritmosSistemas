def Mergesort(peliculas):
    if len(peliculas) > 1:
        # divido
        middle = len(peliculas) // 2
        left = peliculas[:middle]
        right = peliculas[middle:]

        # resuelvo
        new_left = Mergesort(left)
        new_right = Mergesort(right)

        # junto la solucion
        new_arr = Merge(new_left, new_right)
        return new_arr

    return peliculas


def Merge(left, right):
    arr = [0] * (len(left) + len(right))

    arr_app = 0
    l_app = 0
    r_app = 0

    while l_app < len(left) and r_app < len(right):
        if int([l_app][1] < right[r_app][0]):
            arr[arr_app] = left[l_app]
            arr_app += 1
            l_app += 1

        else:
            arr[arr_app] = right[r_app]
            arr_app += 1
            r_app += 1

    while l_app < len(left):
        arr[arr_app] = left[l_app]
        arr_app += 1
        l_app += 1

    while r_app < len(right):
        arr[arr_app] = right[r_app]
        arr_app += 1
        r_app += 1

    return arr

n=int (input("INFRESA NÚMERO DE PELICCULAS"))
peliculas=input("nombre de la pelicula y la hora".split())



for i in range(len(peliculas)):
    print(peliculas[0]," ")

    print(peliculas)
    Mergesort(peliculas)
    print("peliculas ordenadas", end="\n")


