H = int(input())
for i in range(H):
    carta = {"A":1, "2":2, "3":3, "4":4, "5":5, "6":6, "7":7, "8":8, "9":9, "T":10, "J":11, "Q":12, "K":13}
    palo = {"S":1, "H":2, "C":3, "D":4}
    N = input().split()
    mano=N[1:]
    for i in range(len(mano)):
        xmin = i
        for j in range(i+1, len(mano)):
            x, y = mano[j], mano[xmin]
            if carta[x[0]] < carta[y[0]]:
                xmin = j

            if carta[x[0]] == carta[y[0]]:
                if palo[x[1]] < palo[y[1]]:
                    xmin = j

        mano[xmin], mano[i] = mano[i], mano[xmin]
    print(' '.join(mano))