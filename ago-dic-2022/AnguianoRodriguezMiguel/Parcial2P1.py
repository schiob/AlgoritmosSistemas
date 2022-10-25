def binarySearch(arr, x):
    l = 0
    r = len(arr)
    while (l <= r):
        m = l + ((r - l) // 2)

        res = (x == arr[m])

        if (res == 0):
            return m - 1

        if (res > 0):
            l = m + 1

        else:
            r = m - 1

    return -1


if __name__ == "__main__":

    arr = ['Calculo2Deitel','CalculoForDummies','AlgebraLineal','TeoríaDeNúmeros','TheMangaGuideToCalculus']
    x = 'CalculoForDummies'
    result = binarySearch(arr, x)
    if (result == -1):
        print(-1)
    else:
        print('La palabra se encuentra en la posicion: ',result+1)